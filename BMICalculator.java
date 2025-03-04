import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		double[][] arr=new double[3][3];
		
        // Taking user input and calling methods
		for(int i=0;i<3;i++){
			System.out.print("Enter height of member " + (i+1)+ " ");
			arr[i][0]=sc.nextDouble();
			
			System.out.print("Enter weight of member " + (i+1) + " ");
			arr[i][1]=sc.nextDouble();
			
			double bmi=calculateBMI(arr[i][0] , arr[i][1]);
			arr[i][2]=bmi;	
		}	
		
        // Printing result
		for(int i=0;i<3;i++){
			System.out.println("height of member " + (i+1) + " is " + arr[i][0] + " cms");
			System.out.println("weight of member " + (i+1) + " is " + arr[i][1] + " kg");
			System.out.println("BMI of member " + (i+1) + " is " + arr[i][2]+ " kg/m^2");
			String status=statusBMI(arr[i][2]);
            System.out.println("status: "+ status);
		}
    }
	
	// Method to calculate BMI
	public static double calculateBMI(double height, double weight){
		double heightInMetre=height/100;
		double bmi= weight / (heightInMetre*heightInMetre);
        return bmi;
	}

    // Method to calculate status
	public static String statusBMI(double bmi){
		if (bmi <= 18.4){
                return "Underweight";
        }
		else if (bmi >= 18.5 &&  bmi<= 24.9){
                return "Normal";
        } 
		else if (bmi >= 25.0 && bmi <= 39.9){
                return "Overweight";
        }
		else{
                return "Obese";
		}
     
	}
	
	
}
