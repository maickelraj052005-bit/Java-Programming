import java.util.Scanner;
public class hotelroom {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rooms=sc.nextInt();
        int price=sc.nextInt();
        int servicecost=sc.nextInt();
        int comission=sc.nextInt();
        int total=(rooms*price)+servicecost-comission;
        System.out.print(total);
    }
}
