import java.util.*;
public class Corporate_Tax_Bracket_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double annualRevenue = sc.nextDouble();
        sc.nextLine();
        String businessType = sc.nextLine();
        
    double deductibleExpenses  = sc.nextDouble();
    Double taxCredits =sc.nextDouble();
    
    double taxable_income=0;
    double tax_Rate = 0;
    double Gross_Tax =0;

    double Net_Tax_After_Credits =0;
    double Effective_Tax_rate=0 ;

    taxable_income= annualRevenue-deductibleExpenses;

    if (businessType.equalsIgnoreCase("LLC")) {
        if (taxable_income<200000 ) {
            tax_Rate=15;
        }
        else if (taxable_income<200000 && taxable_income<500000) {
            tax_Rate=18;
        }
        else if (taxable_income>500000) {
            tax_Rate=22;
        }
    }
    else if (businessType.equalsIgnoreCase("S-Corp")) {
        if (taxable_income<500000) {
            tax_Rate=20;
        }
        else if (taxable_income<500000 && taxable_income>1000000) {
            tax_Rate=25;
        }
        else if (taxable_income>1000000) {
            tax_Rate = 28;
        }
    }
    else if (businessType.equalsIgnoreCase("C-Corp")) {
        if (taxable_income<500000) {
            tax_Rate=21;
        }
        else if (taxable_income<500000 && taxable_income>1000000) {
            tax_Rate=24;

        }
        else if (taxable_income<1000000 && taxable_income >2000000) {
            tax_Rate=28;
        }
        else if (taxable_income>2000000) {
            tax_Rate=30;
        }
    }
    else if (businessType.equalsIgnoreCase("Partnership")) {
        if (taxable_income<300000) {
            tax_Rate=18;
        }
        else if (taxable_income<300000 && taxable_income>800000) {
            tax_Rate = 22;
        }
        else if (taxable_income>800000) {
            tax_Rate=26;
        }
    }
    Gross_Tax=taxable_income*(tax_Rate/100);
    
    Net_Tax_After_Credits=Gross_Tax-taxCredits;

    Effective_Tax_rate = (Net_Tax_After_Credits/annualRevenue)*100.0;

    System.out.println("Annual Revenue  :"+"$"+annualRevenue);
    System.out.println("Business Type :"+businessType);
    System.out.println("Deductible Expenses : "+"$"+deductibleExpenses);
    System.out.println("Tax Credits : "+"$"+taxCredits);
    System.out.println("Taxable Income : "+"$"+taxable_income);
    System.out.println("Tax Rate: "+"$"+tax_Rate);
    System.out.println("Gross Tax: "+"$"+Gross_Tax);
    System.out.println("Net Tax After Credits : "+"$"+Net_Tax_After_Credits);
    System.out.println("Effective Tax Rate : "+Effective_Tax_rate+"%");
    
}
    
    
}
