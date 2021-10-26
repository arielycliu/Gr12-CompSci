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
			// tree is complete empty so this student is the root
			root = studentToAdd;
			numInTree = 1;
			return;
		}
		// the tree is not empty
		if (studentToAdd.studentNumber < currentNode.studentNumber) {
			if (currentNode.left == null) { // left side empty
				currentNode.left = studentToAdd;
				numInTree++;
				return;
			}
			// otherwise the left side is not null and we need to call recursion
			addToTree(currentNode.left, studentToAdd);
		}
		// If our student number is >= currentNode.studentNumber
		if (studentToAdd.studentNumber >= currentNode.studentNumber) {
			if (currentNode.right == null) { // right side empty
				currentNode.right = studentToAdd;
				numInTree++;
				return;
			}
			// otherwise call recursion to go down one more layer
			addToTree(currentNode.right, studentToAdd);
		}
	}
	
	//	Preorder traversal
	//	1. Process the current node -> Print out student number
	//	2. Do a preorder traversal of the left subtree of current node
	//	3. Do a preorder traversal of the right subtree of the current node

	public void preorder(StudentInfo currentNode) {
		// Base case
		if (currentNode == null) {
			return;
		}
		// else currentNode must have stuff
		System.out.println(currentNode.studentNumber); // process the node
		
		// Call recursive traversals
		preorder(currentNode.left);
		preorder(currentNode.right);
		
	}
	
	//	Inorder traversal
	//	1. Inorder traversal of LST of current node
	//	2. Process current node
	//	3. Inorder traversal of RST of current node
	//	Will end up listing the nodes in ascending order by key value

	public void inorder(StudentInfo currentNode) {
		if (currentNode == null) { // Base Case
			return;
		}
		// else currentNode must have stuff
		inorder(currentNode.left); // Left traversal
		
		System.out.println(currentNode.studentNumber); // Process node
		
		inorder(currentNode.right); // Right traversal
	}

	//	Postorder traversal
	//	1. Postorder of LST of current node
	//	2. Postorder of RST (right side tree) of current node
	//	3. Process current node
	//	Go down all the way first then print heading back out
	
	public void postorder(StudentInfo currentNode) {
		if (currentNode == null) { // Base Case
			return;
		}
		// else currentNode must have stuff
		
		// Traversals
		postorder(currentNode.left);
		postorder(currentNode.right);
		
		System.out.println(currentNode.studentNumber); // Process stuff
		
	}
	
	
}
