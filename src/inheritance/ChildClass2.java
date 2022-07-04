package inheritance;

// Child class reference and Base class object - This will be invalid scenario. Child cannot hold parent.
public class ChildClass2 extends BaseClass {

    public static void main(String[] args) {
        BaseClass obj1 = new ChildClass2();

        obj1.add();
        obj1.sub();
    }

    public void mul() {

        System.out.println("Hey I am in child class and mul method");
    }

    public void div() {

        System.out.println("Hey I am in child class and div method");
    }
}
