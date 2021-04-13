/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.inputs;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import sk.stu.fiit.logic.IName;

/**
 *
 * @author PeterSmrecek
 */
public final class InputProcessor {
    
    private static final Logger logger = Logger.getLogger(InputProcessor.class.getName());
    
    private InputProcessor() {
    }
    
    public static boolean isInt(Object x) {
        try {
            return x.getClass() == Integer.class;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPositiveInt(Object x) {
        if (isInt(x)) {
            int a = (int) x;
            return a >= 0;
        }
        return false;
    }
    
    public static ImageIcon resize(BufferedImage img, int maxSize) {
        double vertical = img.getHeight();
        double horizontal = img.getWidth();
        double coef;
        if (vertical > horizontal) {
            coef = vertical / maxSize;
        } else {
            coef = horizontal / maxSize;
        }

        vertical /= coef;
        horizontal /= coef;

        return new ImageIcon(img.getScaledInstance((int) horizontal, (int) vertical, Image.SCALE_DEFAULT));

    }
    
    public static boolean emptyString(String string) {
        boolean result;

        try {
            result = string.length() == 0;
            return result;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static double validPriceFromString(String priceString) throws Exception {
        double price;

        try {
            priceString = priceString.replace(",", ".");
            price = Double.parseDouble(priceString);
            if (price >= 0.0) {
                return price;
            }
        } catch (Exception e) {
            
        }

        throw new Exception("Wrong price format");
        
    }
    
    public static ArrayList<String> getListOfNames(ArrayList<? extends IName> list) {
        ArrayList<String> listOfNames = new ArrayList<>();

        for (IName iname : list) {
            listOfNames.add(iname.getName());
        }
        return listOfNames;
    }
    
    public static Date dateStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 9);
        return calendar.getTime();
    }
    
    public static Date dateEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 10);
        return calendar.getTime();
    }
}
