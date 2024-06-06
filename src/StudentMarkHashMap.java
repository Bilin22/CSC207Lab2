import java.util.HashMap;

public class StudentMarkHashMap {
    // declare your variables
    private String courseCode;
    private int courseNumber;
    private HashMap<String, Integer> studentMarks;




    /**
     * TODO: Implement a constructor that takes a course code and course number
     * and initializes the HashMap.
     *
     * @param courseCode the course code. e.g. CSC
     * @param courseNumber the course number. e.g. 207
     */
    public StudentMarkHashMap(String courseCode, int courseNumber) {
        this.courseCode = courseCode;
        this.courseNumber = courseNumber;
        this.studentMarks = new HashMap<>();

    }


    /**
     * Implement the toString according to the example output shown above.
     *
     *  @return formatted String representation of this class's instance
     */
    @Override
    public String toString() {
        return "Course: " + courseCode + courseNumber + ", Students: " + studentMarks;

    }

    /**
     * TODO: Define a addStudentWithMark method that tries to add a student mark information to the HashMap,
     * and returns a boolean value to indicate whether it was successfully added.
     *
     * @param studentName the student name to be added
     * @param mark the mark that student scored
     * @return true if the student information was recorded successfully. If the student
     *          already exist in the HashMap, then return false.
     */
    public boolean addStudentWithMarks(String studentCode, int marks) {
        if (studentMarks.containsKey(studentCode)) {
            return false;
        } else {
            studentMarks.put(studentCode, marks);
            return true;
        }
    }


    /**
     * TODO: Define a hasStudent method that tells if the HashMap contains a specific student.
     * @param studentName the student name to check for
     * @return true if the student is in the HashMap otherwise false
     */
    public boolean hasStudent(String studentName) {
        return studentMarks.containsKey(studentName);
    }


    /**
     * TODO: Define a hasMark method that return whether the course has a student who scored a given mark.
     * @param mark the mark to check for
     * @return true if the mark exists otherwise false
     */
    public boolean hasMark(int mark){
        return studentMarks.containsValue(mark);
    }
}

