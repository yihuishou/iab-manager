package loclhost;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@EnableSwagger2Doc
@SpringBootApplication
@MapperScan("loclhost.mapper")
public class IabManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IabManagerApplication.class, args);
    }

}