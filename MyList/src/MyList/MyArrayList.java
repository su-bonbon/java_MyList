package MyList;

public class MyArrayList {
	private String[] list;
	private int capacity = 4;
	private int size;
	
	public MyArrayList() {
		this.list = new String[this.capacity];
	}
	public MyArrayList(int capacity) {
		if(capacity > 4)
			this.capacity = capacity;
		this.list = new String[this.capacity];
	}
	public int getSize() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.getSize() == 0;
	}
	public void addFirst(String s, int index) {
		if(index >=0 && index <= size) {
			if(size >= capacity) resize(this.capacity * 2);
			for (int i = size -1; i >= index; i--) {
				list[i+1] = list[i];
			}
			list[index] = s;
			size++;
			
		} else {
			System.out.print("select valid value");
		}
	}
	public void removeFirst(String key) {
		int index = search(key);
		if(index != -1) {
			for(int i = index + 1; i < size; i++) {
				list[i-1] = list[i];
			}
			size--;
			list[size] = null;
			if(size != 0 && capacity/size >= 4) resize(this.capacity/2);
			System.out.println(key + "removed");
		} else {
			System.out.println(key + " is not in the list");
		}
	}
	public void addFirst() {
		
	}
	// element to the end of the list (natural)
	public void addLast(String str) {
		if(size >= capacity) resize(this.capacity * 2);
		list[size] = str;
		size++;
	}
	public void removeLast() {
		
		if(!isEmpty()) {
			size--;
			String temp = list[size];
			list[size] = null;
			if(size != 0 && capacity/size >= 4) resize(this.capacity/2);
			System.out.print(temp + "removed");
		} else {
			System.out.print("list is empty!");
		}
	}
	public String getElement(int index) {
		if(index >= 0 && index <= this.size) {
			return list[index];
		} else return "select valid value";
	}
	public int search(String key) {
		for(int i = 0; i < size; i++) {
			if(list[i].equals(key)) return i;
		} 
		return -1;
	}
	// we have to refactor it later 
	private void resize(int capacity) {
		this.capacity = capacity;
		
		String temp [] = list;
		list = new String[capacity * 2];
		
		for(int i = 0; i < size; i++) {
			list[i] = temp[i];
		}
	}
	
	public void print() {
		System.out.print(" | ");
		for(int i = 0; i < capacity; i++) {
			System.out.print(list[i] + " | ");
		}
		System.out.println();
	}
	public void removewDuplicate() {
		
	}
}
