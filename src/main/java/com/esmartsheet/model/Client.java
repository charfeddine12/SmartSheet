package com.esmartsheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@XmlRootElement
public class Client implements Serializable {


    private static final long serialVersionUID = -6460240946545165685L;
    @Id
    @Column(name = "cli_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cli_id;

    @NotEmpty(message = "The Client Firstname must not be null")
    @Column(name = "nom_cli")
    private String nom_cli;

    @NotEmpty(message = "The Client Lastname must not be null")
    @Column(name = "prenom_cli")
    private String prenom_cli;

    @NotEmpty(message = "The Client Login must not be null")
    @Column(name = "emailCli")
    private String cli_email;

    @NotEmpty(message = "The Client Login must not be null")
    @Column(name = "login_cli")
    private String login;

    @NotEmpty(message = "The Client password must not be null")
    @Column(name = "password_cli")
    private String password;

    @Transient
    private MultipartFile cli_img;

    @NotEmpty(message = "The Client hours must not be null")
    @Min(value = 0, message = "The Client hours  must not be less than zero.")
    @Max(value = 176 , message = "The Client hours  must not be more than 176.")
    @Column(name = "hours")
    private String hours;

    @OneToMany(mappedBy ="client",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Mission> missionsList;


    public Client() {

        // TODO Auto-generated constructor stub
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getPrenom_cli() {
        return prenom_cli;
    }

    public void setPrenom_cli(String prenom_cli) {
        this.prenom_cli = prenom_cli;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
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

    public MultipartFile getCli_img() {
        return cli_img;
    }

    public void setCli_img(MultipartFile cli_img) {
        this.cli_img = cli_img;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public List<Mission> getMissionsList() {
        return missionsList;
    }

    public void setMissionsList(List<Mission> missionsList) {
        this.missionsList = missionsList;
    }


}

