import java.util.Scanner;
class SimpleInterest {

        public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			
		// Take user input
		Double principal=sc.nextDouble();
		Double rate=sc.nextDouble();
		Double time=sc.nextDouble();
		
		// Call the method
		Double simpleInterest= simpleInterest(principal,rate,time);
			
		// Print the result
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

	}

	// Static method to calculate Simple Interest
	public static Double simpleInterest(Double principal, Double rate, Double time){
		Double result=(principal * rate * time) / 100;
		return result;
	}
}
