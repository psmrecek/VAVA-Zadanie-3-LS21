package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Customer implements Serializable, IName {

    private ArrayList<Reservation> listReservations = new ArrayList<>();
    private ArrayList<Accommodation> listAccommodations = new ArrayList<>();
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Customer(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Reservation> getListReservations() {
        return listReservations;
    }

    public void setListReservations(ArrayList<Reservation> listReservations) {
        this.listReservations = listReservations;
    }

    public ArrayList<Accommodation> getListAccommodations() {
        return listAccommodations;
    }

    public void setListAccommodations(ArrayList<Accommodation> listAccommodations) {
        this.listAccommodations = listAccommodations;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addReservation(Reservation reservation) {
        listReservations.add(reservation);
    }
    
    public void addAccommodation(Accommodation accommodation) {
        listAccommodations.add(accommodation);
    }
    
}//end Customer
