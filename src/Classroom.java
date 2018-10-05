public class Classroom  {

    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] students, Teacher teacher )
    {
        this.students = students;
        this.teacher = teacher;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubject(String Subject)
    {
        Subject = Subject;
        return Subject;
    }

    public double classAverage(Student[] Student)
    {
        double totalAvg = 0;

        for(int i = 0;i<this.students.length;i++)
        {

            totalAvg += this.students[i].getGPA();
        }

        return totalAvg/students.length;
    }

    public String printClass()
    {
        System.out.println(teacher);
        System.out.println(Subject);
        System.out.println(students);
    }
}
