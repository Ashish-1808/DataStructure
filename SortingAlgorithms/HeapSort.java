/*
 1. Understand the Heap Concept
	-A Heap is a special binary tree that satisfies the heap property:
		Max-Heap: Every parent node is greater than or equal to its children.
		Min-Heap: Every parent node is less than or equal to its children.
	For Heap Sort, we typically use a Max-Heap to sort in ascending order.
🔹 2. Main Steps in Heap Sort
	Step 1: Build a Max-Heap
		-Start from the last non-leaf node: (n/2 - 1)
		-Call heapify() in reverse level order (bottom-up).
		-This ensures the largest element is at the root (index 0).

	Step 2: Extract Elements One by One
		-Swap the root (largest element) with the last element in the heap.
		-Reduce the heap size by 1.
		-Call heapify() again on the root to maintain max-heap.
	Repeat until the heap is reduced to one element.	
	
🧠 Heapify Logic
	The heapify(arr, n, i) method:
		-Checks the current node i, its left (2*i+1), and right (2*i+2) children.
		-Finds the largest among the three.
		-If one of the children is larger than the current node, swap them.
		-Recursively heapify the affected subtree.

*/

/*
2*i+1-->Child Index(Left)
2*i+2-->Child Index(Right)

(i-1)/2--> Parent Index 
*/
class HeapSort
{
	//print the sorted array
	void printArray(int[] arr)
	{
		System.out.print("Sorted Array: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
	//method for heapify the tree structure
	void heapify(int[] arr,int n,int i)
	{
		int largest=i;
		int li=2*i+1;		//calculate index position of left child node
		int ri=2*i+2;		//calculate index position of right child node
		
		if(li<n && arr[li]>arr[largest])		
		{
			largest=li;			//if left child is greater than the parent set largest=left_index
		}
		if(ri<n && arr[ri]>arr[largest])
		{
			largest=ri;			//if right child is greater than the parent set largest=right_index
		}
		
		if(largest!=i)			////if parent node is not greater than the child node then swap parent node with greater child node
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
	}
	
	void sort(int[] arr)
	{
		int leng=arr.length;
		//calculate parent node position and pass values for heapify the tree
		for(int i=leng/2-1;i>0;i--)
		{
			heapify(arr,leng,i);
		}
		
		//swap the elements and heapitfy again
		for(int i=leng-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={22,13,17,11,10,14,12};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
}

//////////////////////////////////////////////////////////////////////////////////