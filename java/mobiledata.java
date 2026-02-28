import java.util.Scanner;
public class mobiledata {
    public static void main(String[]args){
    Scanner scan=new  Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int d=scan.nextInt();
    float mux=(b*c)+a;
    float total=(((mux)*d)/100)+mux;
    System.out.print(total);
    }
}
