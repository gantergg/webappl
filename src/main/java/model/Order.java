package model;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ORDER")

public class Order {

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CLIENT", nullable = false)
    private String client;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "Adress")
    private String adress;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ORDER")
    private Set<OrderLine> orderLines = new HashSet<OrderLine>();

    public Order() {
    }

    public Order(Integer orderId, String client, Date date, String adress) {
        this.id = orderId;
        this.client = client;
        this.date = date;
        this.adress = adress;
    }

    public Integer getOrderId() {
        return id;
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
        this.id = orderId;
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

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}

