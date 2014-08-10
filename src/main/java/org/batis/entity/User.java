package org.batis.entity;
/**
 * 用户实体类
 * @author joshua
 * @date 2014-8-5
 * @version
 */
public class User {
	/**
	 * ID
	 */
	private long id;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 头像icon
	 */
	private String icon;
	/**
	 * 性别
	 */
	private int sex;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 联系方式(电话号码或者邮箱)
	 */
	private String contact;
	
	public User(){}
	
	public User(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
