package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

    public static void main(String[] args) {

        HashMap<String, String> obj1 = new HashMap<String, String>();

        obj1.put("100", "Hello");
        obj1.put("200", "Selenium");
        obj1.put("600", "Katalon");
        obj1.put("700", "Jira");
        obj1.put("300", "QTP");
        obj1.put("400", "Appium");

        for (Map.Entry<String, String> data : obj1.entrySet()) {

            System.out.println("Key from Map is: " + data.getKey() + " and value is: " + data.getValue());
        }
    }
}
