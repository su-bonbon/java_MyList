package MyList;

public class MyQueue {
	MyLinkedList queue = new MyLinkedList();
	
	public void enQueue(String s) {
		queue.addLast(s);
	}
	
	public void deQueue() {
		queue.removeFirst();
	}
}
