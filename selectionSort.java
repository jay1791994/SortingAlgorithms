
public class selectionSort {
	

	public static void main(String args[]) {
	 System.out.println("sorting using selection sort");
	 
	 int arr[] = {21,12,14,54,24,27,65,34,67,88,7,6,44,3,4} ;
	 
	 for(int i=0 ;  i < arr.length ; i++ ) {
		 
		int  min = i ;
		 
		 for(int j=i+1 ; j < arr.length ; j++ ) {
			 
			 if(arr[j] < arr[min]) {
				 
				min = j ;
				
			 }
			  }
		 
		 
		 int temp = arr[min] ;
		 arr[min] = arr[i] ;
		 arr[i] = temp ;
		 
	 }
	 
	 for(int k=0 ; k < arr.length ; k++) {
		 System.out.println(arr[k]);
	 }
	
	}

}
