package superKeyword;

public class SubClass extends ParentClass {

    public SubClass() {

        System.out.println("I am in Child class constructor");
    }

    public SubClass(String name) {

        super(name);
        System.out.println("I am in Child class constructor");
        System.out.println("Name is: " + name);
    }

    public static void main(String[] args) {

        SubClass obj1 = new SubClass("Test");
    }
}
