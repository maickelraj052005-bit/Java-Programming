import java.util.Scanner;
public class schoolbus {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int diatance=sc.nextInt();
        int perkg=sc.nextInt();
        int mainanace=sc.nextInt();
        int delivery=sc.nextInt();
        int subsidy=sc.nextInt();
        int fee=(diatance*perkg)+mainanace+delivery-subsidy;
        System.out.print(fee);
    }
}
