package set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

    public static void main(String[] args) {

        LinkedHashSet<String> values = new LinkedHashSet<String>();

        values.add("Hello");
        values.add("Selenium");
        values.add("QTP");
        values.add("xyz");
        values.add("1");
        values.add("Java");
        values.add("abc");

        System.out.println("Values are: " + values);

        for(String value : values) {

            System.out.println("Value from set is: " + value);
        }
    }
}
