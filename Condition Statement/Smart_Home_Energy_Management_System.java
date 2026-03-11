import java.util.Scanner;
public class Smart_Home_Energy_Management_System {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String timeOfDay= sc.nextLine();
        
        double powerConsumption = sc.nextDouble();

        double renewablePercentage = sc.nextDouble();
        sc.nextLine();

        String rateTier = sc.nextLine();

        double BaseRate=0;
        double rateMultiplier =0;
        double renewableCredit = 0;
        double TotalCost = 0;

        String OptimizationRecommendation =" ";
        double Potential_Savings =0;
        sc.close();


        if (rateTier.equalsIgnoreCase("Basic")) {
            BaseRate = 0.18;
        }
        else if (rateTier.equalsIgnoreCase("Time-of-Use")) {
            BaseRate= 0.15;
        }
        else if (rateTier.equalsIgnoreCase( "Premium-Green")) {
            BaseRate= 0.12;
        }
        
        renewableCredit=(powerConsumption*renewablePercentage/100)*BaseRate;


        if (timeOfDay.equalsIgnoreCase("Peak")) {
            if (renewablePercentage>=60) {
                rateMultiplier=1.5;
            }
            else{
                rateMultiplier =1.8;
            }   
        }
        else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            if (renewablePercentage>=30) {
                rateMultiplier=0.8;
            }
            else
            {
                rateMultiplier=1.0;
            }
        }
        else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
                rateMultiplier=0.6;
        }

        TotalCost =(powerConsumption*BaseRate*rateMultiplier)-renewableCredit;

        if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage < 30) {
            OptimizationRecommendation = "Shift to Off-Peak";
            Potential_Savings = powerConsumption * BaseRate * (1.8 - 0.8);
        } else if (renewablePercentage >= 60) {
            OptimizationRecommendation = "Excellent Continue";
        } else if (rateTier.equalsIgnoreCase("Basic") && powerConsumption > 20) {
            OptimizationRecommendation = "Upgrade to Time-of-Use";
             Potential_Savings= powerConsumption * 0.03;
        }

        sc.close();
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + BaseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.println("Renewable Credit: $" + renewableCredit);
        System.out.println("Total Cost: $" + TotalCost);
        System.out.println("Optimization Recommendation: " + OptimizationRecommendation);
        System.out.println("Potential Savings: $" + Potential_Savings);
    }
}