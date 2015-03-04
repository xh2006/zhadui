package com.zhadui.bg.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClassImage;

public interface AdDao_bg {

	/**
	 * �õ����й���б�
	 * @return List<DuierClassImage>
	 * @author wang.xr
	 */
	public List<DuierClassImage> getDuierClassImageList();
	/**
	 * ���һ�������Ϣ
	 * @param duierClassImage ����
	 * @author wang.xr
	 */
	public void addDuierClassImage(DuierClassImage duierClassImage);
	/**
	 * ���������õ�һ��DuierClassImage����
	 * @param duierClassImageId ����
	 * @return DuierClassImage����
	 * @author wang.xr
	 */
	public DuierClassImage getDuierClassImageById(int duierClassImageId);
	/**
	 * ��������ɾ��һ�������Ϣ
	 * @param duierClassImageId ����
	 * @author wang.xr
	 */
	public void deleteDuierClassImageById(int duierClassImageId);
}
