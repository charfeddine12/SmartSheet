package com.esmartsheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "EMPLOYE")
@XmlRootElement
public class Employe implements Serializable {


    private static final long serialVersionUID = 8270034664366059743L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String emp_Id;

    @NotEmpty(message = "le nom de l''employe obligatoire")
    private String Nom_emp;

    @NotEmpty(message = "le prenom de l''employe obligatoire")
    private String prenom_emp;

    @Email
    @NotEmpty(message = "Email de l''employe obligatoire")
    private  String email_emp;

    @NotEmpty(message = "le telephone de l''employe obligatoire")
    private  String tel_emp;

    @NotEmpty(message = "login de l''employe obligatoire")
    private  String login_emp;

    @NotEmpty(message = "mot de passe de l''employe obligatoire")
    private String pwd_emp;

    @Transient
    private MultipartFile emp_img;

    @OneToMany(mappedBy ="employe",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Tache> tacheList ;

    @OneToOne
    @JoinColumn(name = "timing_id")
    @JsonIgnore
    private Timing timing_emp_tache;




    public String getNom_emp() {
        return Nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        Nom_emp = nom_emp;
    }

    public String getPrenom_emp() {
        return prenom_emp;
    }

    public void setPrenom_emp(String prenom_emp) {
        this.prenom_emp = prenom_emp;
    }

    public String getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(String emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmail_emp() {
        return email_emp;
    }

    public void setEmail_emp(String email_emp) {
        this.email_emp = email_emp;
    }

    public String getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(String tel_emp) {
        this.tel_emp = tel_emp;
    }

    public String getLogin_emp() {
        return login_emp;
    }

    public void setLogin_emp(String login_emp) {
        this.login_emp = login_emp;
    }

    public String getPwd_emp() {
        return pwd_emp;
    }

    public void setPwd_emp(String pwd_emp) {
        this.pwd_emp = pwd_emp;
    }

    public MultipartFile getEmp_img() {
        return emp_img;
    }

    public void setEmp_img(MultipartFile emp_img) {
        this.emp_img = emp_img;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Tache> getTacheList() {
        return tacheList;
    }

    public void setTacheList(List<Tache> tacheList) {
        this.tacheList = tacheList;
    }

    public Timing getTiming_emp_tache() {
        return timing_emp_tache;
    }

    public void setTiming_emp_tache(Timing timing_emp_tache) {
        this.timing_emp_tache = timing_emp_tache;
    }
}
