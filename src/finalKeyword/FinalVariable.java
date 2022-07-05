package finalKeyword;

public class FinalVariable {

    public static void main(String[] args) {

        FinalVariable obj1 = new FinalVariable();
        obj1.Show();
    }

    public void Show() {

        int marks = 90;
        marks = 95;

        final int FINAL_MARKS = 80;

        System.out.println("Marks are: " + marks);
        System.out.println("Final marks are: " + FINAL_MARKS);

    }
}
