package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierUndertakeInfo;

public interface DuierUndertakeInfoDao_A {

	/**
	 * ���ݶ�������ȡ�ѵĳн���
	 * @param duierId ������
	 * @return DuierUndertakeInfo
	 * @author wang.xr
	 */
	public DuierUndertakeInfo getDuierUnderTakeInfoByDuierId(BigInteger duierId);
	/**
	 * ���ݶ�������ȡ��Ҫ�нӶѵ��˵��б���Ϣ
	 * @param duierId ������
	 * @return List<DuierUndertakeInfo>
	 * @author wang.xr
	 */
	public List<DuierUndertakeInfo> getDuierUndertakeListByDuierId(BigInteger duierId);
	/**
	 * ָ���ѵĳн��ߣ��޸ĳнӳɹ������Ϣ
	 * @param map ��������Ŷ��������û�����
	 * @return boolean
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public boolean updateDuierUndertakeForAppoint(Map map);
	/**
	 * ���һ����ѡ��¼
	 * @param duierUndertakeInfo �н��˶���
	 * @return boolean
	 * @author wang.xr
	 */
	public boolean addDuierUndertake(DuierUndertakeInfo duierUndertakeInfo);
}
