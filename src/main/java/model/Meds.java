package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEDS")
public class Meds {

    private Integer medId;
    private String name;
    private Integer price;


    public Meds() {
    }

    public Meds(Integer medId, String name, Integer price) {
    this.medId = medId;
    this.name = name;
    this.price = price;

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

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PRICE")
    public Integer getPrice() {
        return price;
    }

    private void setPrice(Integer price) {
        this.price = price;
    }
}



