package a37la;

import java.util.Scanner;

public class DigitDisplay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a positive number");
        
        int num = userInput.nextInt();

        String output = "";

        while (num > 0) {
            int digit = num % 10;
            String line = "";
            for (int i = 0; i < 9 - digit; i++){
                line += " ";
            } for (int j = 0; j < digit; j++) {
                line += digit;
            } output = line + "\n" + output;
            num /= 10;

    }
     System.out.println(output); 
    }
}

