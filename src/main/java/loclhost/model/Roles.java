package loclhost.model;

import javax.persistence.*;

@Table(name = "roles")
public class Roles {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "rolesname")
    private String rolesname;

    @Column(name = "rolesdetial")
    private String rolesdetial;

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
     * @return rolesname
     */
    public String getRolesname() {
        return rolesname;
    }

    /**
     * @param rolesname
     */
    public void setRolesname(String rolesname) {
        this.rolesname = rolesname;
    }

    /**
     * @return rolesdetial
     */
    public String getRolesdetial() {
        return rolesdetial;
    }

    /**
     * @param rolesdetial
     */
    public void setRolesdetial(String rolesdetial) {
        this.rolesdetial = rolesdetial;
    }
}