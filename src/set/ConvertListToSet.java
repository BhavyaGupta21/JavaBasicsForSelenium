package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertListToSet {

    public static void main(String[] args) {

        Set<String> values = new HashSet<String>();

        values.add("Hello");
        values.add("Selenium");
        values.add("QTP");
        values.add("1");
        values.add("Java");
        values.add("abc");

        System.out.println(values);

        ArrayList<String> list = new ArrayList<>(values);

        System.out.println(list.get(3));
    }
}
