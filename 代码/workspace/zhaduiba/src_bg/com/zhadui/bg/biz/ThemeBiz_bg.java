package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.DuierClass;

public interface ThemeBiz_bg {

	/**
	 * ���������б�
	 * @return List<DuierClass>
	 * @author wang.xr
	 */
	public List<DuierClass> getAllThemes();
	/**
	 * ���һ������
	 * @author wang.xr
	 */
	public void addTheme(DuierClass duierClass);
	/**
	 * ����������ȡһ���������
	 * @param duierClassId
	 * @return DuierClass
	 * @author wang.xr
	 */
	public DuierClass getDuierClassById(int duierClassId);
	/**
	 * ��������
	 * @param duierClass ���������
	 * @author wang.xr
	 */
	public void updateDuierClass(DuierClass duierClass);
	/**
	 * ��������ɾ������
	 * @param themeId ��������
	 * @author wang.xr
	 */
	public void deleteThemeByThemeId(int themeId);
	/**
	 * ���ݴ��ݽ�����ID˳����������
	 * @param sortArray ����Id������
	 * @author wang.xr
	 */
	public void updateThemeSort(int[] sortArray);
}
