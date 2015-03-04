package com.zhadui.bg.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClass;

public interface DuierClassDao_bg {

	/**
	 * �������������б�
	 * @return List<DuierClass>
	 * @author wang.xr
	 */
	public List<DuierClass> getDuierClassList();
	/**
	 * ���һ���ѷ���
	 * @param duierClass ��������
	 * @author wang.xr
	 */
	public void addDuierClass(DuierClass duierClass);
	/**
	 * ͳ���������Ŀ
	 * @return int
	 * @author wang.xr
	 */
	public int getDuierClassCount();
	/**
	 * ���ݶ�������ȡһ������Ϣ
	 * @param duierClassId
	 * @return DuierClass
	 * @author wang.xr
	 */
	public DuierClass getDuierClassById(int duierClassId);
	/**
	 * ��������
	 * @param duierClass �������
	 * @author wang.xr
	 */
	public void updateDuierClass(DuierClass duierClass);
	/**
	 * ��������ɾ����
	 * @param duierClassId ����
	 * @author wang.xr
	 */
	public void deleteDuierClassById(int duierClassId);
	/**
	 * �޸Ķ��������ʾ˳��
	 * @param duierClassId ����������
	 * @param layer ˳��
	 * @author wang.xr
	 */
	public void updateDuierClassLayer(int duierClassId,int layer);
}
