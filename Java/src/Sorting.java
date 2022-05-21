public class Sorting {
	public static void main(String[] args) 
	{
		int arr[]= {9,6,14,6,87,19,7,1,4,26,35,74,7,46,68,47};
		int n = arr.length;
		int temp = 0;
		for(int i=0; i < n; i++)
		{
            for(int j=1; j < (n-i); j++)
            {
             	if(arr[j-1] > arr[j])
            	{
		            temp= arr[j-1];
		            arr[j-1]= arr[j];
            		arr[j]= temp;
             	}
	
            }

    	}
       System.out.println("Sorted array is:");
       for(int i=0;i<n;i++) {
   	   System.out.println(" "+arr[i]);
       }
	}
}