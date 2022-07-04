package interfaces;

// Base class reference and Base class object - This allows to access all the methods of base class only

public class AdvancedCalculator1 implements Calculator{

    public static void main(String[] args) {

        Calculator obj1 = new AdvancedCalculator1();

        obj1.add();
        obj1.sub();
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
