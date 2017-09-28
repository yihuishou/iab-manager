package loclhost;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import javax.sql.DataSource;

/**
 * Created by BlueSky on 2017/8/10.
 */
@Configuration
public class DruidConfiguration {
    private Logger logger = LoggerFactory.getLogger(DruidConfiguration.class);

/*    @Value("${druid.urlMapping}")
    private String urlMapping;
    @Value("${druid.urlPatterns}")
    private String urlPatterns;
    @Value("${druid.exclusions}")
    private String exclusions;*/


    @Value("${druid.allow}")
    private String allow;
    @Value("${druid.deny}")
    private String deny;
    @Value("${druid.loginUsername}")
    private String loginUsername;
    @Value("${druid.loginPassword}")
    private String loginPassword;
    @Value("${druid.resetEnable}")
    private boolean resetEnable;




    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource DruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    // druidServlet配置
    @Bean
    public ServletRegistrationBean druidStatViewServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        // IP白名单 (没有配置或者为空，则允许所有访问)
        registrationBean.addInitParameter("allow", "");
        // IP黑名单 (与白名单共存时，deny优先级高于allow)
        registrationBean.addInitParameter("deny", "");
        // 监控模块登陆名
        registrationBean.addInitParameter("loginUsername", loginUsername);
        // 监控模块登陆密码
        registrationBean.addInitParameter("loginPassword", loginPassword);
        // 是否允许清空统计数据
        registrationBean.addInitParameter("resetEnable", String.valueOf(resetEnable));
        return registrationBean;
    }

    // Druid拦截器配置
    @Bean
    public FilterRegistrationBean druidWebStatViewFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
        registrationBean.addInitParameter("urlPatterns", "/*");
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        return registrationBean;
    }

    //fastJson配置
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        //定义一个转换消息的对象
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastJsonConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastJsonConverter;
        return new HttpMessageConverters(converter);
    }
}
