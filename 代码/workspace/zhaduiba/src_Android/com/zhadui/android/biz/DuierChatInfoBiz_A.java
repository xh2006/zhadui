package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierChatInfoBiz_A {

	/**
	 * �õ�������б�
	 * @param duierId ������
	 * @param startNum ��ʼ��
	 * @param count ͳ�Ƽ�¼��
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierChatInfoListByDuierId(BigInteger duierId,int startNum,int count);
	/**
	 * ����
	 * @param duierId ������
	 * @param userId �û�����
	 * @param message ��������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject addMessage(BigInteger duierId,int userId,String message);
}
