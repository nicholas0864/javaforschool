import java.util.Scanner;

public class LetterMatches{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a word and a two letter couplet");
        String word = userInput.nextLine();
        String coup = userInput.nextLine();
        int start = 0;
        int count = 0;
        boolean isIn = true;
        while (isIn){
            for(int i = 0; i <= word.length() - coup.length(); i++){
                if (word.substring(i, i + coup.length()).equals(coup)) {
                    count++;
            } else{
                isIn = false;
            }
        } System.out.println("The couplet \" " + coup + "\" is found " + count + " times\nin the word " + word);
    }
}
}