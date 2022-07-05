package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

    public static void main(String[] args) {

        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Hello");
        obj1.add("Selenium");
        obj1.add("HP QTP");

        for(String v: obj1) {

            System.out.println("Value of ArrayList is: " + v);

        }
    }
}
