class SelectionSortString
{
	public static void main(String[] args)
	{
		String[] arr={"Deepak","Rahul","Ramesh","Bhuppi","Amit"};
		int min;
		String temp="";
		
		for(int i=0;i<arr.length;i++)	//for iteration
		{
			min=i;						//set ith element index as a min inititally		
			for(int j=i+1;j<arr.length;j++)		//for traversal,comparison and swapping
			{
				if(arr[j].compareTo(arr[min])<0)
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