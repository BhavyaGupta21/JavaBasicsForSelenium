package parameters;

public class ReturningValues {

    public static void main(String[] args) {

        ReturningValues obj1 = new ReturningValues();

        int sum = obj1.add(455, 78);
        double result = obj1.sub(789.65, 56.65);

        System.out.println("Addition result is: " + sum);
        System.out.println("Subtraction result is: " + result);
        System.out.println();

        DynamicCalculator d = new DynamicCalculator();
        double div = d.div(987.87, 56.65);
        int mul = d.mul(87, 95897);

        System.out.println("Division result is: " + div);
        System.out.println("Multiplication result is: " + mul);
        System.out.println();

        String fullName = DynamicCalculator.getMyFullName("Hello", "Selenium");
        System.out.println(fullName);
    }

    public int add(int a, int b) {

        int c = a + b;
        return c;
    }

    public double sub(double a, double b) {

        double result = a - b;
        return result;
    }
}
