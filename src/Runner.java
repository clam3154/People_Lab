public class Runner {

    private static String[] firstNames = {"Abby", "Derick", "Elijah", "Fin", "Gillian", "Helen", "Leon", "John", "Kenny", "Matthew", "Nate", "Priscilla"};
    private static String[] familyNames = {"McDonalds", "Anderson", "Smith", "Stevens", "Lee", "Chen"};
    private static String[] majors = {"Software Engineering", "Math", "Chemistry", "Biology", "Visual Art", "Media", "Fashion Design", "Metaphysics", "Astrology", "English", "Robotics"};

    public static void main(String[] args)
    {

    }

    public String randomStudent(String[] students)
    {
        students[0] = firstNames[(int) (Math.random() * 12)];
        students[1] = familyNames[(int) (Math.random() * 6)];
        students[2] = majors[(int) (Math.random() * 11)];
    }
}