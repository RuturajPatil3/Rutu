package ruturaj3;

//import up_casting.r_2;
import java.util.* ;

public class str_2 {
//str_1 g= new  str_2 ();
//	g.m1();
//		System.out.println("  ");
//		g.m2();
//	}
public void m2() {
	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
			for(int i=1 ; i<n ; i++) {
		for(int j=1 ; j<=i  ; j++) {
			System.out.print("*  ");
		}
//		for(int j =i ; j<=4; j++) {
//			System.out.print("        ");
//		}
		System.out.println();
	}
//	System.out.println();

		for(int  i= 1 ; i<=n; i++ ) {
			
		for(int j=i ; j<=n  ; j++) {
			System.out.print("*  ");
		}
		System.out.println();
		
	}

}	
}
