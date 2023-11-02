package bst;

public class TestMyBST {

	public static void main(String[] args) {
		MyBST<Integer> bst = new MyBST<Integer>();
		
		bst.print();
		bst.insert(60);
		bst.insert(77);
		bst.insert(54);
		bst.insert(10);
		bst.insert(20);
		bst.insert(28);
		bst.print();
		
		System.out.print(bst.search(99));
		
		bst.getRoot();
		
	}

}
