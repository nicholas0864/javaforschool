public class Student{
    private String name = null;
    private int grade = -1;
    private double gpa = 0.0;
    private int classes = -1;
    private String email = null;
    private int energy = -1;

    public Student(String aName, int aGrade, double aGpa, int theClasses, String anEmail) {
        name = aName;
        grade = aGrade;
        gpa = aGpa;
        classes = theClasses;
        email = anEmail;
        energy = 30;
    }public void addClass (int additionalClasses) {
        if (additionalClasses + classes > 7) {
            System.out.println("You can't add that many classes.");
        } else {
            classes = additionalClasses + classes;
        }
        energy -= 3;
    }
}