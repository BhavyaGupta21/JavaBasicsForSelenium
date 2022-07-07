package exceptionHandling;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling4 {

    public static void main(String[] args) {

        System.out.println("Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");

        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Robot a = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
}
