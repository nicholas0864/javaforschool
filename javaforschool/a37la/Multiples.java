package javaforschool.a37la;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a minimum a maximum and a multiple, enter zero for both if you wish to quit");
        int min = userInput.nextInt();
        int max = userInput.nextInt();
        int mult = userInput.nextInt();
        while (min != 0 && max != 0) {
            System.out.println("Do you want to find multiples or non multiples? Enter 1 for multiples or 0 for non multiples");
            String output = "";
            int multOrnot = userInput.nextInt();
            if (multOrnot == 1) {
                for (int tempMin = min; tempMin <= max; tempMin++) {
                    if (tempMin % mult == 0) {
                        output += (tempMin + " ");

                    }
                } System.out.println("The numbers that are multiples of " + mult + " from " + min + " to " + max + "are\n" + output);
            }if (multOrnot == 0) {
                for (int tempMin = min; tempMin <= max; tempMin++) {
                    if (tempMin % mult != 0) {
                        output += (tempMin + " ");

                    }
                } System.out.println("The numbers that are not multiples of " + mult + " from " + min + " to " + max + "are\n" + output);
            } System.out.println("Enter a minimum a maximum and a multiple, enter zero for both if you wish to quit");
            min = userInput.nextInt();
            max = userInput.nextInt();
            mult = userInput.nextInt();

        }

    }
}

