import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        // define max grades and students
        int numGrades = 5;
        int numStudents = 3;
        int innerIndex = 0; // temporary value

        Student[] students = new Student[numStudents];

        for (int i = 1; i <= numStudents; i++){
            String name = "";
            int[] gradeList = new int[numGrades];

            students[i - 1] = new Student(name, gradeList, numGrades, innerIndex);

            // ask for a student name
            System.out.print("Student " + i + " name: ");
            name = input.nextLine();

            // create a student in the array
            students[i - 1].addStudent(name);

            // ask for a student's grade
            for (int j = 1; j <= numGrades; j++){
                System.out.print("Grade number " + j + " for " + name + " : ");
                int grade = input.nextInt();

                students[i - 1].addGrade(grade);
            }

            input.nextLine();

            // ask if the user wants to sort the grades
            System.out.print("Do you want to sort the grades in ascending order? (y/n): ");
            String sortResponse = input.nextLine();

            if (sortResponse.equals("y")) {
                students[i - 1].sortGrades();
            }
        }

        System.out.println();
        System.out.println("Class Averages:");
        for (Student student : students) {
            student.displayStudentAverages();
        }

        // print out the highest grade for each student along with their name
        System.out.println("Max grades: ");

        for (Student student : students) {
            System.out.println(student.getStudentName() + "'s highest grade: " + student.getMaxGrade());
        }

        input.close();
    }
}