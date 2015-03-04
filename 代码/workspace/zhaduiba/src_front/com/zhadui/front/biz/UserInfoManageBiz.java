package com.zhadui.front.biz;

import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserProfile;

public interface UserInfoManageBiz {
	
	// 返回Json字符串
	public String isExisted(String type, String value);
	
	/**
	 * @param phoneNumber
	 * @param password
	 * @return 成功返回1，失败返回0；
	 * @description 用户登录
	 */
	public UserInfo login(String phoneNumber, String password);
	
	/**
	 * @param phoneNumber
	 * @param password
	 * @return 成功返回1，失败返回0；
	 * @description 用户注册
	 */
	public int register(String phoneNumber, String password);
	
	/**
	 * 根据用户ID获得用户展示信息
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
