package exceptionHandling;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class ExceptionHandling2 {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {

        System.out.println("Start");
        Thread.sleep(3000);
        System.out.println("End");

        FileInputStream fis = new FileInputStream("");

        Robot a = new Robot();

    }
}
