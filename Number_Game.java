import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        System.out.println("You have 5 chances to guess the correct number.");
        System.out.println("If you guess the correct number on your"+"\n"+" 1st try: 10 points"+"\n"+" 2nd try: 8 points"+"\n"+
        " 3rd try: 6 points"+"\n"+" 4th try: 4 points"+"\n"+" last try: 2 points");
        while(true){
            int min=1,max=100;
            Random ran = new Random();
            int number = ran.nextInt(max-min+1)+min;
            int count = 0,guessnum = 0;
            for(int i=1;i<=5;i++) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your guess number:");
                int guess = scan.nextInt();
                if(number > guess) {
                    System.out.println("Your guessed number is too low.");
                    count += 1;
                    continue;
                }else if(number < guess) {   
                    System.out.println("Your guessed number is too high.");
                    count += 1;
                    continue;
                }else {
                    System.out.println("Your guess is correct.kudos!");
                    guessnum = guess;
                    count += 1;
                    break; } }
            int highscore = 0;
            if(number == guessnum) {
            switch(count) {
                case 1:
                    int score1 = 10;
                    highscore += score1;
                    System.out.println("Your score is "+ score1);
                    System.out.println("Your high score is "+ highscore);
                    break;
                case 2:
                    int score2 = 8;
                    highscore += score2;
                    System.out.println("Your score is "+ score2);
                    System.out.println("Your high score is "+ highscore);
                    break;
                case 3:
                    int score3 = 6;
                    highscore += score3;
                    System.out.println("Your score is "+ score3);
                    System.out.println("Your high score is "+ highscore);
                    break;
                case 4:
                    int score4 = 4;
                    highscore += score4;
                    System.out.println("Your score is "+ score4);
                    System.out.println("Your high score is "+ highscore);
                    break;
                case 5:
                    int score5 = 2;
                    highscore += score5;
                    System.out.println("Your score is "+ score5);
                    System.out.println("Your high score is "+ highscore);
                    break; } }
            else{
                System.out.println("Better luck next time."+"\n"+"Your highscore is "+ highscore); }
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to continue the game?(Yes/No)");
            String conti = scan.nextLine();
            if(conti.equalsIgnoreCase("Yes")){
                System.out.println("Enjoy the game.");
                continue;
            }else{
                System.out.println("See you soon.");
                break; } } } }