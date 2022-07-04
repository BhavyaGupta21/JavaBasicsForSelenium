package strings;

public class Strings2 {

    public static void main(String[] args) {

        String actual = "Welcome to Selenium WebDriver world";
        String expected = "Selenium";

        boolean status = actual.contains(expected);
        System.out.println("Status is: " + status);

        String actual1 = "Welcome to Selenium WebDriver world";
        String expected1 = "Test";

        boolean status1 = actual1.contains(expected1);
        System.out.println("Status is: " + status1);
    }
}
