package interfaces;

// Cannot create object of an interface as we need a body to be implemented and in the interface we do not have a body and so for the same reason we cannot implement the fourth scenario as well

public class AdvancedCalculator2 implements Calculator{

    public static void main(String[] args) {

        // We cannot create object of an interface because it has abstract methods
//        Calculator obj1 = new Calculator();
        //AdvancedCalculator2 = new Calculator();

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
