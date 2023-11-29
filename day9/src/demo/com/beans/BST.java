package demo.com.beans;

public class BST {
	class Node{
		int data;
		Node leftchild;
		Node rightchild;
		
		public Node(int d) {
			data=d;
			leftchild=rightchild=null;
		}
	}
	
	private Node root;
	
	public BST() {
		root=null;
	}

	public void insertNode(int val) {
		root=insert(root,val);
	}

	private Node insert(Node root, int val) {
		if(root==null) {
			Node newnode=new Node(val);
			root=newnode;
			return root;
		}
		
		if(root.data> val) {
			root.leftchild= insert(root.leftchild,val);
		}
		if(root.data< val) {
			root.rightchild= insert(root.rightchild,val);
		}
		return root;
	}
	
	public void displayInorder() {
		inorder(root);
	}

	private void inorder(Node root) {
		if(root!= null) {
			inorder(root.leftchild);  // L
			System.out.print(root.data+" ");  // D
			inorder(root.rightchild);   // R
		}
	}
}
