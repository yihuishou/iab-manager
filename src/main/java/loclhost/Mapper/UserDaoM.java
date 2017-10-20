package loclhost.Mapper;

import loclhost.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by BlueSky on 2017/10/20.
 */
@Repository
public interface UserDaoM {
    // @Select("select * from user")
    List<User> getAll();
}
