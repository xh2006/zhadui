package com.zhadui.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONObject;

public class URLTools {

	/**
	 * @description ���ðٶ�API���ص�ַ��ʽ��JSON�ַ���
	 * @param lat γ��
	 * @param lon ����
	 * @return JSONObject
	 * @throws Exception
	 * @author wang.xr
	 */
	public static JSONObject getJsonDataByLatAndLon(String lat, String lon)
			throws Exception {
		//http://api.map.baidu.com/geocoder/v2/?ak=FwGWnwoopbSyx2v50SU95TjU&location=39.983424,116.322987&output=json
		URL url = new URL("http://api.map.baidu.com/geocoder/v2/?ak=FwGWnwoopbSyx2v50SU95TjU&location=" + lat
				+ "," + lon + "&output=json");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		InputStream inputStream = connection.getInputStream();
		// ��Ӧ���ַ�����ת��
		Reader reader = new InputStreamReader(inputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String str = null;
		StringBuffer sb = new StringBuffer();
		while ((str = bufferedReader.readLine()) != null) {
			sb.append(str);
		}
		reader.close();
		connection.disconnect();
		/* return sb.toString(); */
		JSONObject json = JSONObject.fromObject(sb.toString());
		return json;
	}

	/**
	 * @description ���ðٶ�API���ص�ַ��ʽ��JSON�ַ���
	 * @param lat γ��
	 * @param lng ����
	 * @return �ַ���
	 * @author wang.xr
	 */
	public static String getAddressByLatAndLng(String lat, String lng) {
		String address="";
		try {
			JSONObject json = URLTools.getJsonDataByLatAndLon(lat, lng);
			String strData=json.getString("result");
			JSONObject json1=JSONObject.fromObject(strData);
			address=json1.getString("formatted_address");
		} catch (Exception e) {
		}
		return address;
	}
}
