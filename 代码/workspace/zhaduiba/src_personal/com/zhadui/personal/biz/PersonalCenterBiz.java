package com.zhadui.personal.biz;

import java.util.List;

import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;

public interface PersonalCenterBiz {
	
	/**
	 * ����������ȡһ���û���Ϣ����ʾ����������
	 * @param userInfoId �û�����
	 * @return UserInfo
	 * @author wang.xr
	 */
	public UserInfo getUserInfoById(int userInfoId);
	/**
	 * ����������ȡ�û���ϸ��Ϣ
	 * @param UserinfoId �û�����
	 * @return UserInfoDetail
	 * @author wang.xr
	 */
	public UserInfoDetail getUserInfoDetailById(int UserinfoId);
	/**
	 * �����û�������ѯ�û������Ķ�
	 * @param userId �û�����
	 * @return List<DuierStatus>
	 * @author wang.xr
	 */
	public List<DuierStatus> getDuierStatusListByUserId(int userId);
	/**
	 * ͳ������������
	 * @param userId �û�����
	 * @return ����
	 * @author wang.xr
	 */
	public int countJoinedDuierByUserId(int userId);
	/**
	 * �����û�������ȡ�Դ����Ķ�
	 * @param userId �û�����
	 * @return List<DuierInfo>
	 * @author wang.xr
	 */
	public List<DuierInfo> getCreatedDuierListByUserId(int userId);
	/**
	 * ͳ�����ݶ�����
	 * @param userId �û�����
	 * @return ����
	 * @author wang.xr
	 */
	public int countCreatedDuierByUserId(int userId);
	/**
	 * �����û����������û��нӵĶ���Ϣ�б�
	 * @param userId �û�����
	 * @return List<DuierUndertakeInfo>
	 * @author wang.xr
	 */
	public List<DuierUndertakeInfo> getUndertakedDuierListByUserId(int userId);
	/**
	 * ͳ���ѳнӶ�����
	 * @param userId �û�����
	 * @return ����
	 * @author wang.xr
	 */
	public int countUndertakeredDuierByUserId(int userId);
	/**
	 * �޸��û���Ϣ
	 * @param userInfo
	 * @param userInfoDetail
	 * @author wang.xr
	 */
	public void updateUserInfo(UserInfo userInfo,UserInfoDetail userInfoDetail);
	/**
	 * �޸�����
	 * @param password ����
	 * @param userInfoId �û�����
	 * @author wang.xr
	 */
	public void updatePassword(String password,int userInfoId);
	/**
	 * �޸�����
	 * @param email ����
	 * @param userInfoId �û�����
	 * @author wang.xr
	 */
	public void updateEmail(String email,int userInfoId);
	/**
	 * �ж��ֻ������Ƿ��ѱ�ʹ��
	 * @param phone �ֻ�����
	 * @return
	 * @author wang.xr
	 */
	public boolean isExitPhone(String phone);
	/**
	 * �޸��ֻ�
	 * @param phone
	 * @param userInfoId
	 * @author wang.xr
	 */
	public void updatePhone(String phone,int userInfoId);
	/**
	 * �޸��û�ͷ��
	 * @param imagePath ͷ��洢·��
	 * @author wang.xr
	 */
	public void updateHeadImage(String imagePath,int userInfoId);
}
