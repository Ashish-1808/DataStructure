/*Bubble out maximum element at the last by adjustancy swapping...*/

class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr={36,19,29,12,5};
		int temp;
		for(int i=0;i<arr.length;i++)			//for no of iteration
		{
			int flag=0;							
			for(int j=0;j<arr.length-1-i;j++)	//for comaprison and swapping
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)							// if iteration are not over but array get sorted then avoid extra iteration
			{
				break;
			}
		}
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
