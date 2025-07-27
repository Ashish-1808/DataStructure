/*Quick sort also called as patition-exchange sort.
-It is an efficient algorithm serving as a systematic method for placing the elements of an array in order.
-It was developed by Tony hoare in 1959 and published in 1961.
-It used divide and conquer stratergy.
*/

class QuickSort
{
	//method for printing array
	void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i +" ");
		}
	}
	
	//method for partition of array based on low and high index values
	int partition(int[] arr,int low,int high)
	{
		int temp;
		//int pivot=arr[(low+high)/2];  //middle element as a pivot element
		int pivot=arr[low];				//first element as a pivot element
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				//swapping of low and high
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	//Recursive Function 
	void quickSortRecursion(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);  //return low index of partition array
		if(low<pi-1)				//for left hand side array recursion
		{
			quickSortRecursion(arr,low,pi-1);
		}
		if(pi<high)					//for right hand side array recursion
		{
			quickSortRecursion(arr,pi,high);
		}
	}
	
	//main method
	public static void main(String[] args)
	{
		int[] arr={15,8,7,13,12,16,4,18,11};
		int leng=arr.length;	//length of array
		int low=0;
		
		QuickSort obj=new QuickSort();		//Object Creation
		obj.quickSortRecursion(arr,low,leng-1);
		obj.printArray(arr);
	}
}