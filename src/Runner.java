public class Runner {

    private static String[] firstNames = {"Abby", "Derick", "Elijah", "Fin", "Gillian", "Helen", "Leon", "John", "Kenny", "Matthew", "Nate", "Priscilla"};
    private static String[] familyNames = {"McDonalds", "Anderson", "Smith", "Stevens", "Lee", "Chen"};
    private static String[] majors = {"Software Engineering", "Math", "Chemistry", "Biology", "Visual Art", "Media", "Fashion Design", "Metaphysics", "Astrology", "English", "Robotics"};
    private static String[] teachers = {"Smith", "Rendsburg", "Schott", "Hofty"};
    private static String[] titles = {"Ms", "Mrs", "Mr."};

    public static void main(String[] args)
    {

        System.out.println(titles[(int) (Math.random() * 3)] + "." + teachers[(int) (Math.random() * 4)]);
        for(int i = 0; i < firstNames.length;i++)
        {
            double gpa = Math.floor(Math.random() * 4);
            System.out.println(firstNames[(int) (Math.random() * 12)] + " " + familyNames[(int) (Math.random() * 6)] + ", Major: " + majors[(int) (Math.random() * 11)] + " GPA: " + gpa);
        }
    }

    public String randomStudent(String[] students)
    {
            System.out.println(firstNames[(int) (Math.random() * 12)] + " " + familyNames[(int) (Math.random() * 6)] + " " + majors[(int) (Math.random() * 11)]);
            return (firstNames[(int) (Math.random() * 12)] + " " + familyNames[(int) (Math.random() * 6)] + " " + majors[(int) (Math.random() * 11)]);
}
}