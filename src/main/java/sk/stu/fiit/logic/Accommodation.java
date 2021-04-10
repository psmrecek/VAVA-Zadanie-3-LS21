package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Accommodation implements Serializable {

    private Payment payment;
    private ArrayList<Service> listServices = new ArrayList<>();
    private Customer customer;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Accommodation(Customer customer, Room room, Date startDate, Date endDate) {
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        
        customer.addAccommodation(this);
        room.addAccommodation(this);
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ArrayList<Service> getListServices() {
        return listServices;
    }

    public void setListServices(ArrayList<Service> listServices) {
        this.listServices = listServices;
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
    
    public void addService(Service service) {
        listServices.add(service);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getServicesString() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < listServices.size(); i++) {
            strings.add(listServices.get(i).getDescription());
        }
        return String.join(", ", strings);
    }
    
}//end Accommodation