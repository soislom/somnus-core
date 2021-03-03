package cn.lemon.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.lemon.core.enume.OperateEnum;

/**
 * 系统操作日志注解
 * @author 34305
 *
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Operate {

	/**
	 * 操作类型
	 * @return
	 */
	OperateEnum operateEnum() default OperateEnum.QUERY;
	
	/**
	 * 操作描述
	 * @return
	 */
	String context();
}
