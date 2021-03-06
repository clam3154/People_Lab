public class Student extends Person{

    private double GPA;
    private String major;
    private String clubs;

    public Student(String firstName, String familyName, String major, String clubs, double GPA) {

        super(firstName, familyName);
        this.GPA = GPA;
        this.major = major;
        this.clubs = clubs;

    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    @Override
    public String toString() {
        return getFamilyName() + ", " + getFirstName();
    }

}