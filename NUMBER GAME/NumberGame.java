import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Number Game!");
        char choice;
        do{
            int randNumber = rand.nextInt(100 -1) + 1;
            int attempts = 1;
            System.out.println("you have only 8 attempt to win this Game");
            while (attempts <= 8){
                System.out.println("Enter the number: ");
                int number = sc.nextInt();
                if(number == randNumber){
                    int score = ((8 - attempts) * 100) / 8;
                    System.out.println("Great! you win" +
                            "\n Your Score is " + score +"%");
                    break;
                }else {
                    if (number > randNumber){
                        System.out.println("oops! too high");
                    }else{
                        System.out.println("oops! too low");
                    }
                }

                attempts += 1;

                if(attempts > 8){
                    System.out.println("oho! you lost the Game");
                }else {
                    System.out.println("Try again");
                }

            }
            System.out.println("Do you want to Play again? \n Press 'Y' other wise Press 'any key'");
            choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
    }
}
