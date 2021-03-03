package cn.lemon.core;

import cn.lemon.core.util.DateUtil;

/**
 * 接口数据
 * 
 * @author 34305
 *
 */
public class ResultData {

	/**
	 * 编码
	 */
	private int code;

	/**
	 * 消息
	 */
	private String message;

	/**
	 * 数据
	 */
	private Object data;

	/**
	 * 登录token
	 */
	private String token;

	/**
	 * 时间戳
	 */
	private long timestamp;

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public ResultData(int code, String message) {
		super();
		this.code = code;
		this.message = message;
		this.timestamp = DateUtil.getTimestamp();
	}

	public ResultData(int code, String message, Object data, String token) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		this.token = token;
		this.timestamp = DateUtil.getTimestamp();
	}

	public ResultData(int code, String message, String token) {
		super();
		this.code = code;
		this.message = message;
		this.token = token;
		this.timestamp = DateUtil.getTimestamp();
	}

	public ResultData() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultData other = (ResultData) obj;
		if (code != other.code)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (timestamp != other.timestamp)
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResultData [code=" + code + ", message=" + message + ", data=" + data + ", token=" + token
				+ ", timestamp=" + timestamp + "]";
	}

}
