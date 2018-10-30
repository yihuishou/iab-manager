package loclhost.services;

import loclhost.mapper.UserMapper;
import loclhost.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LadyLady on 2018-08-21.
 */
@Service
public class UserServices {

    enum COS {

        Red("红色"), green("绿色");
        private String color;

        COS(String color) {
            this.color = color;
        }

        // public String getColor() {
        //     return color;
        // }
        //
        // public void setColor(String color) {
        //     this.color = color;
        // }
    }

    @Autowired
    private UserMapper userMapper;

    public boolean addUser(User user) {

        int result = userMapper.insert(user);
        if (result != 1) {
            return false;
        } else {


            return true;


        }
    }

    enum Day {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3),
        THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

        private int dayNumber;

        Day(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public int getDayNumber() {
            return dayNumber;
        }

        public void setDayNumber(int dayNumber) {
            this.dayNumber = dayNumber;
        }
    }

    public static void main(String[] args) {




        System.out.println(Day.FRIDAY.dayNumber);
        Day.FRIDAY.setDayNumber(9999);
        System.out.println(Day.FRIDAY.getDayNumber());

    }


    boolean login(User user) {
        return false;
    }

}
