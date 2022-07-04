package interfaces;

// Child class reference and child class object - This will allow to access all the methods of base class and child class

public class AdvancedCalculator implements Calculator{

    public static void main(String[] args) {

        AdvancedCalculator obj1 = new AdvancedCalculator();

        obj1.add();
        obj1.sub();
        obj1.CalculateSin();
        obj1.CalculateCos();
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
