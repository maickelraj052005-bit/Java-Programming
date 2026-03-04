import java.util.Scanner;
public class Employee_Overtime_Bonus_Eligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Working_Hours : ");
        int workingHours= sc.nextInt();
        System.out.print("Enter the Attendance_Percentage : ");
        int attendancePercentage= sc.nextInt();

        if (40<workingHours && attendancePercentage>90) {
            System.out.println("Bonus Eligible ");
        }
        else
        {
            System.out.println("Bonus not Eligible ");
        }
    }
}