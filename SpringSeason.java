import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		// Take user input
		System.out.print("Enter month (1-12): ");
		int month=sc.nextInt();

		System.out.print("Enter day (1-31): ");
		int day=sc.nextInt();
		
		// Call method
		boolean spring=springSeason(month,day);
		
		// Check for output by method
		if(spring==true){
			System.out.print("Its a spring season");
		}
		else{
			System.out.print("Not a spring season");
		}
    }
	
	// Method for checking Spring Season
	public static boolean springSeason(int month, int day){
		if(month==3 && day>=20){
			return true;
		}
		else if(month==4 || month==5){
			return true;
		}
		else if(month==6 && day<=20){
			return true;
		}
		else{
			return false;
		}
	}
}
