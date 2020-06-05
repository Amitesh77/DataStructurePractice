package Problems;

import SinglyLinkedList.SingleLinkedList;

// Find kth node from last

public class FromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list=new SingleLinkedList();
		
		list.createLinkedList(13);
		list.inserinLinkedList(23, 1);
		list.inserinLinkedList(78, 2);
		list.inserinLinkedList(56, 3);
		list.inserinLinkedList(87, 4);
		list.inserinLinkedList(45, 5);
		list.inserinLinkedList(21, 6);
		list.inserinLinkedList(3, 7);
		list.inserinLinkedList(98, 8);
		
		list.kthfromLast(5);
		
		
		

	}

}
