package MyList;

public class MyStack<E> {
	int top;
	
	MyLinkedList<E> stack = new MyLinkedList<E>();
	
	public void push(E s) {
		stack.addFirst(s);
		top = getSize();
	}
	
	public void pop() {
		stack.removeFirst();
		top = getSize();
	}
	
	public E peek() {
		return stack.getFirst();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int getSize() {
		return stack.getSize();
	}
	
	public boolean search (E key) {
		return stack.search(key);
	}
	
	public void print() {
		stack.print();
	}
}
