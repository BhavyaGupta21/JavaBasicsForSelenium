package superKeyword;

public class ChildClass extends BaseClass {

    int interest_Rate = 10;

    public static void main(String[] args) {

        ChildClass obj1 = new ChildClass();
        System.out.println(obj1.interest_Rate);
        obj1.ShowMeInterestRateFromPvtBank();
    }

    public  void ShowMeInterestRate() {

        System.out.println("I am in the Child class");
        System.out.println("Current interest rate from RBI is: " + interest_Rate);
    }

    public  void ShowMeInterestRateFromPvtBank() {

        ShowMeInterestRate(); // Base class method will be called
        super.ShowMeInterestRate(); // Parent class method will be called

        System.out.println("Current interest rate from Private bank is: " + interest_Rate); // Child class variable will be called
        System.out.println("Current interest rate from RBI is: " + super.interest_Rate); // Parent class variable will be called
    }


}
