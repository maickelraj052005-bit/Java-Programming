import java.util.*;
public class Vehicle_Insurance_Premium_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int driverAge= sc.nextInt();
        sc.nextLine();
        String vehicleType= sc.nextLine();
        String drivingRecord = sc.nextLine();
        String coverageLevel = sc.nextLine();

        double basePremium=0;
        double ageFactor =0;
        double vehicleRiskFactor=0;
        int RecordAdjustment=0;
        String riskCategory =" ";
        
        if (coverageLevel.equalsIgnoreCase("Basic")) {
            basePremium=500;
        }
        else if (coverageLevel.equalsIgnoreCase("Standard")) {
            basePremium=800;
        }
        else if (coverageLevel.equalsIgnoreCase("Comprehensive")) {
            basePremium=1500;
        }
        if (driverAge <= 21)
            ageFactor = 1.8;
        else if (driverAge <= 25)
            ageFactor = 1.5;
        else if (driverAge <= 40)
            ageFactor = 1.0;
        else if (driverAge <= 60)
            ageFactor = 0.9;
        else
            ageFactor = 1.1;
        if (vehicleType.equalsIgnoreCase("Sedan")) {
            vehicleRiskFactor=1.0;
        }
        else if (vehicleType.equalsIgnoreCase("SUV")) {
            vehicleRiskFactor=1.2;
        }
        else if (vehicleType.equalsIgnoreCase("Sports")) {
            vehicleRiskFactor=1.5;
        }
        else if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicleRiskFactor=1.1;

        }

        if (drivingRecord.equalsIgnoreCase("Clean"))
            riskCategory = "Low";
        else if (drivingRecord.equalsIgnoreCase("Minor-Violations"))
            riskCategory = "Medium";
        else if (drivingRecord.equalsIgnoreCase("Major-Violations") && driverAge < 25)
            riskCategory = "Very High";
        else
            riskCategory = "High";
        
        if (drivingRecord.equalsIgnoreCase("Clean")) {
            RecordAdjustment = -10;
        }
        else if (drivingRecord.equalsIgnoreCase("Minor-Violations")) {
            RecordAdjustment=25;
        }
        else if (drivingRecord.equalsIgnoreCase("Major-Violations")) {
            RecordAdjustment=50;
        }
        
        double adjustedPremium=basePremium*ageFactor*vehicleRiskFactor;
        double finalPremium = adjustedPremium*(1+RecordAdjustment/100.0);
        double monthlyPremium = finalPremium/12;
        double Annual_Premium=  finalPremium;

        sc.close();
        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleRiskFactor + "x");
        System.out.println("Record Adjustment: " + RecordAdjustment + "%");
        System.out.println("Monthly Premium: $" + monthlyPremium);
        System.out.println("Annual Premium: $" + Annual_Premium);
        System.out.println("Risk Category: " + riskCategory);
    }
}
