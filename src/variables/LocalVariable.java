package variables;

public class LocalVariable {

    int result;

    public static void main(String[] args) {

        int x = 0;

        System.out.println(x);

        LocalVariable variable = new LocalVariable();

        variable.printName();
    }

    public void printName() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Value of i is: " + i);
        }
    }

    public void marks() {

        int marks = 90;
    }

    public void show() {
        System.out.println("Result is: " + result);
    }
}
