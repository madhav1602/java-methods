import java.util.Scanner;

class ComparingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];

        // Taking user input in array
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }

        // Calling method and printing result
        for(int i=0;i<5;i++){
            int number=numbers[i];
            boolean posNeg= checkPosNeg(number);

            if(posNeg){
                System.out.println("Number is positive");
                boolean evenOdd=checkEvenOdd(number);
                if(evenOdd){
                    System.out.println("Number is Even");
                    System.out.println();
                }
                else{
                    System.out.println("Number is odd");
                    System.out.println();
                }
            }
            else{
                System.out.println("Number is negative");
                System.out.println();   
            }
        }

        // Calling method and printing result
        String comp= compareNumber(numbers[0],numbers[numbers.length-1]);
        System.out.println(comp);


    }

    // Checking positive and negative
    public static boolean checkPosNeg(int num){
        if(num>0){
            return true;
        }
        else{
            return false;
        }
    }

    // Checking Even and Odd
    public static boolean checkEvenOdd(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    // Comparing first and last number
    public static String compareNumber(int num1, int num2){
        if(num1 > num2){
            return "first number is greater than last";
        }
        else if(num1 < num2){
            return "first number is less than last";
        }
        else{
            return "both numbers are equal";
        }
    }
	
	
}
