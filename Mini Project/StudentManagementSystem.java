import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Course: " + course);
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        boolean found = false;

        for (Student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Age: ");
                s.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter new Course: ");
                s.setCourse(sc.nextLine());
                System.out.println("Student updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found.");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
