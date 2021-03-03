package cn.lemon.core.util;

import java.util.UUID;

/**
 * 系统工具类
 * 
 * @author 34305
 *
 */
public class SystemUtil {

	/**
	 * 暂时使用UUID做token
	 * @return
	 */
	public static String getToken() {
		return UUID.randomUUID().toString().replaceAll("-", "").trim();
	}
	
}
