package cn.lemon.core.enume;

public enum UserSexEnum{
	
	BOY(1, "男"),
	GIRL(2, "女"),
	SECRECY(3, "保密");

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

	private UserSexEnum(Integer label, String value) {
		this.label = label;
		this.value = value;
	}

}
