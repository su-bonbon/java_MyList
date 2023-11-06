package MyList;

public class MyLinkedList<E> implements MyList<E>{

	MyNode<E> first;
	MyNode<E> last;
	int size;
	
	public MyLinkedList() {
		first = last = null;
	}
	
	public E getFirst() {
		return first.element;
	}
	
	public Object getLast() {
		return last.getElement();
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int getSize() {
		return size;
	}
	
	// O(1)
	public void addFirst(E s) {
		MyNode<E> newNode = new MyNode<E>(s);
		if (isEmpty()) {
			last = newNode;
		} else {
			newNode.setNext(first);
		}
		first = newNode;
		size++;
	}
	
	// O(1)
	public void addLast(E s) {
		MyNode<E> newNode = new MyNode<E>(s);
		if(isEmpty()){
			first = newNode;
		}else{
			last.setNext(newNode);

		}
		last = newNode;
		size++;
	}
	
	public void removeFirst(){
		if(!isEmpty()){
			Object temp = first.getElement();
			if(first == last){
				first = null;
				last = null;
			}else{
				first = first.getNext();
			}
			size--;
			System.out.println(temp +" is removed.");
		}else{
			System.out.println("The list is empty");
		}
	}
	
	// O(n)
	public void removeLast(){
		if(!isEmpty()){
			Object temp = last.getElement();
			if(last == first){
				last = first = null;
			}else{
				MyNode<E> prev = first;
				while(prev.getNext() != last){
					prev = prev.getNext();
				}
				prev.setNext(null);
				last = prev;
			}
			size--;
			System.out.println(temp + " is removed.");
		}else{
			System.out.println("The list is empty");
		}
	}
	
	public boolean search(E key){
		MyNode<E> pointer = first;
		while(pointer != null && pointer.getNext().equals(key)){
			pointer = pointer.getNext();
		}
		return pointer != null;
	}
	
	public void remove(E key) {
		if (search(key)) {
			MyNode<E> prev = first;
			MyNode<E> curr = first;
			while (curr != null && !curr.getElement().equals(key)) {
				prev = curr;
				curr = curr.getNext();
			}
			if (curr == first) {
				removeFirst();
			} else if (curr == last) {
				removeLast();
			} else {
				prev.setNext(curr.getNext());
				size--;
				System.out.println(key + " is removed.");
			}
		} else {
			System.out.println(key + " is not in the list.");
		}
	}
	
	public void print(){
		MyNode<E> pointer = first;
		if(!isEmpty()) {
			System.out.println(" | ");
			while (pointer != null) {
				System.out.println(pointer.getElement() + " | ");
				pointer = pointer.getNext();
			}
			System.out.println();
		}
	}

}

class MyNode<E>{
	E element;
	MyNode<E> next;
	public MyNode(E element){
		this.element = element;
	}
	public Object getElement(){
		return element;
	}
	public void setNext(MyNode<E> first) {
		
	}
	public MyNode<E> getNext() {
		return next;
	}
}
