package list;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();
        obj1.add(8757688);
        obj1.add('M');
        obj1.add("Selenium WebDriver");
        obj1.add("Selenium WebDriver");
        obj1.add(908.98);

        for (Object obj2 : obj1) {

            System.out.println("Values of ArrayList are: " + obj2);
        }

    }
}
