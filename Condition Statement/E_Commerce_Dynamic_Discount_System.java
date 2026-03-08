import java.util.Scanner;
public class E_Commerce_Dynamic_Discount_System {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String Loyalty_Tier=sc.nextLine();
        Double cartValue = sc.nextDouble();
        sc.nextLine();
        String productCategory =sc.nextLine();
        String membershipStatus= sc.nextLine();
        double Base_Discount=0;
        double Additional_Discount=0;
        double Total_Discount=0;
        double Final_Price=0;
        double Savings=0;


        if (Loyalty_Tier.equalsIgnoreCase("Bronze")) {
            Base_Discount=5;   
        }
        else if (Loyalty_Tier.equalsIgnoreCase("Silver")) {
            Base_Discount =8;
        }
        else if (Loyalty_Tier.equalsIgnoreCase("Gold")) {
            Base_Discount =12;
        }
        else if (Loyalty_Tier.equalsIgnoreCase("Platinum")) {
            Base_Discount =15;
        }

        if (cartValue>=500 && 999>=cartValue) {
            Additional_Discount=3;
        }
        else if (cartValue>=1000 && 1999>=cartValue) {
            Additional_Discount= 5;
        }
        else if (cartValue>=2000) {
            Additional_Discount =7;
        }

        if (productCategory.equalsIgnoreCase("Electronics")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                Additional_Discount =Additional_Discount+5;
            }
        }
        else if (productCategory.equalsIgnoreCase("Fashion")) {
               Additional_Discount=Additional_Discount+3;
        }
        else if (productCategory.equalsIgnoreCase("Books")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                Additional_Discount=Additional_Discount+5;
            }
        }
        else if (productCategory.equalsIgnoreCase("Groceries")) {
            if (cartValue>300) {
                Additional_Discount=Additional_Discount+2;
            }
        }

        Total_Discount= Base_Discount+Additional_Discount;
        Final_Price=cartValue*(1-Total_Discount/100.0);
        Savings=cartValue-Final_Price;

        System.out.println("=================================================================");
        
        System.out.println("Loyalty Tier: " + Loyalty_Tier);
System.out.println("Cart Value: $" + cartValue);
System.out.println("Product Category: " + productCategory);
System.out.println("Membership: " + membershipStatus);

System.out.println("Base Discount: " + Base_Discount + "%");
System.out.println("Additional Discount: " + Additional_Discount + "%");
System.out.println("Total Discount: " + Total_Discount + "%");
System.out.println("Final Price: $" + Final_Price);
System.out.println("Savings: $" + Savings);
        sc.close();
       
        System.out.println("=================================================================");

    }
}

