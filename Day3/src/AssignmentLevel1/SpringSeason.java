package AssignmentLevel1;
import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
		 System.out.print("Enter month (1-12): ");
	        int month = input.nextInt();

	        System.out.print("Enter day: ");
	        int day = input.nextInt();

	        boolean isSpring = false;
	       
	        if ((month == 3 && day >= 20 && day <= 31) ||
	                (month == 4 && day >= 1 && day <= 30) ||
	                (month == 5 && day >= 1 && day <= 31) ||
	                (month == 6 && day >= 1 && day <= 20)) {
	                isSpring = true;
	            }
	        if (isSpring) {
	            System.out.println("It's a Spring Season");
	        } else {
	            System.out.println("Not a Spring Season");
	        }

	        input.close();

	}

}
