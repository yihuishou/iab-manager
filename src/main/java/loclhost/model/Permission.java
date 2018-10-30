package loclhost.model;

import javax.persistence.*;

@Table(name = "permission")
public class Permission {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "permission")
    private String permission;

    @Column(name = "permissiondetial")
    private String permissiondetial;

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
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * @return permissiondetial
     */
    public String getPermissiondetial() {
        return permissiondetial;
    }

    /**
     * @param permissiondetial
     */
    public void setPermissiondetial(String permissiondetial) {
        this.permissiondetial = permissiondetial;
    }
}