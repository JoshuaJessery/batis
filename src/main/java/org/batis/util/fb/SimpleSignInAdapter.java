package org.batis.util.fb;

import org.batis.entity.User;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;
/**
 * 设定登录用户信息
 * @author joshua
 *
 */
public final class SimpleSignInAdapter implements SignInAdapter{

	public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
		long _userId = 0;
		try {
			_userId = Long.parseLong(userId);
		} catch (Exception e) {
			System.out.println("userId is not null or not a number!");
		}
		SecurityContext.setCurrentUser(new User(_userId));
		return null;
	}
}
