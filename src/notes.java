import java.util.Locale;
import java.util.Scanner;
public class notes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA;
        String playerB;
        String trash = "";
        boolean done = false;
        String playerChoice = "";
        boolean YorN = false;
        // loop
        do {
            do {
                // players deciding moves

                playerA = playerMove(in, "what is player A move?");

                playerB = playerMove(in, "what is player B move?");

                //player moves being outputted back

                System.out.println("Player A move is " + playerA);

                System.out.println("Player B move is " + playerB);
                // winning decisions
                if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                    System.out.println("player A wins! rock beats scissors.");
                    // every done=true; is a loop exit
                    done = true;
                } else if (playerB.equalsIgnoreCase("r") && playerA.equalsIgnoreCase("s")) {
                    System.out.println("player B wins! rock beats scissors.");
                    done = true;
                } else if (playerB.equalsIgnoreCase("r") && playerA.equalsIgnoreCase("p")) {
                    System.out.println("player A wins! Paper beats rock.");
                    done = true;
                } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                    System.out.println("player B wins! Paper beats rock.");
                    done = true;
                } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                    System.out.println("player A wins! Scissors beats paper.");
                    done = true;
                } else if (playerB.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("p")) {
                    System.out.println("player B wins! Scissors beats paper.");
                    done = true;
                }
                // draw conditions met if reached
                else {
                    System.out.println("This match was a draw!");
                }
                // end of loop 1
            } while (!done);
            // loop 2 start
            System.out.println("Would you like to keep playing? Type y or n for yes or no.");
            if (in.hasNextLine()) {
                playerChoice = in.nextLine();
            }
            playerChoice = playerChoice.toLowerCase();
            switch (playerChoice) {
                case "n":
                    // loop exit
                    System.out.println("Thanks for playing!");
                    YorN = true;
                    break;
                case "y":
                    // loop return
                    YorN = false;
                    break;
                default:
                    // bulletproofing
                    trash = in.nextLine();
                    System.out.println("That is not a valid input.");
                    break;
            }
        } while (!YorN);

    }
    // method
    private static String playerMove(Scanner pipe, String message) {
        // method variables

        String move;
        boolean done = false;
        while (true) {

            System.out.println(message);
            move = pipe.nextLine();
            if (move.equalsIgnoreCase("r") || move.equalsIgnoreCase("p") || move.equalsIgnoreCase("s")) {

                break;

            } else {
                System.out.println("Incorrect input, please try again");
            }

        }
        // method return
        return move;
    }
}
