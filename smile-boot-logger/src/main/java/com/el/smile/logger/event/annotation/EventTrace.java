package com.el.smile.logger.event.annotation;

import java.lang.annotation.*;

/**
 * 事件日志
 * since 7/4/20
 *
 * @author eddie
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventTrace {

    /**
     * 方法描述
     *
     * @return
     */
    String event() default "";
    /**
     * 请求参数
     */
    boolean paramter() default true;
    /**
     * 返回值
     */
    boolean response() default true;

}
