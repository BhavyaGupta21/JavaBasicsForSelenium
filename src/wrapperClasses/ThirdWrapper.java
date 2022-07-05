package wrapperClasses;

public class ThirdWrapper {

    public static void main(String[] args) {

        String price1 = "986.9787";

        String price2 = "9879.76465";

        System.out.println(price1 + " " + price2);

        double p1 = Double.parseDouble(price1);
        double p2 = Double.parseDouble(price2);

        System.out.println(p1);
        System.out.println(p2);

        double sum = p1 + p2;
        System.out.println("Sum is: " + sum);

        if(sum > 10000) {
            System.out.println("Passed");
        }
        else  {
            System.out.println("Failed");
        }
    }
}
