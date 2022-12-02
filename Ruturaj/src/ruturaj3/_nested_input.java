package ruturaj3;
import java.util.Scanner;
public class _nested_input {
	
	public static void main(String[] args) {
		
		
		//Java nested if Program
		
		//
//			     {
//			        //Take input from the user
//			        //Create an instance of the Scanner class
			        Scanner sc=new Scanner(System.in);
			        
			        System.out.println("Enter a number: ");
			        int num=sc.nextInt();
			        
			        if (100>num) {
			        	
			        	System.out.println("less than 100");
			        	
			        
			        	
			        	if(num>50)  {
			        		System.out.println(" greater than 50");
			        	}
			        	else {
			        		System.out.println("less than 50");
			        	}
			        }
			        
			        else {
			        	System.out.println("greater than 100");
			        }
		}
			
	

}
