public class Student{
    private String name = null;
    private int grade = 0;
    private int gpa = 0;
    private int numOfClasses = 0;
    private String email = null;
    private int energy = 0;

    public Student(String aName, int aGrade, int aGpa, int aNumOfClasses, String aEmail) {
        name = aName;
        grade = aGrade;
        gpa = aGpa;
        numOfClasses = aNumOfClasses;
        email = aEmail;
        energy = 30;
    }

    public void addClass(int numToBeAdded){
        if ((numOfClasses + numToBeAdded) <= 7) {
            numOfClasses += numToBeAdded;
            energy -= 3;
        } else {
            System.out.println("You can't add that many classes");
        }
    }

    public void dropClass(int numToBeDropped){
        if((numOfClasses - numToBeDropped) > 6){
            numOfClasses -= numToBeDropped;
            energy -= 3;
        } else {
            System.out.println("You cannot drop that many classes");
        }
    }

    public void advanceGrade(){
        grade += 1;
        energy -= 3;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int getGpa(){
        return gpa;
    }

    public int getClasses(){
        return numOfClasses;
    }

    public String getEmail(){
        return email;
    }

    public int getEnergy(){
        return energy;
    }

    public String toString(){
        String output = ("Name: " + name + " Grade: " + grade + "\nGPA: " + gpa + "Classes: " + numOfClasses + "\nEmail: " + email + "Energy: " + energy);
        return output;
    }
 }
