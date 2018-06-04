package model;

import javax.persistence.*;

@Entity
@Table(name = "MEDS")

public class Meds {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME", length = 80, nullable = false)
    private String name;
    @Column(name = "PRICE")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "ORDERLINE_ID")
    private OrderLine orderLine;


    public Meds() {
    }

    public Meds(Integer medId, String name, Integer price) {
        this.id = medId;
        this.name = name;
        this.price = price;

    }


    public Integer getMedId() {
        return id;
    }

    public void setMedId(Integer medId) {
        this.id = medId;
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

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}



