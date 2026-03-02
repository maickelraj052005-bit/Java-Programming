import java.util.Scanner;
public class ATM_Withdrawal_Eligibility {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account_Balance : ");
        int Account_Balance = sc.nextInt();
        System.out.print("Enter the Withdrawal_Amount : ");
        int Withdrawal_Amount = sc.nextInt();
        System.out.print("Enter the DailyLimit : ");
        int DailyLimit = sc.nextInt();

        if(Account_Balance>=Withdrawal_Amount && Withdrawal_Amount<=DailyLimit)
        {
            System.out.println("Transaction Approved");
        }
        else
            {
            System.out.println("Transaction Declined");
        }



    }

   
   
}