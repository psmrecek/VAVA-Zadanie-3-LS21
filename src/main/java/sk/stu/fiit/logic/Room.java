package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Room implements Serializable, IName{
    
    private String name;
    private String note;
    private Category category;
    private ArrayList<ImageIcon> listImages = new ArrayList<>();
    private ArrayList<Reservation> listReservations = new ArrayList<>();
    private ArrayList<Accommodation> listAccommodations = new ArrayList<>();

    public Room(String id, String note, Category category, ArrayList<ImageIcon> listImages) {
        this.name = id;
        this.note = note;
        this.category = category;
        this.listImages.addAll(listImages);
        
        category.addRoom(this);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ArrayList<ImageIcon> getListImages() {
        return listImages;
    }

    public void setListImages(ArrayList<ImageIcon> listImages) {
        this.listImages = listImages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    public void addAccommodation(Accommodation accommodation) {
        listAccommodations.add(accommodation);
    }

    public void addReservation(Reservation reservation) {
        listReservations.add(reservation);
    }
    
}//end Room