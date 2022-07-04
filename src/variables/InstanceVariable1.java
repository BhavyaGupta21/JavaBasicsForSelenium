package variables;

public class InstanceVariable1 {

    int rollNum;
    double marks;
    int x =100;

    public InstanceVariable1(int rollNum, double marks) {

        this.rollNum = rollNum;
        this.marks = marks;
    }

    public static void main(String[] args) {

        InstanceVariable1 obj1 = new InstanceVariable1(1, 80.5);
        obj1.show();

        InstanceVariable1 obj2 = new InstanceVariable1(2, 90.5);
        obj2.show();

        InstanceVariable1 obj3 = new InstanceVariable1(3, 95.5);
        obj3.show();
    }

    public void show() {

        int x = 0;
        System.out.println(x);

        System.out.println("Roll number is: " + rollNum + " and marks are: " + marks);
    }
}
