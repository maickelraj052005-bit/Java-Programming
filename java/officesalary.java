import java.util.Scanner;
public class officesalary{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=d+e;
        int g=a+b+c;
        int total=g-f;
        System.out.print(total);
}
}