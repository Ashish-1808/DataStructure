/*Linear search also called as Sequential Search.*/
class LinearSearch
{
	public static void main(String[] args)
	{
		int[] arr={22,13,17,11,10,14,12};
		int ele=10;
		LinearSearch obj=new LinearSearch();
		obj.search(arr,ele);
	}
	
	void search(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Element is present at "+i+" index position");
			}
		}
	}
	
}