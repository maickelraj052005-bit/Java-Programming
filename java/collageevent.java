import java.util.Scanner;
public class collageevent {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int reg=sc.nextInt();
        int spon=sc.nextInt();
        int stall=sc.nextInt();
        int stage=sc.nextInt();
        int celebrity=sc.nextInt();
        int marketing=sc.nextInt();
        int totalfund=reg+spon+stall-stage-celebrity;
        System.out.print(totalfund);
    }
}
