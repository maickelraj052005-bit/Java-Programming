import java.util.*;

public class Shipping_Cost_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = 0;
        double zoneMultiplier = 0;
        double sizeSurcharge = 0;
        double totalCost = 0;

        String deliveryDays = "";
        String serviceLevel = "";

       
        if (shippingSpeed.equalsIgnoreCase("Economy"))
            baseRate = 5;
        else if (shippingSpeed.equalsIgnoreCase("Standard"))
            baseRate = 10;
        else if (shippingSpeed.equalsIgnoreCase("Express"))
            baseRate = 25;
        else
            baseRate = 50;

        
        weightSurcharge = packageWeight;

        
        if (destinationZone.equalsIgnoreCase("Local"))
            zoneMultiplier = 1.0;
        else if (destinationZone.equalsIgnoreCase("Regional"))
            zoneMultiplier = 1.2;
        else if (destinationZone.equalsIgnoreCase("National"))
            zoneMultiplier = 1.5;
        else
            zoneMultiplier = 3.0;

        
        if (packageSize.equalsIgnoreCase("Small"))
            sizeSurcharge = 0;
        else if (packageSize.equalsIgnoreCase("Medium"))
            sizeSurcharge = 5;
        else if (packageSize.equalsIgnoreCase("Large"))
            sizeSurcharge = 15;
        else
            sizeSurcharge = 30;

       
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        totalCost = baseCost + sizeSurcharge;

       

        if (shippingSpeed.equalsIgnoreCase("Economy"))
            deliveryDays = "7 business days";
        else if (shippingSpeed.equalsIgnoreCase("Standard"))
            deliveryDays = "5 business days";
        else if (shippingSpeed.equalsIgnoreCase("Express"))
            deliveryDays = "2 business days";
        else
            deliveryDays = "1 business days";

       


        if (shippingSpeed.equalsIgnoreCase("Economy"))
            serviceLevel = "Budget";
        else if (shippingSpeed.equalsIgnoreCase("Standard"))
            serviceLevel = "Standard";
        else if (shippingSpeed.equalsIgnoreCase("Express"))
            serviceLevel = "Priority";
        else
            serviceLevel = "Premium";

        


        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays);
        System.out.println("Service Level: " + serviceLevel);

        sc.close();
    }
}