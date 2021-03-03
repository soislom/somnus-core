package cn.lemon.core.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * 时间工具栏
 * @author 34305
 *
 */
public class DateUtil {
	
	private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
	
	public static Date getDate() {
		return new Date();
	}
	
	/**
	 * 获取时间戳
	 * @return
	 */
	public static long getTimestamp() {
		return System.currentTimeMillis();
	}
	
	/**
	 * 当前时间 to LocalDate
	 * @return
	 */
	public static LocalDate getLocalDate() {
		return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	/**
	 * 指定时间 to LocalDate
	 * @param date
	 * @return
	 */
	public static LocalDate dateToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	/**
	 * 当前时间 to String
	 * @return
	 */
	public static String dateToString() {
		return new SimpleDateFormat(DEFAULT_PATTERN).format(new Date());
	}
	
	/**
	 * 当前时间 To String
	 * @param pattern
	 * @return
	 */
	public static String dateToString(String pattern) {
		return new SimpleDateFormat(pattern).format(new Date());
	}
	
	/**
	 * 指定时间 to String
	 * @return
	 */
	public static String dateToString(Date date) {
		return new SimpleDateFormat(DEFAULT_PATTERN).format(date);
	}
	
	/**
	 * 指定时间 To String
	 * @param pattern
	 * @return
	 */
	public static String dateToString(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}
}
