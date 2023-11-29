package com.demo.test;

import demo.com.beans.BST;

public class testBST {

	public static void main(String[] args) {
		BST ob=new BST();
		
		ob.insertNode(50);
		ob.insertNode(52);
		ob.insertNode(20);
		ob.insertNode(22);
		ob.insertNode(18);
		ob.insertNode(53);
		ob.insertNode(25);
		ob.insertNode(19);
		ob.insertNode(21);
		
		ob.displayInorder();

	}

}
