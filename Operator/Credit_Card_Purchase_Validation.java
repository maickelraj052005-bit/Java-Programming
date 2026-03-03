import java.util.Scanner;
public class Credit_Card_Purchase_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the CreditLimit : ");
        int creditLimit = sc.nextInt();
        System.out.println("Enter the purchaseAmount : ");
        int purchaseAmount = sc.nextInt();
        System.out.println("Enter the cardBlocked : ");
        int cardBlocked = sc.nextInt();

        if (creditLimit>=purchaseAmount && cardBlocked==0) {
            System.out.println("Approved ");
        }
        else
        {
            System.out.println("Declined ");
        }

    }
}
