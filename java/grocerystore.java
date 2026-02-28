import java.util.Scanner;
public class grocerystore{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double sales=sc.nextDouble();
        double discount=sc.nextDouble();
        double gst=sc.nextDouble();
        double discountamount=(sales*discount)/100;
        double afterdis=sales-discountamount;
        double finalrevenue=(afterdis*gst)/100;
        double sp=afterdis+finalrevenue;
        System.out.print(sp);
    }
}