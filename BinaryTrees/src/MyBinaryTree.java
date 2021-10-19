
public class MyBinaryTree {
	// Attributes
	public int numInTree;
	public StudentInfo root;
	
	// Constructor
	public MyBinaryTree() {
		numInTree = 0;
		root = null;
	}
	
	// Add to Tree
	public void addToTree(StudentInfo currentNode, StudentInfo studentToAdd) {
		if (root == null) {
			// tree is complete empty so this one is the root
			root = studentToAdd;
			numInTree = 1;
			return;
		}
		// the tree is not empty
		if (studentToAdd.studentNumber < currentNode.studentNumber) {
			if (currentNode.leftNode == null) { // left side
				currentNode.leftNode = studentToAdd;
				numInTree++;
				return;
			}
			// otherwise the left side is not null and we need to call recursion
			addToTree(currentNode.leftNode, studentToAdd);
		}
		// studentToAdd.studentNumber is >= currentNode.studentNumber
		else {
			if (currentNode.rightNode == null) { // right side 
				currentNode.rightNode = studentToAdd;
				numInTree++;
				return;
			}
			// otherwise call recursion to go down one more layer
			addToTree(currentNode.rightNode, studentToAdd);
		}
	}
	
//	Preorder traversal
//	1. Process the current node
//		a. Print out student number
//	2. Do a preorder traversal of the left subtree of current node
//	3. Do a preorder traversal of the right subtree of the current node

	public void preorder(StudentInfo currentNode) {
		// Base case
		if (currentNode == null) {
			return;
		}
		// currentNode must have stuff
		// Process stuff
		System.out.println("sN: " + currentNode.studentNumber);
		System.out.println("fN: " + currentNode.firstName);
		
		// Traversals
		preorder(currentNode.leftNode);
		preorder(currentNode.rightNode);
		
	}
	
//	Inorder traversal
//	1. Inorder traversal of LST of current node
//	2. Process current node
//	3. Inorder traversal of RST of current node
//	- Will end up listing the nodes inorder
//		Ascending order by key value

	public void inorder(StudentInfo currentNode) {
		if (currentNode == null) { // Base Case
			return;
		}
		// else currentNode must have stuff
		
		// Left traversal
		preorder(currentNode.leftNode);
		
		// Process stuff
		System.out.println("sN: " + currentNode.studentNumber);
		System.out.println("fN: " + currentNode.firstName);
		
		// Right traversal
		preorder(currentNode.rightNode);
		
	}
	
	

//	Postorder traversal
//		1. Postorder of LST of current node
//		2. Postorder of RST (right side tree) of current node
//		3. Process current node
//		- End with root of tree
//	Go down all the way first then print
	
	public void postorder(StudentInfo currentNode) {
		if (currentNode == null) { // Base Case
			return;
		}
		// else currentNode must have stuff
		
		// Traversals
		preorder(currentNode.leftNode);
		preorder(currentNode.rightNode);
		
		// Process stuff
		System.out.println("sN: " + currentNode.studentNumber);
		System.out.println("fN: " + currentNode.firstName);
		
		
		
	}
	
	
}
