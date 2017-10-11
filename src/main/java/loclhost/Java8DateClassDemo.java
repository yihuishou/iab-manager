package loclhost;

import java.time.LocalDate;

/**
 * Created by BlueSky on 2017/9/13.
 */
public class Java8DateClassDemo {




    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate formedDate = LocalDate.of(2017, 1, 1);

        LocalDate stringDate = LocalDate.parse("2017-07-01");


        System.out.println("今天："+today);


        Logs.debug("封装测试：{},{}",stringDate,formedDate);
        try {
            int s = 10 / 0;

        } catch (Exception e) {
            Logs.error("错误",e);
        }
    }


}
