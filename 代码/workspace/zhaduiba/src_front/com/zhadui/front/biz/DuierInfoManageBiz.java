package com.zhadui.front.biz;

import java.util.List;

import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierShowInfoBlock;

public interface DuierInfoManageBiz {
	/**
	 * 根据起始位置和条目数获得堆儿的展示信息
	 * @param nStart
	 * @param nItems
	 * @return
	 */
	public List<DuierShowInfoBlock> getDuierShowInfos(int nStart, int nItems);
	
	public List<DuierShowInfoBlock> getDuierShowInfos(int nClassId, int nStart, int nItems);
	
	/**
	 * 根据堆儿ID获得指定ID堆儿的交流信息 
	 */
	public List<DuierChatInfo> getDuierChatInfoByDuierId(int nId);
	
	/**
	 * 根据堆儿ID获得堆儿信息
	 */
	public DuierInfo getDuierInfoByDuierId(int nId);
	
	/**
	 * 堆儿留言
	 * @param duierChatInfo
	 */
	public void insertDuierChatInfo(DuierChatInfo duierChatInfo); 
	
	/**
	 * 垒堆儿
	 * @param duierInfo
	 */
	public void createDuier(DuierInfo duierInfo);
	
	
	public List<DuierClass> getDuierClass();
}
