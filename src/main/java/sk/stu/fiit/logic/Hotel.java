package sk.stu.fiit.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Hotel implements Serializable {

    private ArrayList<Customer> listCustomers = new ArrayList<>();
    private ArrayList<Service> listServices = new ArrayList<>();;
    private ArrayList<Category> listCategories = new ArrayList<>();;
    private ArrayList<Accommodation> listAccommodationsUnpaid = new ArrayList<>();
    private ArrayList<Accommodation> listAccommodationsPaid = new ArrayList<>();
    private ArrayList<Reservation> listReservations = new ArrayList<>();;
    
    public Hotel(){
        
    }

    public void addCustomer(Customer customer){
        listCustomers.add(customer);
    }
    
    public void addService(Service service){
        listServices.add(service);
    }
    
    public void addCategory(Category category){
        listCategories.add(category);
    }
    
    public void addAccommodation(Accommodation accommodation){
        listAccommodationsUnpaid.add(accommodation);
    }
        
    public void addReservation(Reservation reservation) {
        listReservations.add(reservation);
    }    
    
//----------------------------------------------------------------
    public ArrayList<Customer> getListCustomers() {
        return listCustomers;
    }

    public void setListCustomers(ArrayList<Customer> listCustomers) {
        this.listCustomers = listCustomers;
    }

    public ArrayList<Service> getListServices() {
        return listServices;
    }

    public void setListServices(ArrayList<Service> listServices) {
        this.listServices = listServices;
    }

    public ArrayList<Category> getListCategories() {
        return listCategories;
    }

    public void setListCategories(ArrayList<Category> listCategories) {
        this.listCategories = listCategories;
    }

    public ArrayList<Accommodation> getListAccommodationsUnpaid() {
        return listAccommodationsUnpaid;
    }

    public void setListAccommodationsUnpaid(ArrayList<Accommodation> listAccommodationsUnpaid) {
        this.listAccommodationsUnpaid = listAccommodationsUnpaid;
    }

    public ArrayList<Reservation> getListReservations() {
        return listReservations;
    }

    public void setListReservations(ArrayList<Reservation> listReservations) {
        this.listReservations = listReservations;
    }

    public ArrayList<Accommodation> getListAccommodationsPaid() {
        return listAccommodationsPaid;
    }

    public void setListAccommodationsPaid(ArrayList<Accommodation> listAccommodationsPaid) {
        this.listAccommodationsPaid = listAccommodationsPaid;
    }
    
    public void setPaidAccomm(Accommodation accommodation){
        listAccommodationsUnpaid.remove(accommodation);
        listAccommodationsPaid.add(accommodation);
    }
}//end Hotel