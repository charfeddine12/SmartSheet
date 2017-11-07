package com.esmartsheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MISSION")
@XmlRootElement
public class Mission implements Serializable {


    private static final long serialVersionUID = 2315591476476221078L;
    @Id
    @Column(name = "msn_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int msn_id;

    @NotEmpty(message = "The Mission designation must not be null")
    @Column(name = "msn_designation")
    private String msn_designation;

    @NotEmpty(message = "The Mission status must not be null")
    @Column(name = "msn_etat")
    private String msn_etat;

    @OneToMany(mappedBy ="mission",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Tache> tacheList;

    @ManyToOne
    @JoinColumn(name = "cli_id")
    @JsonIgnore
    private Client client;


    public Mission() {

        // TODO Auto-generated constructor stub
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getMsn_id() {
        return msn_id;
    }

    public void setMsn_id(int msn_id) {
        this.msn_id = msn_id;
    }

    public String getMsn_designation() {
        return msn_designation;
    }

    public void setMsn_designation(String msn_designation) {
        this.msn_designation = msn_designation;
    }

    public String getMsn_etat() {
        return msn_etat;
    }

    public void setMsn_etat(String msn_etat) {
        this.msn_etat = msn_etat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Tache> getTacheList() {
        return tacheList;
    }

    public void setTacheList(List<Tache> tacheList) {
        this.tacheList = tacheList;
    }
}