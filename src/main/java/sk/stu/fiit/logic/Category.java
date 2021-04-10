package sk.stu.fiit.logic;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 10-apr-2021 14:38:04
 */
public class Category implements Serializable {

    private ArrayList<Room> listRooms = new ArrayList<>();
    private String name;
    private String info;
    private double price;

    public Category(String name, String info, double price) {
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Room> getListRooms() {
        return listRooms;
    }

    public void setListRooms(ArrayList<Room> listRooms) {
        this.listRooms = listRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public void addRoom(Room room) {
        listRooms.add(room);
    }



}//end Category