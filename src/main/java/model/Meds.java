package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MEDS")
public class Meds {

    private Integer medId;
    private String name;
    private String annotation;
    private String provider;
    private String producer;
    private String storage;
    private String units;
    private Integer amount;

    public Meds() {
    }

    public Meds(Integer medId, String name, String annotation, String provider, String producer, String storage, String units, Integer amount) {
    this.medId = medId;
    this.name = name;
    this.annotation = annotation;
    this.provider = provider;
    this.producer = producer;
    this.storage =  storage;
    this.units = units;
    this.amount = amount;
    }

    @Id
    @Column(name = "MED_ID")
    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    @Column(name = "NAME", length = 80, nullable = false)
    public String getName() {
        return name;
    }

}



