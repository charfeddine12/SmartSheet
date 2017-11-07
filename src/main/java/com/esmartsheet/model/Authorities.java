package com.esmartsheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "AUTHORITIES")
@XmlRootElement
public class Authorities {

    @Id
    @GeneratedValue
    private int authorities_id;
    private String username;
    private String authority;

    public int getAuthorities_id() {
        return authorities_id;
    }

    public void setAuthorities_id(int authorities_id) {
        this.authorities_id = authorities_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
