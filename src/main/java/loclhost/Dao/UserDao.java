package loclhost.Dao;

import loclhost.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by BlueSky on 2017/9/13.
 */

public interface UserDao extends JpaRepository<User, Integer> {

    @Transactional
    @Modifying
    @Query("update User set username = ? where userID = ?")
    int updateF1(String username, Integer userID);

    @Transactional
    @Modifying
    @Query("update User set username = :username where userID = :userID")
    int updatrF2(@Param("username") String username, @Param("userID") Integer userID);


    User findByusername(String username);
}
