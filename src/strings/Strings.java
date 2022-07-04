package strings;

public class Strings {

    public static void main(String[] args) {

        String name = "Selenium WebDriver";
        boolean status = name.startsWith("Selenium");
        System.out.println("Status is: " + status);

        String name1 = "Welcome to Selenium WebDriver world";
        boolean status1 = name1.endsWith("world");
        System.out.println("New status is: " + status1);
    }
}
