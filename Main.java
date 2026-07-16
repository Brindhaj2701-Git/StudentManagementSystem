public class Main{
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===\n");

        Student student = new Student(
                101,
                "Brindha",
                21,
                "CSE",
                92.5
        );

        student.display();
    }
}