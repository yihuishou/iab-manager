package loclhost.Dao;

import loclhost.Model.Portfolio;
import loclhost.Model.userInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by BlueSky on 2017/10/27.
 */
@Repository
public interface PortfolioDao extends JpaRepository<Portfolio, Integer> {

    @Query(value = "select u.username,p.bookCheckerName from User u , Portfolio p where p.portfolioID = u.portfolioOwnerID")
    Page<userInfo> selectTX(String username);
}
