import java.util.Scanner;
public class Healthcare_Insurance_Premium_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age= sc.nextInt();
        sc.nextLine();
        String Smoker_Status = sc.nextLine();
        String Pre_exsiting_Condition = sc.nextLine();
        String Coverage_Tier = sc.nextLine();
        
        double base_premium=0;
        double risk_surcharge=0;
        double Total_monthly_premium=0;


         if (age >= 18 && age <= 30) {

    if (Coverage_Tier.equalsIgnoreCase("Basic"))
        base_premium = 200;
    else if (Coverage_Tier.equalsIgnoreCase("Standard"))
        base_premium = 300;
    else if (Coverage_Tier.equalsIgnoreCase("Premium"))
        base_premium = 500;

}
else if (age >= 31 && age <= 50) {

    if (Coverage_Tier.equalsIgnoreCase("Basic"))
        base_premium = 250;
    else if (Coverage_Tier.equalsIgnoreCase("Standard"))
        base_premium = 350;
    else if (Coverage_Tier.equalsIgnoreCase("Premium"))
        base_premium = 600;

}
else if (age >= 51 && age <= 65) {

    if (Coverage_Tier.equalsIgnoreCase("Basic"))
    {

        base_premium = 350;
    }
    else if (Coverage_Tier.equalsIgnoreCase("Standard")){

        base_premium = 450;
    }
    else if (Coverage_Tier.equalsIgnoreCase("Premium")){

        base_premium = 700;
    }

}
else {

    if (Coverage_Tier.equalsIgnoreCase("Basic")){

        base_premium = 400;
    }
    else if (Coverage_Tier.equalsIgnoreCase("Standard")){

        base_premium = 550;
    }
    else if (Coverage_Tier.equalsIgnoreCase("Premium")){

        base_premium = 800;
    }

}

    if (Smoker_Status.equalsIgnoreCase("Smoker") && Pre_exsiting_Condition.equalsIgnoreCase("Yes"))
    {
        risk_surcharge=base_premium*0.70;
    }
    else if (Smoker_Status.equalsIgnoreCase("Smoker")) 
        {
        risk_surcharge=base_premium*0.40;
    }
    else if (Pre_exsiting_Condition.equalsIgnoreCase("Yes"))
        {
        risk_surcharge=base_premium*0.30;
    }
    else
    {
        risk_surcharge=0;
    }

    Total_monthly_premium=base_premium+risk_surcharge;

    
    
    
    System.out.println("Age: " + age);
    System.out.println("Smoking Status: " + Smoker_Status);
    System.out.println("Pre-existing Conditions: " + Pre_exsiting_Condition);
    System.out.println("Coverage Tier: " + Coverage_Tier);
    System.out.println("Base Premium: $" + base_premium);
    System.out.println("Risk Surcharge: $" + risk_surcharge);
    System.out.println("Total Monthly Premium: $" + Total_monthly_premium);
    sc.close();
}

    
}
