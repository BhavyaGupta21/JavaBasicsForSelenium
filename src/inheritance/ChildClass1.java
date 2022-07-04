package inheritance;

// Base class reference and Base class object - This allows to access all the methods of base class only
public class ChildClass1 extends BaseClass {

    public static void main(String[] args) {
        BaseClass obj1 = new BaseClass();

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
