public class NumberPair {
    private double num1 = 0;
    private double num2 = 0;
    public NumberPair(double aNum1, double aNum2){
        num1 = aNum1;
        num2 = aNum2;
    }

    public double getNum1(){
        return num1;
    }
    
    public double getNum2(){
        return num2;
    }

    public double calculateArithmeticMean(){
        double output = ((num1 + num2) / 2);
        return output;
    }
    public double calculateGeometricMean(){
        if (num1 < 0 || num2 < 0){
            return 0;
        } else {
            return Math.sqrt(num1 * num2);
        }

    }

    public double calculateHypotenuse(){
        return Math.sqrt(num1 * num1 + num2 * num2);
    }

    public boolean isMadeOfInts() {
        return num1 == (int) num1 && num2 == (int) num2;
    } 
    public String toString(){
        String nums = "";
        String output = "";
        if (num1 > num2){
            nums += "Number1: " + num1 + "  Number2: " + num2 + " "; 
        } else {
            nums += "Number2: " + num2 + "  Number1: " + num1 + " "; 
        }
        //output += "\nArithmetic Mean: " + calculateArithmeticMean() + "\nGeometric Mean: " + calculateGeometricMean() + "\nLength of Hypotenuse: " + calculateHypotenuse();

        output += nums + "\nThe Arithmetic Mean is " + calculateArithmeticMean() + "\nThe Geometric Mean is: " + calculateGeometricMean() + "\nThe Hypotenuse is: " + calculateHypotenuse() + "This pair is made of ints: " + isMadeOfInts();
        
        return output;

    }

}

