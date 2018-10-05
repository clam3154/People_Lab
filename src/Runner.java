public class Runner {

    private static String[] firstNames = {"Abby", "Derick", "Elijah", "Fin", "Gillian", "Helen", "Leon", "John", "Kenny", "Matthew", "Nate", "Priscilla"};
    private static String[] familyNames = {"McDonalds", "Anderson", "Smith", "Stevens", "Lee", "Chen"};
    private static String[] majors = {"Software Engineering", "Math", "Chemistry", "Biology", "Visual Art", "Media", "Fashion Design", "Metaphysics", "Astrology", "English", "Robotics"};

    public static void main(String[] args)
    {

    }

    public String randomStudent(String[] students)
    {
        for(int i = 0; i < 10; i++)
        {
            students[i] = firstNames[(int) (Math.random() * 12)];
            students[i] = familyNames[(int) (Math.random() * 6)];
            students[i] = majors[(int) (Math.random() * 11)];
        }
    }
}