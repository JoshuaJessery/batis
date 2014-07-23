package org.batis.entity;

import java.io.Serializable;

/**
 * 宠物种类
 * @author joshua
 * @date 2014-7-23
 * @version
 */
public class PetCategory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1324904216430733905L;
	private Long id;
	/**
	 * 种类 (猫科,犬科)
	 */
	private String category;
	/**
	 * 特点
	 */
	private String feature;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
}
