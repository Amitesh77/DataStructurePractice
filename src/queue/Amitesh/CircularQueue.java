package queue.Amitesh;

public class CircularQueue {
	
	int arr  [];
	int top;
	int start;
	int size;
	public CircularQueue(int size) {
		
		this.arr = new int[size];
		this.top = -1;
		this.start = -1;
		this.size = size;
	}
	
	
	
	
	public void enQueue(int value)
	{
		if(arr==null)
		{
			System.out.println("Please create queue");
		}
		
		else if(isFull())
		{
			System.out.println("Queue over flow.");
		}
		
		else
		{
			initializestartofArray();
			if(top+1==size)
			{
				top=0;
			}
			else
			{
				top++;
			}
		}
		
		arr[top]=value;
		
		System.out.println("Successfully inserted  "+value);
	}
	
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		
		else
		{
			System.out.println("\n---------------------------------------------");
			System.out.println("Before Dequeue..");
			printArray();
			
			System.out.println("\nDequeing value from Queue...");
			
			System.out.println("Dequeued: "+arr[start]+" from queue");
			arr[start] = 0; //initialize the unused cell to 0
			if (start == top) { //if there is only 1 element in Queue
				start = top = -1;
			}else if (start+1 == size) { //if start has reached end of array, then start again from 0
				start=0;
			}else {
				start++;
			}
		}
		System.out.println("After Dequeue..");printArray();
		System.out.println("---------------------------------------------");
		
	}
	
	public boolean isFull()
	{
		if(top==arr.length-1 || start==arr.length)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void initializestartofArray()
	{
		if(start==-1)
		{
			start=0;
		}
		
		
	}
	
	public void printArray()
	{
		System.out.println("Array now...");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nStart = " + start);
		System.out.println("End = "+ top);
	}
	
	
}
