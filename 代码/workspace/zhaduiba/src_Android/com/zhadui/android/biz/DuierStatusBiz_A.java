package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierStatusBiz_A {
	/**
	 * �ж��û��Ƿ��Ѿ�����
	 * @param userId �û�����
	 * @param duierId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userIfInWithUserIdAndDuierId(int userId,BigInteger duierId);
	/**
	 * ����
	 * @param userId �û�����
	 * @param duierId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userJoinDuier(int userId,BigInteger duierId);
	/**
	 * ȡ������
	 * @param userId �û�����
	 * @param duierId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userQuitDuier(int userId,BigInteger duierId); 
}
