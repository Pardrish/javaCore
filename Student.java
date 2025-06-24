public class Student {
    String name;
    int id;
    int[] marks = new int[5];
    char grade;
    int average;

    public Student(String name, int id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
       // calculateGrade();
    }

    public void calculateGrade() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / marks.length;

        if (average >= 80) grade = 'A';
        else if (average >= 60) grade = 'B';
        else if (average >= 30) grade = 'C';
        else grade = 'F';
    }

    public void displayStudentInfo() {
        System.out.println("----- Student Details -----");
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.print("Marks = ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        // calculateGrade();
        System.out.println();
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
    }
}
