package methodOverriding;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {

        // Child class method will be called
        ChildClass obj1 = new ChildClass();
        obj1.Display();

        // Parent class method will be called
        ParentClass obj2 = new ParentClass();
        obj2.Display();

        // Child class method will be called
        ParentClass obj3 = new ChildClass();
        obj3.Display();

        //Invalid Scenario
        //ChildClass obj4 = new ParentClass();
    }

    public void Display() {

        System.out.println("I am in child class Display method");
    }

    public void Display(String name) {

        System.out.println("I am in child class Display method");
    }
}
