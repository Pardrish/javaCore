import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            students[i] = new Student(name, id, marks);
        }

        System.out.println("\n--- All Students Report---");
        for (Student s : students) {
            s.calculateGrade();
            s.displayStudentInfo();
        }
    }
}
