package com.xingguang.config;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JWTParam {

	/**
	 * 是否必须有值
	 * 
	 * @return
	 */
	boolean required() default false;

	/**
	 * jwt中会存在多个值,key表示获取其中哪个值
	 * 
	 * @return
	 */
	String key() default "";
}
