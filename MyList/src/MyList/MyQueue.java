package MyList;

public class MyQueue<E> {
	private MyLinkedList<E> queue = new MyLinkedList<E>();
	
	public void enQueue(E s) {
		queue.addLast(s);
	}
	
	public void deQueue() {
		queue.removeFirst();
	}
	
	public void print() {
		queue.print();
	}
	public boolean search(E s) {
		return queue.search(s);
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
