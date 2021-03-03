package cn.lemon.core.enume;

public enum ErrorEnum {

	No_service("404", "网络异常，服务器熔断"), NETWORK_ERRO("500", "网络异常，请稍后重试"), NO_USER("40001", "用户不存在"),
	PASSWORD_ERROR("400002", "密码错误"), USER_FROZEN("40003", "用户已冻结");

	private String code;

	private String message;

	private ErrorEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
