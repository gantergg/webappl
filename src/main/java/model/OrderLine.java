package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "ORDERLINE")
public class OrderLine {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "COUNT")
    private Integer count;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ORDERLINE")
    private Set<Meds> meds = new HashSet<Meds>();
    @ManyToOne
    @JoinColumn(name = "PURCHASE_ID")
    private Purchase purchase;

    public OrderLine() {
    }

    public OrderLine(Integer ordnlId, Integer count) {
        this.id = ordnlId;
        this.count = count;
    }

    public Integer getOrdnlId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public void setOrdnlId(Integer ordnlId) {
        this.id = ordnlId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setItems(Set<Meds> items) {
        this.meds = items;
    }

    public Set<Meds> getItems() {
        return meds;
    }


    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
