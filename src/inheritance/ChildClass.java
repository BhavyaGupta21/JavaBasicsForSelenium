package inheritance;

// Child class reference and child class object - This will allow to access all the methods of base class and child class
public class ChildClass extends BaseClass {

    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();

        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();
    }

    public void mul() {

        System.out.println("Hey I am in child class and mul method");
    }

    public void div() {

        System.out.println("Hey I am in child class and div method");
    }
}
