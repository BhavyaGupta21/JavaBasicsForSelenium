package strings;

public class Strings1 {

    public static void main(String[] args) {

        String actual = "Welcome to Selenium WebDriver world";
        String expected = "Welcome to Selenium world";

        boolean status = actual.equals(expected);
        System.out.println("Status is: " + status);

        String actual1 = "Welcome to Selenium WebDriver world";
        String expected1 = "welcome to Selenium WebDriver world";

        boolean status1 = actual1.equals(expected1);
        System.out.println("New status is: " + status1);

        String actual2 = "Welcome to Selenium WebDriver world";
        String expected2 = "welcome to Selenium WebDriver world";

        boolean status2 = actual2.equalsIgnoreCase(expected2);
        System.out.println("New status is: " + status2);
    }
}
