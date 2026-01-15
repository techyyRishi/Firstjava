

import java.util.Random;
import java.util.Scanner;


public class games_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;
        int compScore = 0;

        // ROUND 1 //
        System.out.println("ROUND 1 : Enter Rock, Paper, Scissor");
        String us1 = sc.nextLine();
        int u1 = -1;

        if(us1.equalsIgnoreCase("Rock")) u1 = 0;
        else if(us1.equalsIgnoreCase("Paper")) u1 = 1;
        else if(us1.equalsIgnoreCase("Scissor")) u1 = 2;

        int c1 = rand.nextInt(3);
        switch (c1){
            case 0 :
                System.out.println("Computer chose Rock");
                break;
            case 1 :
                System.out.println("Computer chose Paper");
                break;
            case 2 :
                System.out.println("Computer chose Scissor");
                break;
        }

// ROUND 1 RESULT

            if(u1==c1){
                System.out.println("its Draw!!");
            }else if((u1==0&&c1==2)||(u1==1&&c1==0)||(u1==2&&c1==1)){
            System.out.println("You wins Round 1");
            userScore++;
        }else{
            System.out.println("Computer wins Round 1");
            compScore++;
        }

        System.out.println("\nROUND 2 : Enter Rock, Paper, Scissor");
// ROUND 2
        String us2 = sc.nextLine();
            int u2 = -1;
        if(us2.equalsIgnoreCase("Rock")) u2 = 0;
        else if(us2.equalsIgnoreCase("Paper")) u2 = 1;
        else if(us2.equalsIgnoreCase("Scissor")) u2 = 2;

        int c2 = rand.nextInt(3);
        switch (c2){
            case 0 :
                System.out.println("Computer chose Rock");
                break;
            case 1 :
                System.out.println("Computer chose Paper");
                break;
            case 2 :
                System.out.println("Computer chose Scissor");
                break;
        }


// RESULT ROUND 2
        if(u2==c2){
            System.out.println("its Draw!!");
        }else if((u2==0&&c2==2)||(u2==1&&c2==0)||(u2==2&&c2==1)){
            System.out.println("You wins Round 2");
            userScore++;
        }else{
            System.out.println("Computer wins Round 2");
            compScore++;
        }

        System.out.println("\nROUND 3 : Enter Rock, Paper, Scissor");

// ROUND 3
        String us3 = sc.nextLine();
        int u3 = -1;
        if(us3.equalsIgnoreCase("Rock")) u3 = 0;
        else if(us3.equalsIgnoreCase("Paper")) u3 = 1;
        else if(us3.equalsIgnoreCase("Scissor")) u3 = 2;

        int c3 = rand.nextInt(3);
        switch (c3){
            case 0 :
                System.out.println("Computer chose Rock");
                break;
            case 1 :
                System.out.println("Computer chose Paper");
                break;
            case 2 :
                System.out.println("Computer chose Scissor");
                break;
        }

// RESULT ROUND 3
        if(u3==c3){
            System.out.println("its Draw!!");
        }else if((u3==0&&c3==2)||(u3==1&&c3==0)||(u3==2&&c3==1)){
            System.out.println("You wins Round 3");
            userScore++;
        }else{
            System.out.println("Computer wins Round 3");
            compScore++;
        }

// FINAL RESULT

        System.out.println("\n-----FINAL RESULT-----");
        if(userScore>compScore){
            System.out.println("CONGRATS YOU WON");
        }else if(userScore<compScore){
            System.out.println("COMPUTER WONS");

        }else{
            System.out.println("its Draw!!");
        }


        }

}
