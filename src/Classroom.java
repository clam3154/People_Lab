public class Classroom  {

    private Person[] students;
    private Person teacher;

    public Classroom(Person[] students, Person teacher )
    {
        this.students = students;
        this.teacher = teacher;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public String getSubject(String subject)
    {

    }
    public double classAverage()
    {
        double totalGPA = 0;
        int i = 0;
        for (i = 0; i < students.length - 1; i++) {
            totalGPA += students[i].GPA;
        }
        return totalGPA/i;
    }

    public String printClass()
    {
        System.out.println(teacher);
        System.out.println(subject);
        System.out.println(students);
    }
}
