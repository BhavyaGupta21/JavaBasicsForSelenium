package conditionalStatements;

public class IfElse {

    public static void main(String[] args) {

        String browser = "FireFox";

        System.out.println("Test started");

        if(browser.equalsIgnoreCase("Firefox")) {

            System.out.println("TC executed on Firefox");
        } else if(browser.equalsIgnoreCase("Chrome")) {

            System.out.println("TC executed on Chrome");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("TC executed on IE");
        }
        else {
            System.out.println("Kindly provide valid browser name");
        }

        System.out.println("Test ended");
    }
}
