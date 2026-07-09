//CO3 09/7/26 CO3

// Superclass
class Student {
    // Protected data members
    protected int rollNo;
    protected String name;
    protected double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Marks        : " + marks);
    }
}

// Subclass
class PGStudent extends Student {
    private String specialization;
    private int semester;

    // Constructor
    public PGStudent(int rollNo, String name, double marks,
                     String specialization, int semester) {
        super(rollNo, name, marks);
        this.specialization = specialization;
        this.semester = semester;
    }

    // Display PG student details
    public void displayPGStudent() {
        System.out.println("\nPG Student Details");
        System.out.println("------------------");
        System.out.println("Specialization : " + specialization);
        System.out.println("Semester        : " + semester);

        // Directly accessing protected members
        System.out.println("\nAccessing Protected Members:");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

// Main class
public class Task2 {
    public static void main(String[] args) {
        PGStudent student = new PGStudent(21, "Neha", 89, "AI & ML", 2);

        student.displayStudent();
        student.displayPGStudent();
    }
}