package org.batis.util;


public final class PropertiesUtil {

	/**
	 * FaceBook 回调地址
	 */
	private String fbRedirectUrl;
	/**
	 * FaceBook APP ID
	 */
	private String fbAppId;
	/**
	 * FaceBook APP SECRET 
	 */
	private String fbAppSecret;
	/**
	 * 畅言 APP ID
	 */
	private String cyAppId;
	/**
	 * 畅言 APP KEY
	 */
	private String cyAppKey;
	
	public String getFbRedirectUrl() {
		return fbRedirectUrl;
	}
	public void setFbRedirectUrl(String fbRedirectUrl) {
		this.fbRedirectUrl = fbRedirectUrl;
	}
	public String getFbAppId() {
		return fbAppId;
	}
	public void setFbAppId(String fbAppId) {
		this.fbAppId = fbAppId;
	}
	public String getFbAppSecret() {
		return fbAppSecret;
	}
	public void setFbAppSecret(String fbAppSecret) {
		this.fbAppSecret = fbAppSecret;
	}
	public String getCyAppId() {
		return cyAppId;
	}
	public void setCyAppId(String cyAppId) {
		this.cyAppId = cyAppId;
	}
	public String getCyAppKey() {
		return cyAppKey;
	}
	public void setCyAppKey(String cyAppKey) {
		this.cyAppKey = cyAppKey;
	}
	
}
