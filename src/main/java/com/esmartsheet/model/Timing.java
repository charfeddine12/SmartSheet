package com.esmartsheet.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "TIMING")
@XmlRootElement
public class Timing  implements Serializable{


    private static final long serialVersionUID = -1380202296426931567L;
    @Id
    @GeneratedValue
    private int timing_id;
    private int Timing_task;

    @OneToOne
    @JoinColumn(name = "emp_id")
    @JsonIgnore
    private Employe employe;

    @OneToOne
    @JoinColumn(name = "tac_id")
    @JsonIgnore
    private Tache tache;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTiming_id() {
        return timing_id;
    }

    public void setTiming_id(int timing_id) {
        this.timing_id = timing_id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public int getTiming_task() {
        return Timing_task;
    }

    public void setTiming_task(int timing_task) {
        Timing_task = timing_task;
    }
}
