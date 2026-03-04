import java.util.Scanner;
public class Government_Scholarship_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the FamilyIncome  : ");
        int familyIncome  = sc.nextInt();
        System.out.print("Enter the percentage : ");
        int percentage = sc.nextInt();

        if(familyIncome<200000 && percentage>=75)
        {
            System.out.println("Scholarship Granted ");
        }
        else
            {
            System.out.println("Not Granted");
        }
    }
  }