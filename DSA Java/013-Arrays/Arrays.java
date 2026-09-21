import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[100];
        // int numbers[] = { 1, 2, 3 };
        // String fruits[] = { "Apple", "Mango", "Banana" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of Array Marks: " + marks.length);
        marks[0] = sc.nextInt(); // Phy
        marks[1] = sc.nextInt(); // Chem
        marks[2] = sc.nextInt(); // Maths

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        marks[2] = 100; // Updated marks of Maths
        marks[0] = marks[0] + 2; // Updated marks of Physics
        System.out.println("Physics: " + marks[0]);
        System.out.println("Maths: " + marks[2]);

        // Arrays are type of Call by reference it means that can be change or update
        // values.
        sc.close();

    }
}