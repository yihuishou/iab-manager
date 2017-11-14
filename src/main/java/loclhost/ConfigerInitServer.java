package loclhost;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by BlueSky on 2017/11/3.
 */
@Component
public class ConfigerInitServer implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("++++++++++服务+++++++++");
    }
}
