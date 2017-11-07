package com.esmartsheet.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TACHE")
@XmlRootElement
public class Tache implements Serializable {


    private static final long serialVersionUID = 853851824806523862L;
    @Id
    @Column(name = "tac_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tac_id;

    @NotEmpty(message = "The Task designation must not be null")
    @Column(name = "nom_tac")
    private String nom_tac;

    @NotEmpty(message = "The Task status must not be null")
    @Column(name = "etat_tac")
    private String etat_tac;


    @Min(value = 0, message = "The Client hours  must not be less than zero.")
    @Column(name = "timing")
    private int timing;

    @OneToOne
    @JoinColumn(name = "timing_id")
    @JsonIgnore
    private Timing timing_emp_tache;

    @ManyToOne
    @JoinColumn(name = "msn_id")
    @JsonIgnore
    private Mission mission;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    @JsonIgnore
    private Employe employe;



    public Tache() {

        // TODO Auto-generated constructor stub
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTac_id() {
        return tac_id;
    }

    public void setTac_id(int tac_id) {
        this.tac_id = tac_id;
    }

    public String getNom_tac() {
        return nom_tac;
    }

    public void setNom_tac(String nom_tac) {
        this.nom_tac = nom_tac;
    }

    public String getEtat_tac() {
        return etat_tac;
    }

    public void setEtat_tac(String etat_tac) {
        this.etat_tac = etat_tac;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public Timing getTiming_emp_tache() {
        return timing_emp_tache;
    }

    public void setTiming_emp_tache(Timing timing_emp_tache) {
        this.timing_emp_tache = timing_emp_tache;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
