import java.util.Scanner;
public class Warehouse_Box_Capacity_Doubling_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int connectionValue = sc.nextInt();
        int applianceMask = sc.nextInt();
        int values =  connectionValue << applianceMask;

        System.out.println(values);
        

    }
}
