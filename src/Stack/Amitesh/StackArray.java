package Stack.Amitesh;

public class StackArray {
	
	int arr[];
	int topofstack;
	
	
	public StackArray(int size) {
		
		
		this.arr=new int[size];
		
		this.topofstack=-1;
	}
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow!!!");
		}
		
		else
		{
			arr[topofstack+1]=value;
			topofstack+=1;
			System.out.println("Successfully inserted  "+value);
		}
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stackover flow Stack is empty");
		}
		
		else
		{
			System.out.println("Removing value from top of stack  "+arr[topofstack]+"....");
			topofstack--;
		}
	}
	
	public void peek()
	{
		if(!isEmpty())
		{
			System.out.println("the top of stack is  "+arr[topofstack]);
		}
		
		else
		{
			System.out.println("Stack is empty");
		}
		
		System.out.println(); System.out.println();
	}
	
	public void deleteStack()
	{
		arr=null;
		
		System.out.println("Stack is successfully deleted.");
	}
	
	public boolean isFull()
	{
		if(topofstack==arr.length-1)
		{
			System.out.println("Stack is full!!!  ");
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(topofstack==-1)
		{
			System.out.println("Stack is empty ");
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	

}
