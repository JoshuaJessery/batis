package org.batis.entity;
/**
 * 系统中所有分类实体
 * @author joshua
 * @date 2014-8-5
 * @version
 */
public class CategoryResources {
	
	/**
	 * 类别ID
	 */
	private long id;
	/**
	 * 类别标识
	 */
	private int type;
	/**
	 * 父类别标识
	 */
	private int parentType;
	/**
	 * 类别标题(宠物、花草)
	 */
	private String category;
	/**
	 * 类别描述
	 */
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getParentType() {
		return parentType;
	}
	public void setParentType(int parentType) {
		this.parentType = parentType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
