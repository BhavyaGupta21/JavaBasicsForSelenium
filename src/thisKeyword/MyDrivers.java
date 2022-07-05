package thisKeyword;

public class MyDrivers {

    public MyDrivers() {

        this("JDBC");
        System.out.println("Loading my drivers...");
    }

    public MyDrivers(String name) {

        this(10);
        System.out.println("Loading my drivers... and name is: " + name);
    }

    public MyDrivers(int count) {

        System.out.println("Loading my drivers... and count is: " + count);
    }

    public void Display() {

        System.out.println("I am in Display method");
    }

    public static void main(String[] args) {

        MyDrivers obj1 = new MyDrivers();
//        MyDrivers obj2 = new MyDrivers("JDBC");
//        MyDrivers obj3 = new MyDrivers(10);

        obj1.Display();
    }
}
