package org.batis.util.fb;

import org.batis.util.StringUtils;

public final class FBAccessToken {

	/**
	 * FaceBook 授权以后获取的accessToken
	 */
	public String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public static void tokenGeneration(String authorizationUrl) {
		if(StringUtils.isBlank(authorizationUrl)) {
			throw new IllegalArgumentException("authorizationUrl can't be null");
		}
		//URL fbAuthorizatiion = new URL(authorizationUrl);
	}
}
