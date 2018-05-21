package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERLINE")
public class OrderLine {

    @Id
    @Column(name = "ORDLN_ID")
    private Integer ordnlId;
    @Column(name = "COUNT")
    private Integer count;

    public OrderLine() {
    }

    public OrderLine(Integer ordnlId, Integer count) {
        this.ordnlId = ordnlId;
        this.count = count;
    }

    public Integer getOrdnlId() {
        return ordnlId;
    }

    public Integer getCount() {
        return count;
    }

    public void setOrdnlId(Integer ordnlId) {
        this.ordnlId = ordnlId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
