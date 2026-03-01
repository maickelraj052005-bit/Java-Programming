import java.util.Scanner;
public class sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        sc.nextLine();
        int avg = sc.nextInt();
        sc.nextLine();
        int total =sum+avg;
        System.out.println("Your details");        
        System.out.println("You Entered : "+total);
        
    }
    
} 