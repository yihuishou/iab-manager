package loclhost.Service;

import loclhost.Dao.PortfolioDao;
import loclhost.Model.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BlueSky on 2017/11/7.
 */
@Service
public class ItemService {
    @Autowired
    private PortfolioDao portfolioDao;


    public List<Portfolio> findAll() {
        return portfolioDao.findAll();
    }

    public boolean addItem(Portfolio portfolio) {

        Portfolio result = portfolioDao.save(portfolio);

        return result != null;

    }

    public List findTest(String username) {

        portfolioDao.selectTX(username);
        return null;
    }
}
