package thisKeyword;

public class MyVariables {

    int x;
    int y;

    public MyVariables(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void sum() {

        int sum = x + y;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {

        MyVariables obj1 = new MyVariables(10, 50);
        obj1.sum();
    }
}
