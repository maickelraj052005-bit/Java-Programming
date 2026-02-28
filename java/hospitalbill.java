import java .util.Scanner;
public class hospitalbill {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int roomcharge=sc.nextInt();
        int days=sc.nextInt();
        int medicial=sc.nextInt();
        int labfee=sc.nextInt();
        int coverage=sc.nextInt();
        int finalbill=(roomcharge*days)+medicial+labfee-coverage;
        System.out.print(finalbill);
    }
}
