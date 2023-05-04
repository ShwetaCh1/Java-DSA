package Heap;


	 public class HeapDataStructure {
	    public int Heap[];
	    public int size;
	    public int capacity;
	    HeapDataStructure(int cap)
	    {
	        size=0;
	        capacity=cap;
	        Heap = new int[cap];
	    }
	    public int parent(int i)
	    {
	        return (i-1)/2;
	    }
	    public int leftChild(int i)
	    {
	        return (2*i)+1;
	    }
	    public int rightChild(int i)
	    {
	        return (2*i)+2;
	    }
	    public void swap(int i,int j)
	    {
	        int t=Heap[i];
	        Heap[i]=Heap[j];
	        Heap[j]=t;
	    }
	    public void insert(int ele)
	    {
	        Heap[size]=ele;
	        int curr=size;
	        while(Heap[curr] > Heap[parent(curr)])
	        {
	            swap(curr,parent(curr));
	            curr=parent(curr);
	        }
	        size++;
	    }
	    public void print()
	    {
	        for(int i = 0 ;i<size/2;i++)
	        {
	            System.out.print("Parent is "+ Heap[i]);
	            if(leftChild(i) < size)
	            {
	                System.out.print(" Left child is " +Heap[leftChild(i)]);
	            }
	            if(rightChild(i) < size)
	            {
	                System.out.print(" Right child is "+ Heap[rightChild(i)]);
	            }
	            System.out.println();
	        }
	    }
	    public int extractMax()
	    {
	        int pop_ele = Heap[0];
	        Heap[0]=Heap[--size];
	        maxHeapify(0);
	        return pop_ele;
	    }
	    public boolean isLeaf(int index)
	    {
	        if(index>=size/2)
	        {
	          return true;  
	        }
	        return false;
	    }
	    public void maxHeapify(int index)
	    {
	        if(isLeaf(index))
	        {
	            return ;
	        }
	        if(Heap[index] < Heap[leftChild(index)] || Heap[index] < Heap[rightChild(index)])
	        {
	            if(Heap[leftChild(index)] > Heap[rightChild(index)])
	            {
	                swap(index,leftChild(index));
	                maxHeapify(leftChild(index));
	            }
	            else
	            {
	                swap(index,rightChild(index));
	                maxHeapify(rightChild(index));
	            }
	        }
	    }
		public static void main (String[] args) {
		 HeapDataStructure max = new HeapDataStructure(10);
		 max.insert(5);
		 max.insert(3);
		 max.insert(17);
		 max.insert(10);
		 max.print();
		System.out.println(max.extractMax());
	 max.print();
		}
	}
//heap
	 //https://ide.geeksforgeeks.org/online-java-compiler/3f04d8a1-a5fa-4838-90cf-1bfe338e45cd
//https://ide.geeksforgeeks.org/online-java-compiler/b0438351-b9b5-4d9b-8eec-5accb04653a6
	// meadian of the stream of the index
	 //https://ide.geeksforgeeks.org/online-java-compiler/7e604c38-9384-4218-9230-397ab82707bd
	 
	 //Kth smallest
	 //kth largest
	 //https://ide.geeksforgeeks.org/online-java-compiler/261f38fe-4ef8-4e25-8640-690a5f1745c7
	 //https://ide.geeksforgeeks.org/online-java-compiler/aa34f153-00c6-4b12-aa47-8b9cda50e76b9:36 pm 
	 //https://ide.geeksforgeeks.org/online-java-compiler/6d229f2f-022e-4b91-b9cf-c4afb21fef019:37 pm 