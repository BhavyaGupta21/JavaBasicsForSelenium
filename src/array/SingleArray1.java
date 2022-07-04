package array;

public class SingleArray1 {

    public static void main(String[] args) {

        // 20 byte of memory
        int student_ID[] = new int[5];

        student_ID[0] = 45;
        student_ID[1] = 450;
        student_ID[2] = 56;
        student_ID[3] = 78;
        student_ID[4] = 68;

        int sizeOfArray = student_ID.length;

        System.out.println("length of the array is: " + sizeOfArray);

        for(int i = 0; i < sizeOfArray; i++) {

            System.out.println("Student ID: " + student_ID[i]);
        }

        System.out.println();

        while(sizeOfArray > 0) {
            System.out.println("Student ID: " + student_ID[sizeOfArray - 1]);
            sizeOfArray--;
        }

        System.out.println();

        String student_Name[] = new String[5];

        student_Name[0] = "John";
        student_Name[1] = "Doe";
        student_Name[2] = "Jane";
        student_Name[3] = "William";
        student_Name[4] = "Smith";

        int sizeOfArray2 = student_Name.length;

        for(int i = 0; i < sizeOfArray2; i++) {

            System.out.println("Student Name: " + student_Name[i]);
        }

        System.out.println();

        while(sizeOfArray2 > 0) {
            System.out.println("Student ID: " + student_Name[sizeOfArray2 - 1]);
            sizeOfArray2--;
        }
    }
}
