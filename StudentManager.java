import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, age, department, marks);

        students.add(s);

        System.out.println("\nStudent Added Successfully!");
    }

    public void viewStudents() {

    if (students.isEmpty()) {
        System.out.println("No Students Found.");
        return;
    }

    for (Student s : students) {
        s.display();
        System.out.println("------------------------------");
    }
    }

    public void searchStudent() {

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    for (Student s : students) {

        if (s.getId() == id) {
            System.out.println("\nStudent Found");
            s.display();
            return;
        }

    }

    System.out.println("Student Not Found.");

    }

}