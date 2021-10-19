
public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyBinaryTree theTree = new MyBinaryTree();
		
		StudentInfo someStudent;
		

		someStudent = new StudentInfo(15, "Tweety", "Bird", 33, 44);
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(2, "Sylvester", "Cat", 33, 44);
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(10, "Bugs", "Bunny", 33, 44);
		theTree.addToTree(theTree.root, someStudent);

		

		// Do the traversals!
		
		System.out.println("\n\nINORDER TRAVERSAL");
		theTree.inorder(theTree.root);
		
		System.out.println("\n\nPREORDER TRAVERSAL");
		theTree.preorder(theTree.root);
		
		System.out.println("\n\nPOSTORDER TRAVERSAL");
		theTree.postorder(theTree.root);
		

	}

}
