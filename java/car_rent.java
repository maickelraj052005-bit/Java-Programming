import java.util.Scanner;
public class car_rent {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maintanance=sc.nextInt();
        int profile=(day*rent)+late-fuel-maintanance;
        System.out.print(profile);
    }
}