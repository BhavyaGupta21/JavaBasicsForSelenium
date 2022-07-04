package interfaces;

// Cannot create object of an interface as we need a body to be implemented and in the interface we do not have a body and so for the same reason we cannot implement the fourth scenario as well

public class AdvancedCalculator3 implements Calculator{

    public static void main(String[] args) {

        // Values of the variables defined in the interface cannot be changed as they are final by default
        //x = 10;

    }

    public void CalculateSin() {

        System.out.println("I am in AdvancedCalculator - Sin method");
    }

    public void CalculateCos() {

        System.out.println("I am in AdvancedCalculator - Cos method");
    }

    public void add() {

        System.out.println("I am in Calculator add method");

    }

    public void sub() {

        System.out.println("I am in Calculator sub method");
    }
}
