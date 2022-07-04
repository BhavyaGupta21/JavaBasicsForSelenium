package abstractClass;

public class HRTeam extends ITDepartment {

    public static void main(String[] args) {

        HRTeam hr = new HRTeam();
        hr.goodies();
        hr.work();
        hr.salary();
        hr.bonus();

        ITDepartment it = new HRTeam();
        it.goodies();
        it.work();
        it.salary();

        //ITDepartment it1 = new ITDepartment();
        // If class is not fully implemented then object will not be created
        // In interface no method is implemented
        // Interface is 100% abstract class
    }

    public void bonus() {

        System.out.println("Bonus is 1Lakh");
    }

    public void salary() {

        System.out.println("5LPA");
    }
}
