import java.util.Scanner;
public class Question1_Employee_Performance_Bonus_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the performanceRating : ");
        int performanceRating=sc.nextInt();

        System.out.println("Enter the yearsOfService (0 to 40) : ");
        int yearsOfService =sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the DepartmentType (either Critical or Non-Critical) ");
        String department = sc.nextLine();
        
        
        System.out.println("Enter the base salary");
        double baseSalary= sc.nextDouble();

        String status="0";
        int bonespercentage=0;
        if (performanceRating>=3) {
             status = "Eligible";

            if (department.equals("critical" )) {
                
                if (performanceRating==5 && yearsOfService >=5) {
                    bonespercentage =25;
                }
                else if (performanceRating ==4 && yearsOfService>=10) {
                    bonespercentage =22;
                }
                else if (performanceRating==4) {
                    bonespercentage =15;
                }
                else if (performanceRating==3) {
                    bonespercentage =10;
                }
            }
            else
            {
              System.err.println("Non critical");  

                  if (performanceRating==5) {
                    bonespercentage =18;
                  }
                  else if (performanceRating==4) {
                    bonespercentage =12;
                  }
                  else if (performanceRating==3) {
                    bonespercentage =8;
                  }
                }
            }
            else
                {
                status = "Not eligible";

            }
          double bonusAmount = baseSalary * (bonespercentage / 100.0);

          System.out.println("===============================================================");
          
          System.err.println("Performance Rating : "+performanceRating);
          System.err.println("Years of Service   : "+yearsOfService);
          System.err.println("Department         : "+department);
          System.err.println(" Bonus Percentage  : "+bonespercentage+"%");
          System.err.println(" Bonus Amount      : "+bonusAmount);
          System.err.println("Status             : "+status);


          System.out.println("===============================================================");
        }
    }
    
