package bst;

public class MyBST<E extends Comparable<E>> {
	private MyTreeNode<E> root;
	
	public boolean isEmpty() {
		return root == null;
	}
	public void getRoot () {
		System.out.print(root!=null? root.element:"root is null" );
	}
	public boolean insert(E element) { //
		MyTreeNode<E> newTreeNode = new MyTreeNode<E>(element);
		
		if(isEmpty()) {
			root = newTreeNode;
			return true;
		} else if(!search(element)) {
			MyTreeNode<E> current = root;
			MyTreeNode<E> parent = root;
			
			while(current != null) {
				if(element.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if(element.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} 
			} 
			if(element.compareTo(parent.element) < 0) {
				parent.left = newTreeNode;
			} else {
				parent.right = newTreeNode;
			}
			return true;
		} return false;
	}
	
	public boolean search(E key) { //O(logn)
		MyTreeNode<E> current = root;
		while(current != null) {
			if(key.compareTo(current.element) < 0) {
				current = current.left;
			} else if(key.compareTo(current.element) > 0) {
				current = current.right;
			} else return true; //found
		} 
		return false; //not found
	}
	
	public void print() {
		dfs(root);
	}

	private void dfs(MyTreeNode<E> current) {  //dfs-preorder
		if(current != null) {
			dfs(current.left);
			System.out.print(current.element + " ");
			dfs(current.right);
		}
		
	}
	
	private void dfs_inorder(MyTreeNode<E> current) {
		if(current != null) {
			dfs(current.left);
			System.out.print(current.element + " ");
			dfs(current.right);
		}
		
	}
	
	private void dfs_postorder(MyTreeNode<E> current) {
		if(current != null) {
			dfs(current.left);
			dfs(current.right);
			System.out.print(current.element + " ");
		}
		
	}
	
	public boolean delete(E element) {
		if(!isEmpty() && search(element)) {
			//start case1
			MyTreeNode<E> current = root;
			MyTreeNode<E> parent = root;
			
			while(current != null) {
				if(element.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (element.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else break;
			}
			
			if(current.left == null) { //case1
				if(current == root) {
					root = current.right;
				} else if(element.compareTo(parent.element) < 0) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
				
			} else { //case2
				MyTreeNode<E> rightMost = current.left;
				MyTreeNode<E> parentOfrightMost = current;
				
				while(rightMost.right != null) {
					parentOfrightMost = rightMost;
					rightMost = rightMost.right;
				}
				current.element = rightMost.element;
				
				if(rightMost.equals(current.left)) {
					parentOfrightMost.left = rightMost.left; // b
				} else {
					parentOfrightMost.right = rightMost.left; // b
				}
			}return true;
		}return false;
	}
}

class MyTreeNode<E> {
	E element;
	MyTreeNode<E> left;
	MyTreeNode<E> right;
	
	MyTreeNode(E element) {
		this.element = element;
	}
}
