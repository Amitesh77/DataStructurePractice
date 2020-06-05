package Stack.Amitesh;

import SinglyLinkedList.SingleLinkedList;

//import linkedList.SingleLinkedList;

public class StackLinkedList {
	
	SingleLinkedList list;
	
	
	public StackLinkedList()
	{
		list=new SingleLinkedList();
	}
	
	public boolean isEmpty()
	{
		if(list.getHead()==null)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public void push(int value)
	{
		if(list.getHead()==null)
		{
			list.createLinkedList(value);
		}
		
		else
		{
			list.inserinLinkedList(value, 0);
		}
		
		System.out.println("Inserted value  :"+value);
	}
	
	public int pop()
	{
		
		int value=-1;
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			 value=list.getHead().getValue();
			 
			 list.deleteNode(0);
		}
		
		return value;
	}
	
	public int peek() {
		if (!isEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The stack is empty!!");
			return -1;
		}
	}
	
	public void deleteStack() {
		list.setHead(null);
	}
}
