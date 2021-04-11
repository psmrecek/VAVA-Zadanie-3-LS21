/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.inputs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import sk.stu.fiit.logic.Hotel;

/**
 *
 * @author PeterSmrecek
 */
public class Serializer {
    
    public static void serialize(Hotel hotel) {
        try {
            FileOutputStream fileOut = new FileOutputStream("outputs/data.out");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(hotel);
            out.close();
            fileOut.close();
            System.out.println("Uspesne serializovane");
            System.out.printf("Serialized data is saved in outputs/data.out");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Hotel deserialize() {
        try {
            FileInputStream fileIn = new FileInputStream("outputs/data.out");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Hotel hotel = (Hotel) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Uspesne deserializovane");
            return hotel;
        } catch (IOException i) {
//            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Hotel class not found");
//            c.printStackTrace();
            return null;
        }
    }
}
