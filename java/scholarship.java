import java.util.Scanner;
public class scholarship{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int tuitionfee=sc.nextInt();
        int scholarship=sc.nextInt();
        int examfee=sc.nextInt();
        int libraryfee=sc.nextInt();
        double discount=tuitionfee*scholarship/100;
        double finalfee=tuitionfee-discount;
        finalfee=finalfee+examfee+libraryfee;
        System.out.print(finalfee);
    }
}