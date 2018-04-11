package loclhost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;


@EnableCaching
@SpringBootApplication
@MapperScan("loclhost.Mapper")
public class IabManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IabManagerApplication.class, args);
    }

}