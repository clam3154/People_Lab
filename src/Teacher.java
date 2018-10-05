public class Teacher extends Person
{
    private String Subject;
    private String Title;
    public Teacher(String Subject, String Title)
    {
        super(Subject, Title);
        this.Subject = Subject;
        this.Title = Title;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    @Override
    public String toString()
    {
        return Title + ". " + getFamilyName();
    }
}