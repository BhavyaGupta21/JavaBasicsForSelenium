package parameters;

public class DynamicCalculator {

    public static String getMyFullName(String firstName, String lastName) {

        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public double div(double x, double y) {

        double result = x / y;
        return result;
    }

    public int mul(int x, int y) {

        int result = x * y;
        return result;
    }
}
