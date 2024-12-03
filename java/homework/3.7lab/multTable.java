import java.util.Scanner;

public class multTable {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an min and max digit for the table");

        int min = userInput.nextInt();
        int max = userInput.nextInt();
         
        int row = min;
        int col = min;

        for (row = min; row <= max; row++){
            for (col = min; col<= max; col++){
                System.out.print(row * col + "\t");
            }System.out.println("\n")
        }


        

    }
}
