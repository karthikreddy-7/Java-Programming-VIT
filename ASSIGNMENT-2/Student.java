
/*
 *Create a class Student with data members Reg No., Name, Address, PhoneNo, Marks in six subjects 
 and gpa. Implement methods to find the average of the marks and GPA of the students. 
 Display the details of ‘n’ students along with their marks and gpa. 
 Whenever a student object is created, a unique running Reg No. has to be automatically created.
Overload the constructors.
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<StudentInfo> students = new ArrayList<>();
        int n = 2; // Number of students

        for (int i = 0; i < n; i++) {
            String name = "Student " + (i + 1);
            String address = "Address " + (i + 1);
            String phoneNo = "Phone " + (i + 1);
            int[] marks = { 80, 85, 75, 90, 88, 92 };
            StudentInfo student = new StudentInfo(name, address, phoneNo, marks);
            students.add(student);
        }

        System.out.println("Student Details:");
        for (StudentInfo student : students) {
            student.displayDetails();
            System.out.println();
        }

        double averageGPA = StudentInfo.findAverageGPA(students);
        double[] averageMarksSubjects = StudentInfo.findAverageMarksForAllSubjects(students);

        System.out.println("Average GPA of all students: " + averageGPA);
        for (int i = 0; i < averageMarksSubjects.length; i++) {
            System.out.println("Average marks in Subject " + (i + 1) + ": " + averageMarksSubjects[i]);
        }
    }
}

class StudentInfo {
    static int runningReg = 1000;
    int regNum;
    String name;
    String address;
    String phone;
    int[] marks;
    double gpa;

    // Overloading the constructor:
    public StudentInfo(String name, String address, String phone, int[] marks) {
        this.regNum = runningReg++;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
        calculateGPA();
    }

    public void calculateGPA() {
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        this.gpa = (double) totalMarks / 60;
    }

    public void displayDetails() {
        System.out.println("Reg No.: " + regNum);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No.: " + phone);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nGPA: " + gpa);
    }

    public static double findAverageGPA(List<StudentInfo> students) {
        double totalGPA = 0;
        for (StudentInfo student : students) {
            totalGPA += student.gpa;
        }
        return totalGPA / students.size();
    }

    public static double[] findAverageMarksForAllSubjects(List<StudentInfo> students) {
        int numSubjects = students.get(0).marks.length;
        double[] averageMarks = new double[numSubjects];

        for (StudentInfo student : students) {
            for (int i = 0; i < numSubjects; i++) {
                averageMarks[i] += student.marks[i];
            }
        }

        for (int i = 0; i < numSubjects; i++) {
            averageMarks[i] /= students.size();
        }

        return averageMarks;
    }
}
