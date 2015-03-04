package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierUndertakeInfoBiz_A {

	/**
	 * �õ��Եĳн�����Ϣ
	 * @param duierId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierUndertakeInfoByDuierId(BigInteger duierId);
	/**
	 * ���ڻ�ȡ����н����û���Ϣ�б�
	 * @param duierId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierUndertakeListByDuierId(BigInteger duierId);
	/**
	 * ָ���ѵĳн���
	 * @param duierId ������
	 * @param userId �û�����
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject appointDuierUnertakeByduierIdAndUserId(BigInteger duierId,int userId);
	/**
	 * ���һ����ѡ��Ϣ
	 * @param duierId ������
	 * @param userId �û�����
	 * @param affair ����
	 * @param fee ����
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject addDuierUndertakeInfo(BigInteger duierId,int userId,String affair,float fee);
}
