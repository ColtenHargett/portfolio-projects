
/**
 * A student's name and grades, with methods to add, sort,
 * find the max and average them.
 */
public class Student {

    // Attributes
    private String studentName;

    private int[] grades;
    private int totalGrades;
    private int gradeCount;


    /**
     * A default constructor that sets safe starting values.
     */
    public Student() {
        studentName = "";

        grades = new int[0];
        totalGrades = 0;
        gradeCount = 0;

    }

    /**
     * A setter constructor that assigns values from Main.java to the attributes.
     *
     * @param studentName the student's name
     * @param grades the grade array (should be sized to the max number of grades)
     * @param totalGrades the maximum number of grades allowed
     */
    public Student(String studentName, int[] grades, int totalGrades, int gradeIndex) {
        this.studentName = studentName;
        this.grades = grades;
        this.totalGrades = totalGrades;
        this.gradeCount = 0;

    }

    /**
     * Sets the student's name.
     *
     * @param student the student's name
     */
    public void addStudent(String student) {
        this.studentName = student;
    }

    /**
     * Adds a grade to the student's grade array if space remains.
     *
     * @param grade the grade being added
     * @return the grades array after adding the grade
     */

    public int[] addGrade(int grade) {
        if (grades == null || gradeCount >= totalGrades || gradeCount >= grades.length) {
            System.out.println("Cannot add more grades for " + studentName + ".");
            return grades;
        }

        grades[gradeCount] = grade;
        gradeCount++;

        return grades;
    }

    /**
     * Sorts the student's grades in ascending order (insertion sort).
     *
     * @return the grades array after sorting
     */
    public int[] sortGrades() {
        for (int i = 1; i < gradeCount; i++) {
            int key = grades[i];
            int j = i - 1;


            while (j >= 0 && grades[j] > key) {
                grades[j + 1] = grades[j];
                j--;
            }

            grades[j + 1] = key;
        }

        // Print sorted grades
        System.out.print(studentName + " Grades: ");
        for (int i = 0; i < gradeCount; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        return grades;
    }

    /**
     * Finds and returns the highest grade currently stored for the student.
     *
     * @return the max grade (0 if no grades entered)
     */
    public int getMaxGrade() {
        if (gradeCount == 0) return 0;

        int max = grades[0];
        for (int i = 1; i < gradeCount; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    /**
     * Calculates and returns the student's average grade using integer division.
     *
     * @return the average grade (0 if no grades entered)
     */
    public double getAverageGrade() {
        if (gradeCount == 0) return 0;

        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }


        return (double) sum / gradeCount;

    }

    /**
     * Displays the student's name along with their average grade.
     */
    public void displayStudentAverages() {
        System.out.println(studentName + " average: " + getAverageGrade());
    }

    /**
     * Returns the student name (helper for Main printing).
     *
     * @return the student's name
     */
    public String getStudentName() {
        return studentName;
    }
}