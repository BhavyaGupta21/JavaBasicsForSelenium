package wrapperClasses;

public class FourthWrapper {

    public static void main(String[] args) {

        // AutoBoxing
        int a = 100;

        Integer b = a;
        System.out.println("Value of b is: " + b);

        // Boxing

        int x = 200;
        Integer y = Integer.valueOf(x);
        System.out.println("Value of y is: " + y);

        // Unboxing
        Integer result  = 300;
        int newResult = result.intValue();
        System.out.println("New result is: " + newResult);

        //AutoUnboxing
        Integer marks = 400;
        int newMarks = marks;
        System.out.println("Marks are: " + newMarks);
    }
}
