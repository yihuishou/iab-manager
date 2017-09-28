package loclhost.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by BlueSky on 2017/9/13.
 */
@Entity
public class User {
    // 用户ID
    @Id
    @GeneratedValue
    private Integer userID;
    // 用户名
    private String username;
    // 用户密码
    private String password;
    // 角色ID
    private Integer roleCode;
    // 拥有作品ID
    private Integer portfolioOwnerID;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Integer roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getPortfolioOwnerID() {
        return portfolioOwnerID;
    }

    public void setPortfolioOwnerID(Integer portfolioOwnerID) {
        this.portfolioOwnerID = portfolioOwnerID;
    }
}
