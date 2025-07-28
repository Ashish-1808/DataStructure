/*
-->If there is String array then use comapreTo method for compare two array string elements.
comapareTo method is used to compare two objects (typicaly for sorting).It comes from comparable interface.
-->comapareTo is used forcomparing two strings lexicographically.Each character of both strings are conveted into 
 a unicode value.lexical order is nothing but alphabetically order.
	 returns<0 : then the string calling the method is lexicographically first
	 returns==0 : then the string are lexicographically same
	 returns>0 : then the parameter passed to the compareTo method is lexicographically first.
 
*/
class BubbleSortString
{
	public static void main(String[] args)
	{
		String[] arr={"deepak","Amit","deepash","vironika","rahul"};
		String temp;
		
		for(int i=0;i<arr.length;i++)			//for no of iteration
		{
			int flag=0;							
			for(int j=0;j<arr.length-1-i;j++)	//for comaprison and swapping
			{
				if(arr[j].compareTo(arr[j+1])>0)
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