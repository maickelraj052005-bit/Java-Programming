import java.util.Scanner;
public class youtube {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int sponcer=sc.nextInt();
        int affiliate=sc.nextInt();
        int tax=sc.nextInt();
        int product=sc.nextInt();
        int finalincome=ads+sponcer+affiliate-tax-product;
        System.out.println(finalincome);
    }
}
