import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private int marks;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = -1; 
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);

        if (marks != -1) {
            System.out.println("Marks: " + marks);
        } else {
            System.out.println("Marks not set");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        
        Student student = new Student(name, rollNumber, age);


        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        student.setMarks(marks);


        student.displayStudentDetails();

        scanner.close();
    }
}
