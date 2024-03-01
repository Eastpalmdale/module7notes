import java.util.Scanner;
public class notes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";


        playerA = playerMove(in,"what is player A move?");

        playerB = playerMove(in,"what is player B move?");

        System.out.println("Player A move is "+ playerA);

        System.out.println("Player B move is "+ playerB);

    }

    private static String playerMove(Scanner pipe, String message) {

        String move;

        while(true){


            System.out.println(message);
            move = pipe.nextLine();
            if (move.equalsIgnoreCase("r") || move.equalsIgnoreCase("p") || move.equalsIgnoreCase("s")) {

                break;

            }
            else {
                System.out.println("Incorrect input, please try again");
            }

        }
        return move;
    }
}
