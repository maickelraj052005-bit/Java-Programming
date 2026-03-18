import java.util.*;
public class University_Scholarship_Eligibility_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        Double familyIncome =sc.nextDouble();
        int extracurricularScor = sc.nextInt();
        sc.nextLine();
        String scholarshipType = sc.nextLine();

        String Eligibility;
        double Award_Amount =0;
        String Award_Category="";


        if (gpa < 2.5) {
         Eligibility = "Not Eligible";
         Award_Category="None";
        }
         else {
        Eligibility = "Eligible";
        if (scholarshipType.equalsIgnoreCase("Merit")) {
                if (gpa>=3.8 && extracurricularScor >=80) {
                Award_Category="Full";
                Award_Amount =25000;
            }
            else if(gpa>=3.5 && extracurricularScor>=70){
                Award_Category = "Partial";
                Award_Amount =15000;
            }
            else if(gpa>=3.0 && extracurricularScor>=60){
                Award_Category = "Minimal";
                Award_Amount =8000;
            }
            
        }
       else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
            if (familyIncome<=30000 && gpa>=3.5) {
                Award_Category="Full";
                Award_Amount =30000;
            }
            else if (familyIncome<=50000 && gpa>=3.0) {
                Award_Category="Partial";
                Award_Amount =18000;
            }
            else if(familyIncome<=70000 && gpa>=2.8) {
                Award_Category="Minimal";
                Award_Amount =10000;
            }
            
        }
        else  if (scholarshipType.equalsIgnoreCase("Sports")) {
                if (extracurricularScor>=85 && gpa>=3.0) {
                Award_Category ="Full";
                Award_Amount=22000;
            }
            else if (extracurricularScor>=75 && gpa>=2.8) {
                Award_Category = "Partial";
                Award_Amount =20000;
            }
            else if (extracurricularScor>=65 && gpa>=2.5) {
                Award_Category = "Minimal";
                Award_Amount=12000;
            }
        }
    }
        
    
    System.out.println("GPA                   :"+gpa);
    System.out.println("Family Income         :"+familyIncome);
    System.out.println("Extracurricular Score :"+extracurricularScor);
    System.out.println("Scholarship Type      :"+scholarshipType);
    System.out.println("Eligibility           :"+Eligibility);
    System.out.println("Award Amount          :"+Award_Amount);
    System.out.println("Award Category        :"+Award_Category);
    
    sc.close();
}     
 }


