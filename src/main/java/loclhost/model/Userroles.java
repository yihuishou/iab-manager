package loclhost.model;

import javax.persistence.*;

@Table(name = "userroles")
public class Userroles {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "rolesid")
    private Integer rolesid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return rolesid
     */
    public Integer getRolesid() {
        return rolesid;
    }

    /**
     * @param rolesid
     */
    public void setRolesid(Integer rolesid) {
        this.rolesid = rolesid;
    }
}