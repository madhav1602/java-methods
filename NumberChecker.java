import java.util.*;
public class NumberChecker {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int count=countDigits(number);
		int[] digits=storeDigits(count,number);
		boolean duck=duckNumber(digits);
		boolean armstrong=armstrongNumber(digits, count, number);
		int max=maxNumber(digits);
		int min=minNumber(digits);
		
		System.out.println("Count of Digits: " + count);
        	System.out.println("Duck Number: " + duck);
        	System.out.println("Armstrong Number: " + armstrong);
        	System.out.println("Largest Digit: " + max);
        	System.out.println("Smallest Digit: " + min);
		
	}
	
	public static int countDigits(int num){
		int count=0;
		int temp=0;
		while(num>0){
			temp=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static int[] storeDigits(int count, int num){
		int[] arr=new int[count];
		int temp=0;
		for(int i=count-1;i>=0;i--){
			temp=num%10;
			arr[i]=temp;
			num=num/10;
		}
		return arr;
		
	}
	
	public static boolean duckNumber(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] !=0 ){
				return true;
			}
			
		}
			return false;
	}
	
	public static boolean armstrongNumber(int[] arr, int count,int num){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum= sum + (int) Math.pow(arr[i], count);
		}
		return sum==num;
	}
	
	public static int maxNumber(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int minNumber(int[] arr){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min=arr[i];
			}
		}
		return min;
	}

}
