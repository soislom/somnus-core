package cn.lemon.core.enume;

/**
 * 接口操作枚举
 * 
 * @author 34305
 *
 */
public enum ResultEnum {

	LOGOUT(200, "注销成功"),
	LOGIN(20001, "登录成功"),
	ERROR(500, "操作失败"),
	SUCCESS(200, "操作成功");

	private int code;

	private String message;

	private ResultEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
