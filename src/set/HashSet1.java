package set;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {

        HashSet<String> values = new HashSet<String>();

        values.add("Hello");
        values.add("Selenium");
        values.add("QTP");
        values.add("1");
        values.add("Java");
        values.add("abc");

        System.out.println("Values are: " + values);

        for(String value : values) {

            System.out.println("Value from set is: " + value);
        }
    }
}
