import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userAnswer = ("Do you like Ham Sandwiches? (y/n) ?");

        userAnswer = keyboard.next();

        {
            if (userAnswer.equals("y")) {
            }
            System.out.println("Me too!");
        }

        {
            else if (userAnswer.equals("n"))
            System.out.println("That's okay, many other foods exist!");
        }

    }
}



