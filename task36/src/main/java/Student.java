public class Student {
    private int id;
    private String name;
    private double CGPA;

    public Student(int id, String name, double CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return name;
    }
}
