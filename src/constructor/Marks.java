package constructor;

public class Marks {

    int result;

    public static void main(String[] args) {

        Marks obj1 = new Marks(60);
        obj1.DisplayResult();
    }

    public Marks(int marks) {

        result = marks;
    }

    public void DisplayResult() {

        System.out.println("Final marks of the student is: " + result);
    }
}
