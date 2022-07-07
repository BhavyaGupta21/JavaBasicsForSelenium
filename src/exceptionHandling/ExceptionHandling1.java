package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling1 {

    public static void main(String[] args) {

        System.out.println("Start");
        try
            {
                int c = 10 / 0;

                System.out.println("Division result is: " + c);

            } catch (ArithmeticException e) {

            System.out.println("Something went wrong, please check the exception: " + e.getMessage());
            System.out.println("Seems you have entered zero, please provide value > 0");
        } catch (InputMismatchException e) {
            System.out.println("Hey please enter only integer values");
        } catch (Exception e) { // This is the parent class and should always come at the last as this will get counted in Dev code which never gets executed

            System.out.println("Oops something went wrong");
        }
        finally {
            System.out.println("Finally block");
            System.out.println("End");
        }

    }
}
