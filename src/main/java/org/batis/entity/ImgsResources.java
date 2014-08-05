package org.batis.entity;

/**
 * 图片资源实体类
 * @author joshua
 * @date 2014-8-5
 * @version
 */
public class ImgsResources {
	
	/**
	 * ID
	 */
	private long id;
	/**
	 * 分类标识
	 */
	private int categoryType;
	/**
	 * 图片地址
	 */
	private String imgUrl;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
