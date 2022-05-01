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
	
	public Node1 insertRec(Node1 root, int key) {
		// check for empty BST and add new Node1
		if (root==null) {
			root = new Node1(key);
			//root.data = key;
			return root;
		}

		// if non-empty BST, add Node1
		if (key < root.data)
			root.left = insertRec(root.left, key);
		else
			root.right = insertRec(root.right, key);

		// return Node1 in the end
		return root;
	}

	// Inorder traversal of the BST
	public void inorderTrav(Node1 Node1) {
		if (Node1 == null)
			return;
		inorderTrav(Node1.left);
		System.out.println(Node1.data + " ");
		inorderTrav(Node1.right);

	}

	public void checkPairSum(Node1 Node1, int value) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = treeToList(Node1, arr1);

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

	ArrayList<Integer> treeToList(Node1 Node1, ArrayList<Integer> list) {
		// Check for empty BST return
		if (Node1 == null)
			return list;

		// Add tree Node1s to list from left Node1 to right Node1
		treeToList(Node1.left, list);
		list.add(Node1.data);
		treeToList(Node1.right, list);

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

	// Initialize Node1 for BST
	Node(int d) {
		this.data = d;
		this.left = this.right = null;
	}

}
