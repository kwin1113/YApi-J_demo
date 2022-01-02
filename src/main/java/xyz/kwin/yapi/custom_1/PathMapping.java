package xyz.kwin.yapi.custom_1;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author kwin
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface PathMapping {

    /**
     * 接口地址
     */
    String value();

    /**
     * 自定义请求方法
     * 插件通过值是否包含GET/POST来判断方法
     */
    CustomRequestMethod method() default CustomRequestMethod.GET;

}
