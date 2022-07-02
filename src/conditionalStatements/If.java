package conditionalStatements;

public class If {

    public static void main(String[] args) {

        int a = 90;

        System.out.println("Test started");

        if(a <= 100) {

            System.out.println("First if block");
            System.out.println("Value of a is: " + a);
        }

        System.out.println();

        if(a <= 50) {

            System.out.println("Second if block");
            System.out.println("Value of a is: " + a);
        }

        System.out.println("Test ended");
    }
}
