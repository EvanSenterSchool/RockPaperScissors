import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerA;
        String playerB;
        String rock = "R";
        String paper = "P";
        String scissors = "S";
        String yes = "Y";
        String no = "N";
        String playAgain;
        boolean playerOne = false;
        boolean playerTwo = false;
        boolean play = true;
        boolean do_You_Wanna_Playagain = false;

        Scanner scan = new Scanner(System.in);
        do {
            do {
                System.out.println("Player A what do you choose Please type R for rock, P for paper or S for scissors.");
                playerA = scan.nextLine();
                if (playerA.equals(rock)) {
                    playerOne = true;
                } else if (playerA.equals(paper)) {
                    playerOne = true;
                } else if (playerA.equals(scissors)) {
                    playerOne = true;
                } else {
                    System.out.println("You did not enter the correct letters please chose from R, P, or S");
                }
            } while (!playerOne);
            do {
                System.out.println("Player B what do you choose Please type R for rock, P for paper or S for scissors.");
                playerB = scan.nextLine();
                if (playerB.equals(rock)) {
                    playerTwo = true;
                } else if (playerB.equals(paper)) {
                    playerTwo = true;
                } else if (playerB.equals(scissors)) {
                    playerTwo = true;
                } else {
                    System.out.println("You did not enter the correct letters please chose from R, P, or S");
                }
            } while (!playerTwo);
            //winners
            if (playerA.equals(rock) && playerB.equals(scissors))
                System.out.println("Rock breaks Scissors player A wins");
            if (playerA.equals(scissors) && playerB.equals(rock))
                System.out.println("Rock breaks Scissors player B wins");
            if (playerA.equals(paper) && playerB.equals(rock))
                System.out.println("Paper covers Rock player A wins");
            if (playerA.equals(rock) && playerB.equals(paper))
                System.out.println("Paper covers Rock player B wins");
            if (playerA.equals(scissors) && playerB.equals(paper))
                System.out.println("Scissors cut Paper player A wins");
            if (playerA.equals(paper) && playerB.equals(scissors))
                System.out.println("Scissors cut Paper player B wins");

            //ties
            if (playerA.equals(rock) && playerB.equals(rock))
                System.out.println("Tie no one wins");
            if (playerA.equals(paper) && playerB.equals(paper))
                System.out.println("Tie no one wins");
            if (playerA.equals(scissors) && playerB.equals(scissors))
                System.out.println("Tie no one wins");
            do {

                System.out.println("Would you like to play again Y/N");
                playAgain = scan.nextLine();
                if (playAgain.equals(yes)) {
                    playerOne = false;
                    playerTwo = false;
                    do_You_Wanna_Playagain = true;
                } else if (playAgain.equals(no)) {
                    play = false;
                    do_You_Wanna_Playagain = true;
                } else {
                    System.out.println("Error please enter only Y or N");

                }
            } while (!do_You_Wanna_Playagain);

        } while (play);

        
    }
}