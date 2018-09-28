
public class quickSort {
	
	public static void main(String args[]) {
		
		System.out.println("quick sort algo");
		int[] a = {21,23,54,3,42,22} ;
		
		sort(a , 0 , a.length-1);
		
		for(int i=0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}

	private static void sort(int[] a, int i, int length) {
		
		if(i < length) {
			
		int	pi = partition(a , i , length) ;
			
			sort(a , i , pi-1) ;
			sort(a ,pi+1 , length) ;
			}
		
	}

	private static int partition(int[] arr, int low, int high) {
	     
		int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
				
			}
			
		
		
		

	
}
