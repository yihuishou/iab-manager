package loclhost.Service;

import loclhost.Dao.UserDao;
import loclhost.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Service
public class LoginService {
    @Autowired
    private UserDao userDao;

    public User login(User user) {

        User now = userDao.findByuserID(user.getUserID());


        return now;
    }

    public String addUeser(User user) {


     User s =   userDao.save(user);
        if (s != null) {
            return "成功";
        }
        return "失败";
    }

}
