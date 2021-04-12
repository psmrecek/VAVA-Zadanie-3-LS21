package sk.stu.fiit.logic;

import java.io.Serializable;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Service implements Serializable, IName {

    private String name;
    private double price;

    public Service(String description, double price) {
        this.name = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}//end Service