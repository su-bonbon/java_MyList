package MyList;

public class TestMyList {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.print();
		list.addLast("a");
		list.addLast("a");
		list.addLast("a");
		list.addLast("b");
		list.print();
		System.out.println(list.getElement(0));
		System.out.println(list.getElement(110));
		list.removewDuplicate();
		list.print();
	}

}
