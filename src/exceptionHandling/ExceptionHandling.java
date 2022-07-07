package exceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("Start");
        try
            {
                int c = 10 / 0;

                System.out.println("Division result is: " + c);

            } catch (ArithmeticException e) {

            System.out.println("Something went wrong, please check the exception: " + e.getMessage());
            System.out.println("Seems you have entered zero, please provide value > 0");
        }

        System.out.println("End");
    }
}
