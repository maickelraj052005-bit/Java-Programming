import java.util.Scanner;
public class agriculturalcal {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
                int yeald=sc.nextInt();
                int acear=sc.nextInt();
                int exteryeald=sc.nextInt();
                int damage=sc.nextInt();
                int finalyeald=(yeald*acear)+exteryeald-damage;
                System.out.print(finalyeald);
    }
}