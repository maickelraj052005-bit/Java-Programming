import java.util.Scanner;

public class Movie_Theatre_Age_Access_Control {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age_id = sc.nextInt();
        int Proof = sc.nextInt();

        if (age_id>=18 && Proof==1) {
            System.out.println("Entry Allowed ");
        }
        else
        {
            System.out.println("Entry Denied ");
        }


    }
}