import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an integer");

        int num = userInput.nextInt();

        String numStr = String.valueOf(num);

        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;
        String oddStr = "";
        String evenStr = "";
        String zeroStr = "";

        for ( int i = 0; i < numStr.length(); i++){
            if (numStr.charAt(i) == '0'){
                zeroCount++;
                zeroStr += "*";
            } else if (numStr.charAt(i) % 2 == 0) {
                evenCount++;
                evenStr += "*";
            } else {
                oddCount++;
                oddStr += "*";
            }
            } System.out.println("" + num + "\nOdd: " + oddCount + "\t" + oddStr + "\nEven: " + evenCount + "\t" + evenStr + "\nZero: " + zeroCount + "\t" + zeroStr);
        }

        

    }

