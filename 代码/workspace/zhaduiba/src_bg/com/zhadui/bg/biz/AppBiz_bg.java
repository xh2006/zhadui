package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.AppInfo;

public interface AppBiz_bg {

	/**
	 * ��ȡӦ����ʷ��Ϣ
	 * @return List<AppInfo>
	 * @author wang.xr
	 */
	public List<AppInfo> loadAppList();
	/**
	 * ɾ��Ӧ����Ϣ
	 * @param appId ����
	 * @author wang.xr
	 */
	public void deleteAppById(int appId);
	/**
	 * ���Ӧ����Ϣ
	 * @param appInfo Ӧ�ö���
	 * @author wang.xr
	 */
	public void addApp(AppInfo appInfo);
}
