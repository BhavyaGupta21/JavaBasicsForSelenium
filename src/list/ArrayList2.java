package list;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();
        obj1.add(8757688);
        obj1.add('M');
        obj1.add("Selenium WebDriver");
        obj1.add("Selenium WebDriver");
        obj1.add(908.98);

        int myListSize = obj1.size();

        for (int i = 0; i < myListSize; i++) {

            System.out.println("Values from the ArrayList: " + obj1.get(i));
        }

    }
}
