package com.esmartsheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "USERS")
@XmlRootElement
public class Users {


    @Id
    @GeneratedValue
    private int users_id;
    private String login;
    private String password;
    private boolean enabled;
    @OneToOne
    @JoinColumn(name = "emp_id")
    @JsonIgnore
    private Employe employe_id;
    @OneToOne
    @JoinColumn(name = "cli_id")
    @JsonIgnore
    private Client client_id;


    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Employe getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(Employe employe_id) {
        this.employe_id = employe_id;
    }

    public Client getClient_id() {
        return client_id;
    }

    public void setClient_id(Client client_id) {
        this.client_id = client_id;
    }
}
