package loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        int ticket = 75;

        System.out.println("Loop started");

        do {
            System.out.println("Current ticket number is: " + ticket);
            ticket++;
        } while (ticket <= 100);

        System.out.println("Loop ended");
    }
}
