/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.inputs;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author PeterSmrecek
 */
public final class InputProcessor {

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
}
