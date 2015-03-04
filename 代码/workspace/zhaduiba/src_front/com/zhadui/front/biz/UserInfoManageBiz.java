package com.zhadui.front.biz;

import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserProfile;

public interface UserInfoManageBiz {
	
	// ����Json�ַ���
	public String isExisted(String type, String value);
	
	/**
	 * @param phoneNumber
	 * @param password
	 * @return �ɹ�����1��ʧ�ܷ���0��
	 * @description �û���¼
	 */
	public UserInfo login(String phoneNumber, String password);
	
	/**
	 * @param phoneNumber
	 * @param password
	 * @return �ɹ�����1��ʧ�ܷ���0��
	 * @description �û�ע��
	 */
	public int register(String phoneNumber, String password);
	
	/**
	 * �����û�ID����û�չʾ��Ϣ
	 * @param id
	 * @return
	 */
	public UserProfile getUserShowInfoByUserId(int id); 
	
	/**
	 * 
	 * @param nId
	 * @param headerImgUrl
	 */
	public void updateUserHeader(int nId, String headerImgUrl);
	
	public int completeProfile(UserProfile userProfile);
	public int modifyProfile();
	public void getProfile(int nId);

}
