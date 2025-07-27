
/*The  selection sort is a combination of searching and sorting.
It sorts an array by repeatedly finding the minimum element from 
unsorted part and putting it at beginning.
In every iteration of selection sort,the minimum element
(considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.*/

class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr={38,52,9,18,6,62,13};
		int min,temp=0;
		
		for(int i=0;i<arr.length;i++)	//for iteration
		{
			min=i;						//set ith element index as a min inititally		
			for(int j=i+1;j<arr.length;j++)		//for traversal,comparison and swapping
			{
				if(arr[j]<arr[min])
				{
					min=j;				//set new min index from i+1 to n
				}	
			}
			//swapping
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}