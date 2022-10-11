public class Student {
    private String name;
    private double cGPA;
    private int id;

    public Student(String name, double cGPA, int id) {
        this.name = name;
        this.cGPA = cGPA;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getcGPA() {
        return cGPA;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
