public abstract class Classroom  {
    private Person[] students;
    private Person teacher;
    public Classroom(Person[] students, Person teacher )
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject(String Subject)
    {

    }
    public String classAverage()
    {
        int totalGPA = 0;
        for (int i = 0; i < students.length - 1; i++) {
            totalGPA += students[i].GPA ;
        }
    }

    public String printClass()
    {

    }
    public static void main(String[] args)
    {

    }
}
