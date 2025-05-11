package programs;

import java.util.Scanner;

public class BinaryTreeDS {

	static Scanner sc = new Scanner(System.in);
	
	static TreeNode createTree() {
		TreeNode root = null;
		System.out.println("Enter Data: ");
		
		int data = sc.nextInt();
		
		if(data==-1) {
			return null;
		}
		
		root = new TreeNode(data);
		
		System.out.println("Input left node for " + data);
		
		root.left = createTree();
		
		System.out.println("enter right node for " + data);
		
		root.right = createTree();
		
		return root;
	}
	
	
	static void inorderTraversal(TreeNode root) {
		if(root==null) return;
		
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	static void preOrderTraversal(TreeNode root) {
		if(root==null) return;
		
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	static void postOrderTraversal(TreeNode root) {
		if(root==null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}
	
	static int heightOfTree(TreeNode root) {
		if(root==null) return 0;
		return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
	}
	
	static int numberOfNodes(TreeNode root) {
		if(root==null) return 0;
		return numberOfNodes(root.left) + numberOfNodes(root.right) + 1;
	}
	
	static int maxNodeData(TreeNode root) {
		if(root==null) return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(maxNodeData(root.left), maxNodeData(root.right)));
	}
}

class TreeNode{
	TreeNode left;
	TreeNode right;
	
	int data;
	
	public TreeNode(int data) {
		this.data = data;
	}
}
