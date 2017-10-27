package loclhost.Dao;

import loclhost.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BlueSky on 2017/9/13.
 */

public interface UserDao extends JpaRepository<User,Integer> {
    User findByuserID(Integer userID);



}
