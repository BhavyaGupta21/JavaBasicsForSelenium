package wrapperClasses;

public class SecondWrapper {

    public static void main(String[] args) {

        String price1 = "986";

        String price2 = "9879";

        System.out.println(price1 + " " + price2);

        int p1 = Integer.parseInt(price1);
        int p2 = Integer.parseInt(price2);

        int sum = p1 + p2;
        System.out.println("Sum is: " + sum);

        if(sum > 10000) {
            System.out.println("Passed");
        }
        else  {
            System.out.println("Failed");
        }
    }
}
