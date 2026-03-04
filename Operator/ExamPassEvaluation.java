
import java.util.Scanner;

public class ExamPassEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Theory mark : ");
        int theory = sc.nextInt();
        System.out.print("Enter the Practical mark : ");
        int practical = sc.nextInt();

        int total = theory + practical;

        int avg =  (total/2);

        // System.out.println(avg);


        if (60<=avg) {
            System.out.println("Pass");
        }
        else {

            System.out.println("fail");
        }
    }
    
}