package constructor;

public class Student {

    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.DisplayResult();

        Student obj2 = new Student("DPS");
        Student obj3 = new Student(2);
        Student obj4 = new Student("DPS", 2);
        Student obj5 = new Student(2, "DPS");
    }

    public Student() {

        System.out.println("Welcome to school");
    }

    public Student(String schoolName) {

        System.out.println("School name is: " + schoolName);
    }

    public Student(int rank) {

        System.out.println("Rank is: " + rank);
    }

    public Student(String schoolName, int rank) {

        System.out.println("School name is: " + schoolName + " and rank is: " + rank);
    }

    public Student(int rank, String schoolName) {

        System.out.println("School name is: " + schoolName + " and rank is: " + rank);
    }

    public void DisplayResult() {

        System.out.println("Marks are 90");
    }
}
