public class Checker {
    public void checkInputCases(int cases) {
        if (cases < 2 || cases > 1000) {
            throw new RuntimeException("Input number of the cases is not valid");
        }
    }

    public void checkInputStudent(Student student) {
        if (student.getName().length() < 2 || student.getName().length() > 30) {
            throw new RuntimeException("Input student name is not valid - " + student.getName());
        }

        if (student.getId() < 1 || student.getId() > Math.pow(10, 5)) {
            throw new RuntimeException("Input student id is not valid - " + student.getId());
        }

        if (student.getcGPA() < 0 || student.getcGPA() > 4.00) {
            throw new RuntimeException("Input student CGPA is not valid - " + student.getcGPA());
        }
    }
}
