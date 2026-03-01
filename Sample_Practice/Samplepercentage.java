import java.util.Scanner;
public class Samplepercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  the Your  mark  : ");
        int mark = sc.nextInt();
        System.out.print("enter  the Total mark  : ");
        float score = sc.nextFloat();
        float percentage = (mark/score)*100;

        System.out.println("Your percentage is "+percentage );

    }
}
