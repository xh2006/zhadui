package com.zhadui.android.biz;


import java.math.BigInteger;

import net.sf.json.JSONObject;


public interface DuierInfoBiz_A {

	/**
	 * ���ݶ�����ȡ���б���Ϣ
	 * @param classId ��������
	 * @param startNum ��¼��ʼ
	 * @param countNum ���Ҽ�¼��
	 * @param dstatus ��״̬
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierListByClassIdA(int classId,int startNum,int countNum,int dstatus);
	/**
	 * ����������ȡ����Ϣ
	 * @param duierInfoId ������
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierInfoById(BigInteger duierInfoId);
	/**
	 * ���ݹؼ��ּ������б���Ϣ
	 * @param keyWords �ؼ���
	 * @param startNum ��ʼ��ѯ��¼��
	 * @param count ��ѯ�ļ�¼��
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject searchDuierListByKey(String keyWords,int startNum,int count);
	/**
	 * �޸Ķ�״̬���Ƿ��ѣ�
	 * @param duierId ������
	 * @param duierStatus ��״̬
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject updateDuierStatus(BigInteger duierId,boolean duierStatus);
}
