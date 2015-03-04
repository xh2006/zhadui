package com.zhadui.android.dao;

import java.util.Map;

import com.zhadui.common.entity.UserInfo;

public interface UserInfoDao_A {

	/**
	 * ���ݵ绰����������ȡ�û�����
	 * @param userInfo
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserByPhoneAndPwd(UserInfo userInfo);
	/**
	 * �����˻����������ȡ�û�����
	 * @param userInfo
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserByAcountAndPwd(UserInfo userInfo);
	/**
	 * ����������ȡһ���û�����
	 * @param Id
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserInfoById(int Id);
	/**
	 * ����һ���û���Ϣ������ȡ�����¼������
	 * @param UserInfo
	 * @return
	 * @author wang.xr
	 */
	public int insertUserAndGetUserId(UserInfo userInfo);
}
