package strings;

public class Strings3 {

    public static void main(String[] args) {

        String fullName = "Selenium-HP-QTP-Grid";

        String []toolName = fullName.split("-");

        for(int i = 0; i < toolName.length; i++) {

            System.out.println("Value of " + i + " is: " + toolName[i]);

            if(toolName[i].equalsIgnoreCase("Selenium")) {
                System.out.println("Test passed");
                break;
            }
        }
    }
}
