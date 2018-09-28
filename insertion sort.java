package java1;

import java.awt.Button;
import java.awt.Panel;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


public class StringDA {
	
	 public static void main( String [ ] args ) {
		 
		 
		 System.out.println("sorting using insertion sort");
		 
		 int a[] = { 21,11,34,54,65,34,21,32} ;
		 int temp = 0 ;
		 
		 for(int i = 1 ; i < a.length ; i ++) {
			 
			 temp = a[i] ;
			 
			 for(int j=i-1 ;  j >= 0 && a[j] > temp ; j--) 
				 
			  {a[j+1] = a[j] ;
			 
			  a[j] = temp ;}
			 
			 
		 }
		 
		 for(int k=0 ; k < a.length ; k++) {
			 System.out.println(a[k]);
		 }
         		 
		 
		
		 
		 
		 
	 }
	 
}
