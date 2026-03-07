import java.util.*;
public class Airline_Ticket_Dynamic_Pricing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String bookingClass = sc.nextLine();
        int daysUntilDeparture =sc.nextInt();
        Double seatAvailability = sc.nextDouble();
        sc.nextLine();
        String routeType = sc.nextLine();

        double Base_Price =0;
        double Demand_Multiplier =0;
        double Ticket_Price=0;
        String Pricing_Category="";

        double Domestic=0;
        double int_short=0;
        double int_long=0;
       
        if (bookingClass.equalsIgnoreCase("Economy")) {
            Domestic = 200;
            int_short=500;
            int_long=800;
        }
        else if (bookingClass.equalsIgnoreCase("Business")) {
            Domestic = 600;
            int_short=1500;
            int_long=2500;
        }
        else if (bookingClass.equalsIgnoreCase("First")) {
            Domestic = 1000;
            int_short=3000;
            int_long=5000;
        }

            if (seatAvailability < 30 && daysUntilDeparture < 14) {
            Demand_Multiplier = 1.8;
            Pricing_Category = "High Demand";
        }
        else if (seatAvailability < 50 && daysUntilDeparture < 30) {
            Demand_Multiplier = 1.5;
            Pricing_Category = "High Demand";
        }
        else if (seatAvailability < 60 || 
                (daysUntilDeparture >= 30 && daysUntilDeparture <= 60)) {
            Demand_Multiplier = 1.0;
            Pricing_Category = "Moderate";
        }
        else if (seatAvailability >= 60 && daysUntilDeparture > 60) {
            Demand_Multiplier = 0.8;
            Pricing_Category = "Low Demand";
        }
        
        if (routeType.equalsIgnoreCase("Domestic")) {
           Base_Price = Domestic;
        } 
        else if (routeType.equalsIgnoreCase("International-Short")) {
            Base_Price = int_short;
        }
        else if (routeType.equalsIgnoreCase("International-Long")) {
            Base_Price = int_long;
}

       Ticket_Price=Base_Price*Demand_Multiplier;


        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUntilDeparture);
        System.out.println("Seat Availability: " + seatAvailability + "%");
        System.out.println("Route Type: " + routeType);
        System.out.println("Base Price: $" + Base_Price);
        System.out.println("Demand Multiplier: " + Demand_Multiplier + "x");
        System.out.println("Final Ticket Price: $" + Ticket_Price);
        System.out.println("Pricing Category: " + Pricing_Category);
       
    }


        
}
