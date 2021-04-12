package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.Date;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Reservation implements Serializable, IDates {

    private Customer customer;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Reservation(Customer customer, Room room, Date startDate, Date endDate) {
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        
        customer.addReservation(this);
        room.addReservation(this);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}//end Reservation