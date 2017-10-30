package loclhost.Service;

import loclhost.Dao.UserDao;
import loclhost.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Service
public class LoginService {
    @Autowired
    private UserDao userDao;


    public boolean addUser(User user) {

        User s = userDao.save(user);

        return s != null ? true : false;
    }

    public boolean deleteUser(Integer userID) {
        userDao.delete(userID);
        return false;
    }
    @Transactional
    public boolean updateUser(User user) {
        try {
            userDao.save(user);
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
}
