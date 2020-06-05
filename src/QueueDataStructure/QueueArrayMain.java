package QueueDataStructure;

public class QueueArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueArray queue=new QueueArray(5);
		
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(50);
		queue.enqueue(40);
		
		queue.printQueue();
		
		queue.deQueue();
		
		queue.printQueue();
		
		

	}

}
