package loclhost.model;

import javax.persistence.*;

@Table(name = "rolespermission")
public class Rolespermission {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "rolesid")
    private Integer rolesid;

    @Column(name = "permissionid")
    private Integer permissionid;

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

    /**
     * @return permissionid
     */
    public Integer getPermissionid() {
        return permissionid;
    }

    /**
     * @param permissionid
     */
    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}