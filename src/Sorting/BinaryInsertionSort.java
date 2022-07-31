package Sorting;

public class BinaryInsertionSort {
	
	static int binarySearch(int a[], int item, int low, int high)
	{
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        if (item == a[mid])
	            return mid + 1;
	        else if (item > a[mid])
	            low = mid + 1;
	        else
	            high = mid - 1;
	    }
	 
	    return low;
	}
	 
	// Function to sort an array a[] of size 'n'
	static void insertionSort(int a[], int n)
	{
	    int i, loc, j, k, selected;
	 
	    for (i = 1; i < n; ++i) {
	        j = i - 1;
	        selected = a[i];
	 
	        // find location where selected should be inseretd
	        loc = binarySearch(a, selected, 0, j);
	 
	        // Move all elements after location to create space
	        while (j >= loc) {
	            a[j + 1] = a[j];
	            j--;
	        }
	        a[j + 1] = selected;
	    }
	}
	 
	// Driver Code
	public static void main (String[] args)
	{
	    int a[]
	        = { 37, 23, 0, 40, 12};
	    int n = a.length, i;
	 
	    insertionSort(a, n);
	 
	    System.out.println("Sorted array:");
	    for (i = 0; i < n; i++)
	        System.out.print(a[i] +" ");
	 
	}
}
