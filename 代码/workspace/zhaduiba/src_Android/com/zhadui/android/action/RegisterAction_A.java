package com.zhadui.android.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.UserInfoBiz_A;
import com.zhadui.common.util.GeneratRandomCode;

public class RegisterAction_A extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private String phoneNum;
	private String password;
	private String validCode;
	private UserInfoBiz_A userInfoBizA;
	public void setUserInfoBizA(UserInfoBiz_A userInfoBizA) {
		this.userInfoBizA = userInfoBizA;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	// ��ȡע����֤��
	public void android_loadValidCode() {
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element1 = cache.get(phoneNum);
		if (element1 == null) {
			String code = GeneratRandomCode.random(4);
			System.out.println("---------------������ɵ��ֻ���֤��:"+code);
			boolean flag=true;
			/*boolean flag = SendMessages.send(
					"����֤��ֻ����ע���˺ţ���֤���ṩ�����˻ᵼ����Ϣй¶��"+code+"[���Ѱ���֤��]���ٴ����ѣ�����ת��", phoneNum);*/
			if (flag) {
				Element element = new Element(phoneNum, code);
				cache.put(element);
				json.put("result", "check_ok");
				json.put("content", "��֤���ѳɹ����ͣ���ע�����");
			} else {
				json.put("result", "check_error");
				json.put("content", "��֤�뷢��ʧ�ܣ����Ժ�����");
			}
		}else{
			json.put("result", "check_error");
			json.put("content", "��֤���ѷ��ͣ��벻Ҫ�ظ�������֤��");
		}
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//ע��
	public void android_register(){
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element=cache.get(phoneNum);
		if(element!=null){
			String code=element.getValue().toString();
			System.out.println("-----------------------------code:"+element);
			System.out.println("-----------------------------code:"+element.getValue());
			if(validCode.equals(code)){
				cache.remove(phoneNum);
				json=userInfoBizA.registerUser(phoneNum, password);
			}else{
				json.put("result","check_fail");
				json.put("content","�ֻ���֤��������������������");
			}
		}else{
			json.put("result","check_fail");
			json.put("content","�ֻ���֤��������������������");
		}
		
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			
		}
		
	}
}
