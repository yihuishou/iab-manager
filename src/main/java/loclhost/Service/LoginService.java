package loclhost.Service;

import loclhost.Dao.UserDao;
import loclhost.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Service
public class LoginService {
    @Autowired
    private UserDao userDao;


    public boolean addUser(User user) {
        try {
            User now = userDao.save(user);
            System.out.println(now.getUsername());
        } catch (Exception e) {

            return false;
        }

        return true;
    }

    public boolean deleteUser(Integer userID) {
        userDao.delete(userID);
        return false;
    }


    public boolean update(User user) {
        int result = userDao.updateF1(user.getUsername(), Integer.valueOf(user.getUserID()));
        System.out.println(result);
        return true;
    }


    public boolean updateUser(User user) {
        try {
            User newuser = userDao.save(user);
            System.out.println(newuser);


            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean login(User user) {
        String loginName = user.getUsername();
        User localUser = userDao.findByusername(loginName);
        if (localUser.getPassword().equals(user.getPassword())) {
            return true;
        }
        return false;
    }

    public List showAllUser() {
        return userDao.findAll();
    }

    public void cleanUser() {
        userDao.deleteAll();
    }

    public User findUser(String username) {
        return userDao.findByusername(username);
    }
}
