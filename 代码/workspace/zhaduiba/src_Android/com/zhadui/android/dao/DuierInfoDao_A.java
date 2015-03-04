package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierInfo;

public interface DuierInfoDao_A {

	public List<DuierInfo> getDuierListByClassIdForLimit(Map<String,Integer> paramMap);
	public DuierInfo getDuierInfoById(BigInteger duierInfoId);
	/**
	 * ͳ���û����˶��ٶ�
	 * @param userId �û�����
	 * @return �ݶ�����
	 * @author wang.xr
	 */
	public int countDuierNumByUserId(int userId);
	/**
	 * ���ݹؼ��ּ������б�
	 * @param map �ؼ��ֲ���
	 * @return List<DuierInfo>
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public List<DuierInfo> searchDuierInfoByKeyWords(Map map);
	/**
	 * �޸Ķ�״̬���Ƿ��ѣ�
	 * @param map map��������Ŷ������Ͷ�״̬
	 * @return boolean
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public boolean updateDuierStatus(Map map);
	/**
	 * �޸ĶѸ���ʱ��
	 * @param map map����(updateTime,duierInfoId)
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void renewUpdateTime(Map map);
}
