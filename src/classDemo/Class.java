package classDemo;

public class Class {

    int x = 90;
    int y = 100;

    public static void main(String[] args) {

        System.out.println("Program started");

        Class obj1 = new Class();
        obj1.sum();

        System.out.println("Value of x is: " + obj1.x);
        System.out.println("Value of y is: " + obj1.y);

        // IF we create a new object of the same class, then different memories are created for x & y
        Class obj2 = new Class();
        obj2.sum();

        System.out.println("Value of x is: " + obj2.x);
        System.out.println("Value of y is: " + obj2.y);

        System.out.println("Program ended");

    }

    public void sum() {
        int a = 90;
        int b = 100;
        int c = b + a;

        System.out.println("Sum of two numbers is: " + c);
    }
}
