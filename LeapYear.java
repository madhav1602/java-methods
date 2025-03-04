import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        int year = sc.nextInt();
        
        // Check year
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } 
	else {
            
            if (isLeapYear(year)) {
                System.out.println("Year is a Leap Year");
            } 
	    else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        if(year % 4==0 && year % 100 !=0){
		return true;
	}
	else if(year % 400 == 0){
		return true;
	}
	else{
		return false;
	}
    }
}
