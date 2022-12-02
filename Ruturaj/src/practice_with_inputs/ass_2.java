package practice_with_inputs;
import java.util.Scanner;

public class ass_2 {

	
	public static void main(String[] args) {
		System.out.println("Enter the no : -");
		 Scanner h=new Scanner(System.in);
		 
		 int n=h.nextInt();
		 
		 System.out.println("TABLE OF "+n+" :-");
		 System.out.println("     ");
		 
		 for(int i = 1; i<=10; i++) {
			 
			 System.out.printf("%d * %d = %d \n",n, i, n*i);
		 }
		
		
	}
}
