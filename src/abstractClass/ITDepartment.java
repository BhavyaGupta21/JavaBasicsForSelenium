package abstractClass;

public abstract class ITDepartment implements Employee{

    public abstract void salary();

    public void goodies() {

        System.out.println("Laptop");
    }

    public void work() {

        System.out.println("Automation");
    }
}
