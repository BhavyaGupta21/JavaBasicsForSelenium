package parameters;

public class PassParameter {

    public static void main(String[] args) {

        PassParameter obj1 = new PassParameter();

        obj1.add(455, 78);
        obj1.sub(789.65, 56.65);

    }

    public void add(int a, int b) {

        int c = a + b;
        System.out.println("Addition result is: " + c);
    }

    public void sub(double a, double b) {

        double result = a - b;
        System.out.println("Subtraction result is: " + result);
    }
}
