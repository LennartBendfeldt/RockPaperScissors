import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        int roundNum = 1;
        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Rock");
        weapons.add("Paper");
        weapons.add("Scissors");

        System.out.println("Let's play a game of rock, paper, scissors.");


        int userScore = 0;
        int compScore = 0;

        while (userScore < 3 && compScore < 3) {
            System.out.println("Round: " + roundNum);
            System.out.println("Choose: \nRock \nPaper \nScissors");
            int userChoice = kb.nextInt();
            int compChoice = rand.nextInt(2) + 1;
            System.out.println("Your choice: " + weapons.get(userChoice - 1));
            System.out.println("computer choice: " + weapons.get(compChoice - 1));
            if (userChoice == compChoice) {

                System.out.println("Round num " + roundNum + " is a tie!");

                System.out.println("Your score: " + userScore + " rounds");
                System.out.println("Comp score: " + compScore + " rounds");


            } else if (userChoice != compChoice) {

                if ((userChoice == 2 && compChoice == 1) || (userChoice == 3 && compChoice == 2) ||
                        (userChoice == 1 && compChoice == 3)) {
                    System.out.println("You win round " + roundNum);
                    userScore++;
                    System.out.println("Your score: " + userScore + " rounds");
                    System.out.println("Comp score: " + compScore + " rounds");
                } else {
                    System.out.println("Computer wins round " + roundNum);
                    compScore++;
                    System.out.println("Your score: " + userScore + " rounds");
                    System.out.println("Comp score: " + compScore + " rounds");

                }
            }
            roundNum++;
        }

    }
}