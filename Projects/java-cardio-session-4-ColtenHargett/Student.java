public class Student {
    // Fields
    String name;
    int grade;

    // Default Constructor
    public Student(){
        name = "";
        grade = 0;
    }

    // Regular Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    // Returns "A", "B", "C", "D", or "F" based on grade
    public String getLetterGrade() {
        if (grade >= 90) {
            return "A";
        }
        else if (grade >= 80) {
            return "B";
        }
        else if (grade >= 70) {
            return "C";
        }
        else if (grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }


    }

    // Prints the student's name, numeric grade, and letter grade
    public void printReport() {
        System.out.println("Name: " + name + " | Grade: " + grade + " | Letter: " + getLetterGrade());

    }
}
