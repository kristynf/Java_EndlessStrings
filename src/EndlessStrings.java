

import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);

       String userInput;

        userInput = keyboard.nextLine();

        while (!userInput.equals("")) {
           System.out.println(userInput);
            System.out.println("Enter a character: ");
            userInput = keyboard.nextLine();
        }


    }
}