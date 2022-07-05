package set;

import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<String> values = new TreeSet<String>();

        values.add("Hello");
        values.add("Selenium");
        values.add("QTP");
        values.add("xyz");
        values.add("Oracle");
        values.add("1");
        values.add("Java");
        values.add("abc");

        System.out.println("Values are: " + values);

        for(String value : values) {

            System.out.println("Value from set is: " + value);
        }
    }
}
