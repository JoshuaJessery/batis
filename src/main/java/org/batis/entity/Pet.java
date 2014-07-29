package org.batis.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 宠物类
 * @author joshua
 * @date 2014-7-23
 * @version
 */
@XmlRootElement
public class Pet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9135942537999434526L;

	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 别名
	 */
	private String aliases;
	
	/**
	 * 年龄
	 */
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAliases() {
		return aliases;
	}

	public void setAliases(String aliases) {
		this.aliases = aliases;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
