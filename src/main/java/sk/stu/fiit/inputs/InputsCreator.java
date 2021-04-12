/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.inputs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sk.stu.fiit.logic.*;

/**
 *
 * @author PeterSmrecek
 */
public class InputsCreator {
    
    

    
    public static void createInputs(Hotel hotel){
        
        
        Customer c1 = new Customer("Arnošt Bublavý", "Cimenná 123", "+421000000000", "arnost@bublavy.com");
        Customer c2 = new Customer("Dobromila Ementálová", "Frankfurt 456", "+421111111111", "dobromila@ementalova.com");
        Customer c3 = new Customer("Gregor Hľadač", "Ivanka pri Dunaji 789", "+421222222222", "gregor@hladac.com");
        Customer c4 = new Customer("Jonatán Kyprý", "Lomnica 101112", "+421333333333", "jonatan@kypry.com");
        
        hotel.addCustomer(c1);
        hotel.addCustomer(c2);
        hotel.addCustomer(c3);
        hotel.addCustomer(c4);
        
        Service s1 = new Service("Plávanie", "20.00");
        Service s2 = new Service("Masáž", "40.00");
        Service s3 = new Service("Jazda na koni", "30.00");
        
        hotel.addService(s1);
        hotel.addService(s2);
        hotel.addService(s3);
        
        Category cat1 = new Category("Premium", "Izby pre 4 ľudí", 120.43);
        Category cat2 = new Category("Kráľovské izby", "Izby pre 16 ľudí s osobnými stajňami pri hoteli", 12345.67);
        
        hotel.addCategory(cat1);
        hotel.addCategory(cat2);
        
        ArrayList<ImageIcon> li1 = new ArrayList<>();
        ArrayList<ImageIcon> li2 = new ArrayList<>();
        ArrayList<ImageIcon> li3 = new ArrayList<>();
        ArrayList<ImageIcon> li4 = new ArrayList<>();
        
        int size = 200;
                
        try {
             ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//             InputStream is = classloader.getResourceAsStream("images/room1-1.jpg");
//             BufferedImage img1 = ImageIO.read(is);

            BufferedImage img1 = ImageIO.read(classloader.getResourceAsStream("images/room1-1.jpg"));
            BufferedImage img2 = ImageIO.read(classloader.getResourceAsStream("images/room1-2.jpg"));
            BufferedImage img3 = ImageIO.read(classloader.getResourceAsStream("images/room1-3.jpg"));
            BufferedImage img4 = ImageIO.read(classloader.getResourceAsStream("images/room2-1.jpg"));
            BufferedImage img5 = ImageIO.read(classloader.getResourceAsStream("images/room2-2.jpg"));
            BufferedImage img6 = ImageIO.read(classloader.getResourceAsStream("images/room3-1.jpg"));
            BufferedImage img7 = ImageIO.read(classloader.getResourceAsStream("images/room3-2.jpg"));
            BufferedImage img8 = ImageIO.read(classloader.getResourceAsStream("images/room4-1.jpg"));
            BufferedImage img9 = ImageIO.read(classloader.getResourceAsStream("images/room4-2.jpeg"));
            
            li1.add(InputProcessor.resize(img1, size));
            li1.add(InputProcessor.resize(img2, size));
            li1.add(InputProcessor.resize(img3, size));
            li2.add(InputProcessor.resize(img4, size));
            li2.add(InputProcessor.resize(img5, size));
            li3.add(InputProcessor.resize(img6, size));
            li3.add(InputProcessor.resize(img7, size));
            li4.add(InputProcessor.resize(img8, size));
            li4.add(InputProcessor.resize(img9, size));
            
            System.out.println("++++++++++++++++Obrazky sa nacitali v poriadku");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("----------------Nacitanie obrazkov zlyhalo");
        }

        Room r1 = new Room("PR-001", "Pekná izba", cat1, li1);
        Room r2 = new Room("PR-002", "Iná pekná izba", cat1, li2);
        Room r3 = new Room("KR-001", "Veľmi veľká izba", cat2, li3);
        Room r4 = new Room("KR-002", "Najväčšia izba", cat2, li4);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        
        try {
            Accommodation ac1 = new Accommodation(c1, r1, sdf.parse("1.1.2021 10:00"), sdf.parse("7.1.2021 10:00"));
            Accommodation ac2 = new Accommodation(c1, r2, sdf.parse("1.2.2021 10:00"), sdf.parse("7.2.2021 10:00"));
            Accommodation ac3 = new Accommodation(c2, r3, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Accommodation ac4 = new Accommodation(c3, r4, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Accommodation ac5 = new Accommodation(c1, r1, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Accommodation ac6 = new Accommodation(c1, r4, sdf.parse("1.4.2021 10:00"), sdf.parse("14.1.2021 10:00"));
            
            ac1.addService(s1);
            ac2.addService(s2);
            ac3.addService(s3);
            ac4.addService(s1);
            ac5.addService(s2);
            ac6.addService(s3);
            ac1.addService(s1);
            ac1.addService(s2);
            ac1.addService(s3);
            
            hotel.addAccommodation(ac1);
            hotel.addAccommodation(ac2);
            hotel.addAccommodation(ac3);
            hotel.addAccommodation(ac4);
            hotel.addAccommodation(ac5);
            hotel.addAccommodation(ac6);
            
            Reservation res1 = new Reservation(c1, r1, sdf.parse("1.1.2021 10:00"), sdf.parse("7.1.2021 10:00"));
            Reservation res2 = new Reservation(c1, r2, sdf.parse("1.2.2021 10:00"), sdf.parse("7.2.2021 10:00"));
            Reservation res3 = new Reservation(c2, r3, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Reservation res4 = new Reservation(c3, r4, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Reservation res5 = new Reservation(c1, r1, sdf.parse("1.3.2021 10:00"), sdf.parse("7.3.2021 10:00"));
            Reservation res6 = new Reservation(c1, r4, sdf.parse("1.4.2021 10:00"), sdf.parse("14.1.2021 10:00"));
            
            hotel.addReservation(res1);
            hotel.addReservation(res2);
            hotel.addReservation(res3);
            hotel.addReservation(res4);
            hotel.addReservation(res5);
            hotel.addReservation(res6);
            
        } catch (ParseException ex) {
            System.out.println("Nedokazal som vytvorit Accommodation");
        }
        
    }
}
