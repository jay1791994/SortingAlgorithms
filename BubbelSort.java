package java1;

public class BubbelSort {
	
	public static void main(String args[]) {
		
		
		int array[] = {4,10,8,56,32,45,12,21,25,26,27,28} ;
		
		for(int i=0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		int n =  array.length , temp , flag , count=0 ;
		
		
		System.out.println("if the elements are shorted and there is no change it takes less iteration than usuall bubbel sort mechanism");
			
		for (int i = 0; i < n-1; i++)    {  
			  flag= 0 ; 
		       // Last i elements are already in place   
		       for (int j = 0; j < n-i-1; j++) {
		    	   
		    	   
		           if (array[j] > array[j+1])
		           {
		        	   temp = array[j] ;
		        	   array[j]= array[j+1];
		        	   array[j+1]= temp ;
		        	   flag = 1 ;
		           }
		           
		   count++ ;
		   
		   }
		       if(flag == 0 ) {
	        	   System.out.println();
	        	   break ;
	           }
		       }
		System.out.println("sorted output after " + count + "times");
		
		for(int i=0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}

}

