package loclhost.model;

import javax.persistence.*;

@Table(name = "role")
public class Role {
    @Id
    @Column(name = "roleID")
    private Integer roleid;

    @Column(name = "roleName")
    private String rolename;

    @Column(name = "roleNote")
    private String rolenote;

    /**
     * @return roleID
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * @return roleName
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * @param rolename
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * @return roleNote
     */
    public String getRolenote() {
        return rolenote;
    }

    /**
     * @param rolenote
     */
    public void setRolenote(String rolenote) {
        this.rolenote = rolenote;
    }
}