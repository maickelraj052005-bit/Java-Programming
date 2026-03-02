import java.util.Scanner;
public class Bank_Loan_Approval_Eligibility {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the salary : ");
    int Salary  = sc.nextInt();
    System.out.println("Enter the Credit score : ");
    int credit_score  = sc.nextInt();

    if (Salary>=25000 && credit_score>700) {
        System.out.println("Loan Approved ");
    }
    else
    {
        System.out.println("Loan Rejected "); 
    }
   } 
}
