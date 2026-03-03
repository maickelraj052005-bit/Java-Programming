import java.util.Scanner;
public class Digital_Signal_Toggle_Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signalValue = sc.nextInt();
        int toggleMask = sc.nextInt();

        int ToggledSignal = signalValue^toggleMask;

        System.out.println(ToggledSignal);
    }
}
