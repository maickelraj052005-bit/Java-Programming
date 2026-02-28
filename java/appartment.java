import java.util.Scanner;
public class appartment {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int maintanance=sc.nextInt();
        int parking=sc.nextInt();
        int hall=sc.nextInt();
        int security=sc.nextInt();
        int electricity=sc.nextInt();
        int cealing=sc.nextInt();
        int finalincome=parking+maintanance+hall-security-electricity-cealing;
        System.out.print(finalincome);
    }
}
