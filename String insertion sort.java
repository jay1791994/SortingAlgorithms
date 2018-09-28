package java1;

import java.awt.Button;
import java.awt.Panel;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


public class StringDA {
	
	 public static void main( String [ ] args ) {
		 
		 
		 Scanner sc =  new Scanner(System.in);
		 
		 System.out.println("sorting an array of string using insertion sort");
		 
		
		 
		 String[] a = new String[10] ;
		 
		 for(int i=0 ; i < a.length ; i++) {
			 
			 a[i] = sc.next() ;  
			 
		 }
		 
		 String temp =  null ;
		 
		 for(int j=1 ; j < a.length ; j++) {
			 
			 temp = a[j] ;
			
			 for( int k =j-1 ; a[k].compareTo(temp)>0 && k >=0 ; k--){
				 
				 a[k+1] = a[k];
				 a[k] = temp ;
				 
			 }
		 }
		 
for(int d=0 ; d < a.length ; d++) {
			 
	System.out.println(a[d]); 
			 
		 }
		 
		
			 
			 
			 
		 }
		 
		 
		 
	 }
	 

