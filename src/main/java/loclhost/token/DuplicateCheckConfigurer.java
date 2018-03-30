package loclhost.token;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by LadyLady on 2018-03-29.
 */
@Configuration
public class DuplicateCheckConfigurer extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry) {


        /*TODO 添加读取配置文件信息 有默认值 可以使用session或redis实现 默认使用session*/
        // 多个拦截器组成一个拦截器链

        // addPathPatterns 用于添加拦截规则

        // excludePathPatterns 用户排除拦截

        registry.addInterceptor(new DuplicateCheckInterceptor()).addPathPatterns("/**");


    }

}
