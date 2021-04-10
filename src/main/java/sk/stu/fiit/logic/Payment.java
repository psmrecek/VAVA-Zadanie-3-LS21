package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.Date;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Payment implements Serializable {
    
    private Date date;
    private Double total;
    private boolean cash;

    public Payment(Date date, Double total, boolean cash) {
        this.date = date;
        this.total = total;
        this.cash = cash;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCash() {
        return cash;
    }

    public void setCash(boolean cash) {
        this.cash = cash;
    }
    
}//end Payment