import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.searchStudent();
                    break;

                case 4:
                    manager.updateStudent();
                    break;

                case 5:
                    manager.deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }
}