package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEDS")


public class Meds {

    @Id
    @Column(name = "MED_ID")


    private Integer medId;
    @Column(name = "NAME", length = 80, nullable = false)
    private String name;
    @Column(name = "PRICE")
    private Integer price;


    public Meds() {
    }

    public Meds(Integer medId, String name, Integer price) {
        this.medId = medId;
        this.name = name;
        this.price = price;

    }


    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getPrice() {
        return price;
    }

    private void setPrice(Integer price) {
        this.price = price;
    }
}



