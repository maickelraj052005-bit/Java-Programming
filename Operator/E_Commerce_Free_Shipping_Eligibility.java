import java.util.Scanner;
public class E_Commerce_Free_Shipping_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the free Shipping charge : ");
        int Free_Shipping = sc.nextInt();
        System.out.println("Enter the Shipping Charges Applied : ");
        int cartValue_premiumMember = sc.nextInt();


        if (Free_Shipping >999 || cartValue_premiumMember==1) {
            System.out.println("Free Shipping");
        }
        else
        {
            System.out.println("Shipping Charges Applied");
        }

    }
    
}