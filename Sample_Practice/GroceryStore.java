import java.util.Scanner;
public class GroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total Amount : ");
        int totalamt = sc.nextInt();

        System.out.print("Enter the percentage : ");
        int percentage = sc.nextInt();

        int pertanage1=(totalamt/100)*percentage;
        int totalamt1 = totalamt-pertanage1;

        System.out.print("Enter the GST : ");
        int gst = sc.nextInt();
        int gst1 = (totalamt1/100)*gst;
        int total = gst1+totalamt1;

        System.out.print("This is your final  : "+total);
    }
}
