package finalKeyword;

public class FinalMethod extends ParentClass{

    public static void main(String[] args) {

        FinalMethod obj1 = new FinalMethod();
        obj1.Name();
        obj1.Address();
        obj1.Phone();
    }

    public void Address() {

        System.out.println("My City is Hyderabad");
    }

    public void Phone() {

        System.out.println("My number is 0000000000");
    }
}
