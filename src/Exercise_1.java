import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Enter your marks of all 5 subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        int S1 = sc.nextInt();
        System.out.println("Subject 2");
        int S2 = sc.nextInt();
        System.out.println("Subject 3");
        int S3 = sc.nextInt();
        System.out.println("Subject 4");
        int S4 = sc.nextInt();
        System.out.println("Subject 5");
        int S5 = sc.nextInt();
        int total = S1+S2+S3+S4+S5;
        float percentage = (total / 500.0f)*100;
        System.out.println("Total Marks=" + total);
        System.out.println("Percentage =" + percentage + "%");

    }
}
