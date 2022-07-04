package compileTimePolymorphism;

public class Compile {

    public static void main(String[] args) {

        Compile obj1 =  new Compile();

        obj1.add(455, 78);
        obj1.add(456, 78, 567);
        obj1.add(67.98, 968.98);
        obj1.add(876.09, 89);
        obj1.add(876, 89.98768);
    }

    public void add(int a, int b) {

        int c = a + b;
        System.out.println("Sum of numbers is: " + c);
    }

    public void add(int a, int b, int c) { // number of argument is different

        int d = a + b + c;
        System.out.println("Sum of numbers is: " + d);
    }

    public void add(double a, double b) { // Type of argument is different

        double c = a + b;
        System.out.println("Sum of numbers is: " + c);
    }

    public void add(double a, int b) { //Order of argument is different

        double c = a + b;
        System.out.println("Sum of numbers is: " + c);
    }

    public void add(int a, double b) { //Order of argument is different

        double c = a + b;
        System.out.println("Sum of numbers is: " + c);
    }
}
