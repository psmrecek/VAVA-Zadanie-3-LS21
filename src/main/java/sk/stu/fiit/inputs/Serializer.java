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
import org.apache.log4j.Logger;
import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.logic.Hotel;

/**
 *
 * @author PeterSmrecek
 */
public class Serializer {
    
    private static final Logger logger = Logger.getLogger(Serializer.class.getName());
    
    public static void serialize(Hotel hotel) {
        try {
            FileOutputStream fileOut = new FileOutputStream("outputs/data.out");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(hotel);
            out.close();
            fileOut.close();
            logger.info("Serialized data is saved in outputs/data.out");
        } catch (IOException i) {
            i.printStackTrace();
            logger.error("Unable to serialize");
        }
    }

    public static Hotel deserialize() {
        try {
            FileInputStream fileIn = new FileInputStream("outputs/data.out");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Hotel hotel = (Hotel) in.readObject();
            in.close();
            fileIn.close();
            logger.info("Data deserialized correctly");
            return hotel;
        } catch (IOException i) {
            logger.info("Unable to deserialize data");
            return null;
        } catch (ClassNotFoundException c) {
            logger.info("Unable to deserialize data");
            return null;
        }
    }
}
