import java.util.Scanner;
public class delivery {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int delivery=sc.nextInt();
        int perday=sc.nextInt();
        int incentive=sc.nextInt();
        int cost=sc.nextInt();
        int earning=(delivery*perday)+incentive-cost;
        System.out.print(earning);
    }
}
