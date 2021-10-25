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
			if (currentNode.left == null) { // left side
				currentNode.left = studentToAdd;
				numInTree++;
				return;
			}
			// otherwise the left side is not null and we need to call recursion
			addToTree(currentNode.left, studentToAdd);
		}
		// studentToAdd.studentNumber is >= currentNode.studentNumber
		if (studentToAdd.studentNumber >= currentNode.studentNumber) {
			if (currentNode.right == null) { // right side 
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
		// currentNode must have stuff
		// Process stuff
		System.out.println(currentNode.studentNumber);
		
		// Traversals
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
		
		// Left traversal
		inorder(currentNode.left);
		
		// Process stuff
		System.out.println(currentNode.studentNumber);
		
		// Right traversal
		inorder(currentNode.right);
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
		
		// Process stuff
		System.out.println(currentNode.studentNumber);
		
	}
	
	
}
