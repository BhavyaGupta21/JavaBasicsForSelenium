package hashMap;

import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<String, String> obj1 = new HashMap<String, String>();

        obj1.put("100", "Hello");
        obj1.put("200", "Selenium");
        obj1.put("600", "Katalon");
        obj1.put("700", "Jira");
        obj1.put("300", "QTP");
        obj1.put("400", "Appium");

        System.out.println(obj1);

        String value = obj1.get("700");

        System.out.println("Value from the HashMap is: " + value);
    }
}
