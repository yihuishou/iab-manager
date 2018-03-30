package loclhost.services;

import loclhost.mapper.ConsumerMapper;
import loclhost.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LadyLady on 2018-03-27.
 */
@Service
public class UserServices {
    @Autowired
    private ConsumerMapper consumerMapper;

    public boolean newUser(Consumer consumer) {

        int inser = consumerMapper.insert(consumer);

        return inser != 0;
    }


    public boolean login(String username, String password) {
        Consumer consumer = new Consumer();
        consumer.setUsername(username);
        Consumer localInfo = consumerMapper.selectOne(consumer);

        return localInfo != null && localInfo.getPassword().equals(password);
    }

    public boolean fixUser(Consumer consumer) {

        int updateResult = consumerMapper.updateByPrimaryKey(consumer);
        return updateResult != 0;
    }

    public boolean delete(String username) {
        Consumer consumer = new Consumer();
        consumer.setUsername(username);
        int delectResult = consumerMapper.delete(consumer);
        return delectResult != 0;
    }

    public List<Consumer> getUserList() {
        return consumerMapper.selectAll();
    }
}
