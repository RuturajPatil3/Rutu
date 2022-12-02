package ruturaj3;

import java.util.*;

public class str_1 {
	
	public static void main(String[] args) {
		
		str_2 k=new str_2();
		
		k.m2();
		
		System.out.println("=====================s");
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		for (int a= 1  ; a<n ; a++ ) {
			for(int b =a ; b<=n ; b++) {
				System.out.print("   ");
			}
			for(int b=1; b<=a; b++ ) {
				System.out.print(" *");
			}
			for (int b=1; b<a; b++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		 for (int d=1 ; d<=n ;d++ ) {
			 for(int e =1 ; e<=d ; e++) {
				 System.out.print("   ");
			 }
			 for(int e =d ; e<n ; e++) {
				 System.out.print(" *");
			 }
			 for (int e =d ; e<=n ; e++) {
				 System.out.print(" *");
			 }
			 
			 System.out.println();
		 }
		
	
//	for (int a=1 ; a<=3 ; a++ ) {
//	
//	for (int b =1; b<=a; b++) {
//		
//		System.out.print("x ");
//	}
//	
//	for (int b = a ; b<=3 ; b++) {
//		System.out.print("  ");
//	}
//	for (int b = 1; b<=a; b++) {
//		
//		System.out.print("x ");
//	}
//	System.out.println();	
}
}
//above pattern for diamond


//	public static void main(String[] args) {
//
//
//
//for(int i=1 ; i<=4 ; i++) {
//for(int j=1 ; j<=i  ; j++) {
//System.out.print("*  ");
//}
//for(int j =i ; j<=4; j++) {
//System.out.print("        ");
//}
//
//
//
//for(int j=1 ; j<=i  ; j++) {
//System.out.print("*   ");
//}
//System.out.println();
//
//}
//
//for(int i=1 ; i<=5 ; i++) {
//for(int j=i ; j<=5 ; j++) {
//System.out.print("*  ");
//}
//for(int j =1 ; j< i; j++) {
//System.out.print("       ");
//}
//for(int j=i; j<=5 ; j++) {
//System.out.print("*   ");
//}
//System.out.println();
//}

//}}
