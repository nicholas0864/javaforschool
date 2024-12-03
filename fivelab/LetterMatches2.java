import java.util.Scanner;

public class LetterMatches2{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = userInput.nextLine();
        String word2 = userInput.nextLine();
        String output = "";
        int count = 0;
        
        for (int i = 0; (i+2) <= word1.length(); i++){
            for(int j = 0; (j+2) <= word2.length(); j++){
                if (word1.substring(i, i+2).equals(word2.substring(j, j+2))){
                    output += word1.substring(i, i+2) + " ";
                    count ++;
                }
            }
        } System.out.println("There are " + count + " two-letter matches in \n" + word1 + " and " + word2 + "\nThey are " + output);
    }
}