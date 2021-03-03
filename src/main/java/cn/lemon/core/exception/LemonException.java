package cn.lemon.core.exception;

import cn.lemon.core.enume.ErrorEnum;

public class LemonException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private Integer code;

    public LemonException() {
        super();
    }

    public LemonException(ErrorEnum errorEnum) {
        super(errorEnum.getCode());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
