package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.Map;

import com.zhadui.common.entity.DuierStatus;

public interface DuierStatusDao_A {

	/**
	 * ͳ����������
	 * @param DId ������
	 * @return ��������
	 * @author wang.xr
	 */
	public int countParticipantByDId(BigInteger DId);
	@SuppressWarnings("rawtypes")
	/**
	 * �ж��û��Ƿ�������
	 * @param paramMap map����
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean userIfInDuier(Map paramMap);
	/**
	 * ����
	 * @param duierStatus
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean addDuierStatus(DuierStatus duierStatus);
	/**
	 * �޸Ķ�
	 * @param duierStatus
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean updateDuierStatus(DuierStatus duierStatus);
	/**
	 * �˳���
	 * @param duierStatusId
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean deleteDuierStatusById(int duierStatusId);
	/**
	 * �����û������Ͷ�������ȡ��״̬
	 * @param userId �û�����
	 * @param duierId ������
	 * @return DuierStatus����
	 * @author wang.xr
	 */
	public DuierStatus getDuierStatusByUIdAndDId(int userId,BigInteger duierId);
	/**
	 * �����û�����ͳ���û��Ѿ����ѵ�����
	 * @param userId �û�����
	 * @return �û����ѵ�����
	 * @author wang.xr
	 */
	public int countDuierNumByUId(int userId);
}
