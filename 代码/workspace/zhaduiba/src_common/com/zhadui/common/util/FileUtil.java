package com.zhadui.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

import org.apache.struts2.ServletActionContext;

public class FileUtil {
 
	/**
	 * 读取文件
	 * @param path 文件路径,从项目根目录开始
	 * @return String内容字符串
	 * @throws IOException
	 * @author wang.xr
	 */
	public static String readFile(String path) throws IOException{
		String resultStr="";
		//在本地测试环境下的目录
		//String filePath="../webapps/zhaduiba/"+path;
		//在甘交投环境下的目录
		String reapPath="/zhaduiba/";
		String filePath=reapPath+path;
		FileInputStream fis = new FileInputStream(filePath);
		InputStreamReader insReader = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(insReader);
		String templateContent = "";
		while ((templateContent = br.readLine()) != null){
			resultStr = resultStr + templateContent ;
		}
		fis.close();
		return resultStr;
	}
	/**
	 * 写文件
	 * @param filePath 文件路径
	 * @param content 内容
	 * @param fileName 文件名
	 * @throws IOException
	 * @author wang.xr
	 */
	public static void writeFile(String filePath,String content,String fileName) throws IOException{
		String htmlPath=ServletActionContext.getServletContext().getRealPath(filePath);
		File file=new File(new File(htmlPath),fileName);
		OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file),"UTF-8"); 
		BufferedWriter writer=new BufferedWriter(write);    
		writer.write(content); 
		writer.close(); 
	}
}
