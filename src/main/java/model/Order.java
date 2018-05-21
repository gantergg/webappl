package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ORDER")

public class Order {

    @Id
    @Column(name = "ORDER_ID")
    private Integer orderId;
    @Column(name = "CLIENT", nullable = false)
    private String client;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "Adress")
    private String adress;

    public Order() {
    }

    public Order(Integer orderId, String client, Date date, String adress) {
        this.orderId = orderId;
        this.client = client;
        this.date = date;
        this.adress = adress;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public String getAdress() {
        return adress;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

