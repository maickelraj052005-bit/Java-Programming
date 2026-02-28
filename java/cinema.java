import java.util.Scanner;
public class cinema {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        int snaks=sc.nextInt();
        int maintanance=sc.nextInt();
        int electricity=sc.nextInt();
        int finalrevenue=ticket+snaks-maintanance-electricity;
        System.out.print(finalrevenue);
    }
}
