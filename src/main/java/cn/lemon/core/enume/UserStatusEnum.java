package cn.lemon.core.enume;

public enum UserStatusEnum {
	
	FROZEN(2, "冻结"),
	NORMAL(1, "正常");

	private Integer label;

	private String value;

	public Integer getLabel() {
		return label;
	}

	public void setLabel(Integer label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private UserStatusEnum(Integer label, String value) {
		this.label = label;
		this.value = value;
	}
}
