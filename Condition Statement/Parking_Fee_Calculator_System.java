import java.util.Scanner;

public class Parking_Fee_Calculator_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String locationZone = sc.nextLine();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();

        double baseHourlyRate = 5.0;
        int zonePremium = 0;
        double vehicleSizeSurcharge = 0;
        int membershipDiscount = 0;
        double totalParkingFee = 0;
        String dailyCapApplied = "No";
        String rateCategory = "";

        
        if (locationZone.equalsIgnoreCase("Downtown"))
            zonePremium = 50;
        else if (locationZone.equalsIgnoreCase("Business-District"))
            zonePremium = 30;
        else if (locationZone.equalsIgnoreCase("Residential"))
            zonePremium = 0;
        else
            zonePremium = 100;

      
        if (vehicleType.equalsIgnoreCase("Motorcycle"))
            vehicleSizeSurcharge = -2;
        else if (vehicleType.equalsIgnoreCase("SUV"))
            vehicleSizeSurcharge = 3;
        else if (vehicleType.equalsIgnoreCase("Oversized"))
            vehicleSizeSurcharge = 5;
        else
            vehicleSizeSurcharge = 0;

       
        if (membershipStatus.equalsIgnoreCase("Monthly"))
            membershipDiscount = 20;
        else if (membershipStatus.equalsIgnoreCase("Annual"))
            membershipDiscount = 25;
        else if (membershipStatus.equalsIgnoreCase("VIP"))
            membershipDiscount = 30;
        else
            membershipDiscount = 0;

       
        double rawFee = (baseHourlyRate * (1 + zonePremium / 100.0) + vehicleSizeSurcharge) * parkingHours;

        double finalFee = rawFee * (1 - membershipDiscount / 100.0);

       
        double dailyCap = 0;

        if (locationZone.equalsIgnoreCase("Downtown"))
            dailyCap = 150;
        else if (locationZone.equalsIgnoreCase("Business-District"))
            dailyCap = 120;
        else if (locationZone.equalsIgnoreCase("Residential"))
            dailyCap = 60;
        else
            dailyCap = 180;

        if (parkingHours >= 24) {
            finalFee = Math.min(finalFee, dailyCap);
            dailyCapApplied = "Yes";
        }

        totalParkingFee = finalFee;

        
        if (locationZone.equalsIgnoreCase("Residential"))
            rateCategory = "Standard";
        else if (locationZone.equalsIgnoreCase("Airport"))
            rateCategory = "Luxury";
        else
            rateCategory = "Premium";

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseHourlyRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSizeSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + totalParkingFee);
        System.out.println("Daily Cap Applied: " + dailyCapApplied);
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}