package com.zhadui.android.biz;

import net.sf.json.JSONObject;

public interface AppInfoBiz_A {

	/**
	 * ���ݴ���汾�Ų�ѯ�Ƿ���Ҫ���²����ṩ��������
	 * @param versionCode ����汾��
	 * @return JSONObject{result:��check_ok����content:{is_need_update:true,url_apk:��http://192.168.1.1/zhaduier.apk��}}
	 * @author wang.xr
	 */
	public JSONObject getAppVersionAndDownload(int versionCode);
}
