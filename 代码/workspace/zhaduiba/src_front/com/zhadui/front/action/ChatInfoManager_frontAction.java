package com.zhadui.front.action;


import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

//import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.front.biz.DuierInfoManageBiz;
import com.zhadui.front.biz.DuierInfoOperationBiz;


@SuppressWarnings("serial")
public class ChatInfoManager_frontAction extends ActionSupport {
	private BigInteger duierId;
	private String comment;
	private int c_type;
	private DuierInfoManageBiz duierInfoManage;
	
	// ����
	public void comment(){
		
	}
	
	/**
	 * ��öѶ���������Ϣ
	 */
	public void getMoreDuierComment(){
		
	}
	
	public BigInteger getDuierId() {
		return duierId;
	}
	public void setDuierId(BigInteger duierId) {
		this.duierId = duierId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getC_type() {
		return c_type;
	}
	public void setC_type(int c_type) {
		this.c_type = c_type;
	}

	public DuierInfoManageBiz getDuierInfoManage() {
		return duierInfoManage;
	}

	public void setDuierInfoManage(DuierInfoManageBiz duierInfoManage) {
		this.duierInfoManage = duierInfoManage;
	}

}
