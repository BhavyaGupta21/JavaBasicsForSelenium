package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();
        obj1.add(8757688);
        obj1.add('M');
        obj1.add("Selenium WebDriver");
        obj1.add("Selenium WebDriver");
        obj1.add(908.98);

        Iterator itr = obj1.iterator();

        while (itr.hasNext()) {

            Object value = itr.next();

            System.out.println("Value of ArrayList is: " + value);
        }

    }
}
