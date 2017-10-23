package loclhost.Service;

import loclhost.Logs;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * Created by BlueSky on 2017/10/19.
 * 定时任务实现类
 */
@Component
public class Timer {

    @Scheduled(fixedRate = 1000)
    public void showtime() {
        LocalTime now = LocalTime.now();
        Logs.info("现在的时间是: "+now);
    }

}
