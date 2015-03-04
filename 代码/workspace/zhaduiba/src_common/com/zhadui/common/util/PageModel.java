package com.zhadui.common.util;

import java.util.List;

@SuppressWarnings("rawtypes")
public class PageModel {

	private int currentPage;
	private int pageSize;
	private int totalPage;
	private int totalRecord;
	private List dataList;

	private PageModel() {
	}

	private PageModel(final int pageSize, final String page, final int totalRecord) {
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		setTotalPage();
		setCurrentPage(page);
	}

	public static PageModel newPageModel(final int pageSize, final String page,
			final int totalRecord) {
		return new PageModel(pageSize, page, totalRecord);
	}

	private void setCurrentPage(String page) {
		try {
			currentPage = Integer.parseInt(page);
		} catch (java.lang.NumberFormatException e) {
			// �����쳣����������ǰҳĬ��Ϊ1
			currentPage = 1;
		}
		// �����ǰҳС�ڵ�һҳʱ����ǰҳָ������ҳ
		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
	}

	private void setTotalPage() {
		if (totalRecord % pageSize == 0) {
			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	/*
	 * ��õ�ǰҳ
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/*
	 * �����ҳ��
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/*
	 * ��ÿ�ʼ����
	 */
	public int getStartRow() {
		return (currentPage - 1) * pageSize;
	}

	/*
	 * ��ý�����
	 */
	public int getEndRow() {
		return currentPage * pageSize;
	}

	/*
	 * ��÷�ҳ����
	 */
	public List getDataList() {
		return dataList;
	}

	/*
	 * ���÷�ҳ����
	 */
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	// ��ҳ
	public int getFirst() {
		return 1;
	}

	//
	// ��һҳ
	public int getPrevious() {
		return currentPage - 1;
	}

	//
	// // ��һҳ
	public int getNext() {
		return currentPage + 1;
	}

	//
	// // βҳ
	//
	public int getLast() {
		return totalPage;
	}
}
