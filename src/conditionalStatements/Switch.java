package conditionalStatements;

public class Switch {

    public static void main(String[] args) {

        int x = 4;

        switch (x) {
            case 1:
                System.out.println("Performance is poor");
                break;
            case 2:
                System.out.println("Slow performer");
                break;
            case 3:
                System.out.println("Meeting expectation");
                break;
            case 4:
                System.out.println("Well done keep rocking");
                break;
            case 5:
                System.out.println("Employee of the year");
                break;
            default:
                System.out.println("You are fired");
        }
    }
}
