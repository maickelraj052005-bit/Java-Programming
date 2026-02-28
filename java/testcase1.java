import java.util.Scanner;
public class testcase1 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int wpd=sc.nextInt();
        int bonus=sc.nextInt();
        int charge=sc.nextInt();
        int base=day*wpd;
        base=base+bonus;
        base=base-charge;
        System.out.print(base);
    }
}
