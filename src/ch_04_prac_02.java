// 01 Give Result as student pass or fail

import java.util.Scanner;
public class ch_04_prac_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        int s1 = sc.nextInt();
        System.out.println("Subject 2");
        int s2 = sc.nextInt();
        System.out.println("Subject 3");
        int s3 = sc.nextInt();
        int total = s1 + s2 + s3;
        float percentage = (total / 300.0f)*100;
        if(percentage >= 40 && s1 > 33 && s2 > 33 && s3 > 33) {
            System.out.println("Student pass");
            System.out.println("Total marks " + total);
            System.out.println("Total Percentage " + percentage + "%");
        } else{
            System.out.println("Student Fail");
            System.out.println("Over all percentage " + percentage+ "%");
            System.out.println("Better Luck Next Time");


        }
   */


 // 02 IncomeTax Calculator


      /*
      double income = sc.nextDouble();
      double tax = 0.0;
      if (income <= 250000){
          tax = tax + 0;
      }
      else if (income > 250000 && income <= 500000) {
          tax = tax + (income - 250000) * 0.05;
      }
      else if (income > 500000 && income <= 100000) {
          tax = tax + 0.5 * (500000 - 250000);
          tax = tax + 0.20 * (income - 500000);
      }
      else if (income > 1000000) {
          tax = tax + 0.05 * (500000 - 250000);
          tax = tax + 0.20 * ( 1000000 - 500000);
          tax = tax + 0.30 * (income - 1000000);
      }
        System.out.println("Income tax paid by you " + "Rs." + tax);
*/


// 03 print 1 = Monday ; 2 = Tuesday and soo on!!

        /*
        System.out.println("Enter a number from 1 to 7");
        int day = sc.nextInt();
        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thrusday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("saturday");
        }
        else if (day == 7) {
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid Input");
        }
*/



// 04 using switch case

        System.out.println("Enter a number from 1 to 7");
        int day = sc.nextInt();
        switch (day){
            case 1 : day = 1;
                System.out.println("Monday");
                break;
            case 2 : day = 2;
                System.out.println("Tuesday");
                break;
            case 3 : day = 3;
                System.out.println("Wednesday");
                break;
            case 4 : day = 4;
                System.out.println("Thrusday");
                break;
            case 5 : day = 5;
                System.out.println("Friday");
                break;
            case 6 : day = 6;
                System.out.println("Saturday");
                break;
            case 7 : day = 7;
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Day");
        }


    }
}

