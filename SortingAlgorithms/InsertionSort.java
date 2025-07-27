/*Insertion sort is a sorting techinique where we place element in its appropriate position.*/

class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr={5,6,3,1,8,7,2,4};
		int temp;
	
		for(int i=1;i<arr.length;i++)		//for  no of comparisons
		{
			temp=arr[i];					//copy i'th element in temp for comparisons
			int j=i;						//initially j & i points to the same element
			while(j>0 && arr[j-1]>temp)
			{
					arr[j]=arr[j-1];		//shifting element
					j--;
			}
			arr[j]=temp; 					//Insert element at its correct position
		}
	
		//print sorted array
		System.out.print("Sorted Array: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
	}
	

}