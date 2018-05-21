package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "MEDS",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "MEDS_NO" }) })
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
    
    }
}



