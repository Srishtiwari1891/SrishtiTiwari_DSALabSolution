package com.greatlearning.dsa.lab3.bst.binarysearchtree;

import java.util.ArrayList;

public class BinarySearchTree {
	
	Node root;
	
	//Insert node in the BST
	public void insertNode(int key) {
		root=insertRec(this.root,key);
	}
	
	//Check for sum value in BST
	public void isPresent(int value) {
		checkPairSum(this.root,value);
	}
	
	//Print inorder traversal
	public void inorder() {
		inorderTrav(this.root);
	}
	
	public Node insertRec(Node root, int key) {
		// check for empty BST and add new Node
		if (root==null) {
			root = new Node(key);
			//root.data = key;
			return root;
		}

		// if non-empty BST, add Node
		if (key < root.data)
			root.left = insertRec(root.left, key);
		else
			root.right = insertRec(root.right, key);

		// return Node in the end
		return root;
	}

	// Inorder traversal of the BST
	public void inorderTrav(Node Node) {
		if (Node == null)
			return;
		inorderTrav(Node.left);
		System.out.println(Node.data + " ");
		inorderTrav(Node.right);

	}

	public void checkPairSum(Node Node, int value) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = treeToList(Node, arr1);

		int start = 0;
		int end = arr2.size() - 1;
		while (start < end) {
			if (arr2.get(start) + arr2.get(end) == value) {
				System.out.println("\n***Output***\nSum = "+value+"\nPair("+arr2.get(start)+","+arr2.get(end)+")");
				return;
			}

			if (arr2.get(start) + arr2.get(end) > value)
				end--;

			if (arr2.get(start) + arr2.get(end) < value)
				start++;
		}
		System.out.println("\n***Output***\nNo Node Pair match found for the sum value: " + value);
		return;
	}

	ArrayList<Integer> treeToList(Node Node, ArrayList<Integer> list) {
		// Check for empty BST return
		if (Node == null)
			return list;

		// Add tree Nodes to list from left Node to right Node
		treeToList(Node.left, list);
		list.add(Node.data);
		treeToList(Node.right, list);

		return list;
	}
}

class Node {

	int data;
	Node left, right, root;

	Node() {
		this.data=-1;
		this.left = this.right = null;
	}

	// Initialize Node for BST
	Node(int d) {
		this.data = d;
		this.left = this.right = null;
	}

}
