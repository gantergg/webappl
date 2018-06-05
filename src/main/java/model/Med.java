package model;

import javax.persistence.*;

@Entity
@Table(name = "MEDS")

public class Med {

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME", length = 80, nullable = false)
    private String name;
    @Column(name = "PRICE")
    private Integer price;
   /* @ManyToOne
    @JoinColumn(name = "ORDERLINE_ID")
    private OrderLine orderLine; */


    public Med() {
    }

    public Med(Integer medId, String name, Integer price) {
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

    public void setPrice(Integer price) {
        this.price = price;
    }

   /* public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }*/

    @Override
    public String toString() {
        return "Med{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", price='" + price + '\'' +
        '}';

    }

}



