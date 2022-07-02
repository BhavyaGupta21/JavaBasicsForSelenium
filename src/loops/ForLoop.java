package loops;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Loop started");

        for (int i = 0; i < 20; i++) {
            System.out.println("i values is: " + i);
        }

        System.out.println("Loop ended");

        System.out.println("Loop started");

        for (int i = 0; i < 20; i = i + 2) {
            System.out.println("i values is: " + i);
        }

        System.out.println("Loop ended");
    }
}
