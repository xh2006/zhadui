package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.DuierClassImage;

public interface AdBiz_bg {

	/**
	 * ����б�
	 * @return List<DuierClassImage>
	 * @author wang.xr
	 */
	public List<DuierClassImage> getAdList();
	/**
	 * ��ӹ����Ϣ
	 * @param imageType ͼƬ����
	 * @param imageUrl ͼƬ����·��
	 * @param imageSummary ͼƬժҪ
	 * @param contentUrl ����ģ�屣��·��
	 * @author wang.xr
	 */
	public void addAd(int imageType,String imageUrl,String imageSummary,String contentUrl );
	/**
	 * ��������ɾ�����
	 * @param adId �������
	 * @author wang.xr
	 */
	public void deleteAd(int adId);
}
