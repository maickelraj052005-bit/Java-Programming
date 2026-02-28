import java.util.Scanner;
public class raiwayticket {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int genpass=sc.nextInt();
        int genfare=sc.nextInt();
        int acpass=sc.nextInt();
        int acfare=sc.nextInt();
        int platform=sc.nextInt();
        int maintanance=sc.nextInt();
        int fuel=sc.nextInt();
        int total=(genpass*genfare)+(acpass*acfare)+platform-maintanance-fuel;
        System.out.print(total);
    }
}
