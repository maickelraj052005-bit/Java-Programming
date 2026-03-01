import java.util.Scanner;
public class purchase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the price : ");
        float price = sc.nextFloat();
        System.out.print("Enter the Quantity : ");
        int quantity = sc.nextInt();
        
        System.out.println("Your Total bill is  : $"+price*quantity);


    }
}
