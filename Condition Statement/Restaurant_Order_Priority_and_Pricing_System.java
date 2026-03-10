import java.util.*;
public class Restaurant_Order_Priority_and_Pricing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();

        int baseDiscount=0;
        int timeBasedAdjustment = 0;
        double serviceFee = 0;
        double finalAmount = 0;
        String kitchenPriority = "";
        int estimatedPrepTime = 0;





        if (loyaltyStatus.equalsIgnoreCase("Gold")) {
            baseDiscount=15;
        }
        else if (loyaltyStatus.equalsIgnoreCase("Silver")) {
            baseDiscount=10;
        }
        else if (loyaltyStatus.equalsIgnoreCase("Bronze")) {
            baseDiscount=5;
        }

        if (timeSlot.equalsIgnoreCase("Peak")) {
            timeBasedAdjustment=0;
        }
        else if (timeSlot.equalsIgnoreCase("Regular")) {
            timeBasedAdjustment=0;
        }
        else if (timeSlot.equalsIgnoreCase("Late-night")) {
            timeBasedAdjustment=-5;
        }

        if (orderType.equalsIgnoreCase("Delivery"))
            serviceFee = orderValue * 0.10;
        else if (orderType.equalsIgnoreCase("Takeout"))
            serviceFee = orderValue * 0.03;
        else
            serviceFee = 0;

        if (timeSlot.equalsIgnoreCase("Peak") && orderType.equalsIgnoreCase("Delivery"))
            kitchenPriority = "High";
        else if (timeSlot.equalsIgnoreCase("Regular"))
            kitchenPriority = "Medium";
        else
            kitchenPriority = "Low";
        if (kitchenPriority.equals("High"))
            estimatedPrepTime = 25;
        else if (kitchenPriority.equals("Medium"))
            estimatedPrepTime = 20;
        else
            estimatedPrepTime = 15;

        int totalDiscount = baseDiscount + timeBasedAdjustment;

        double discountedValue = orderValue * (1 - totalDiscount / 100.0);=


        System.out.println("Order Type : "+orderType);
        System.out.println("Loyalty Status :  "+loyaltyStatus);
        System.out.println("Order Value : "+"$"+orderValue);
        System.out.println("Time Slot:  +"+timeSlot);
        System.out.println("Base Discount : "+baseDiscount+"%");
        System.out.println("Time-Based Adjustment :  "+timeBasedAdjustment+"%");
        System.out.println("Service Fee : "+"$"+serviceFee);
        System.out.println("Final Amount : "+"$"+finalAmount);
        System.out.println("Kitchen Priority: "+kitchenPriority);
        System.out.println("Estimated Prep Time: "+estimatedPrepTime+"minutes");
    }
}
