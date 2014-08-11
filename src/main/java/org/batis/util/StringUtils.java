package org.batis.util;

public final class StringUtils {
	
	public static boolean isBlank(String str) {
		if(null == str || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
}
