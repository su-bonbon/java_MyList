package MyList;

public class MyQueue {
	MyLinkedList queue = new MyLinkedList();
	
	public void enQueue(String s) {
		queue.addLast(s);
	}
	
	public void deQueue() {
		queue.removeFirst();
	}
	
	public void print() {
		queue.print();
	}
	public boolean search(String s) {
		return queue.search(s);
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
