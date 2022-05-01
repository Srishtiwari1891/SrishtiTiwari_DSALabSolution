package com.greatlearning.dsa.lab3.bst.driver;

import java.util.Scanner;

import com.greatlearning.dsa.lab3.bst.binarysearchtree.BinarySearchTree;

public class DriverClass {

	public static void main(String[] args) {
		// Initialize Scanner object
		Scanner sc=new Scanner(System.in);
		int n,sum,key;
		BinarySearchTree objBst;
		try {
			objBst=new BinarySearchTree();			
			//Get number of nodes in the BST
			System.out.println("No. of nodes in BST:");
			n=sc.nextInt();
			
			//Insert nodes in BST
			System.out.println("Enter Tree nodes(by level)");
			for(int i=1;i<=n;i++)
				objBst.insertNode(sc.nextInt());
			
//			objBst.insertNode(15);
//			objBst.insertNode(10);
//			objBst.insertNode(20);
//			objBst.insertNode(8);
//			objBst.insertNode(12);
//			objBst.insertNode(16);
//			objBst.insertNode(25);
			
			//Get sum value to check in BST
			System.out.println("Enter the sum to check in BST: ");
			sum=sc.nextInt();
			
			//Check BST for the presence for the sum value
			objBst.isPresent(sum);				
		}
		finally {
			//Release memory allocated to Scanner object
			sc.close();
		}
	}

}