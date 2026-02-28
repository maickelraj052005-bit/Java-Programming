import java.util.Scanner;
public class gymsalary {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int sessions=sc.nextInt();
        int persessions=sc.nextInt();
        int bonaus=sc.nextInt();
        int maintanance=sc.nextInt();
        int finalsalary=salary+(sessions*persessions)+bonaus-maintanance;
        System.out.print(finalsalary);
    }
}
