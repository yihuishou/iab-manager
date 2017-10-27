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

     User login(User user) {

        User now = userDao.findByuserID(user.getUserID());


        return now;
    }

     boolean addUser(User user) {

         User s = userDao.save(user);

         return s != null ? true : false;
    }

    boolean deleteUser(Integer userID) {
         userDao.delete(userID);



        return false;
    }




}
