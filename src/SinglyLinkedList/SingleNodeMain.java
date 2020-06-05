package SinglyLinkedList;

public class SingleNodeMain {
	
	public static void main (String[] args) {
		
		SingleLinkedList list=new SingleLinkedList();
		
		list.createLinkedList(67);
		
		list.inserinLinkedList(2,10);
		list.inserinLinkedList(29,10);
		
		list.inserinLinkedList(45,3);
		list.inserinLinkedList(48,4);
		list.inserinLinkedList(78,5);
		list.inserinLinkedList(89,6);
		
		list.Traversal();
		
		list.SearchLinkedlist(29);
		
		//list.deleteNode(2);
		
		//list.reverLinkedList();
		
		list.reversalRecursion();
		
		list.Traversal();
	
	
}
}
