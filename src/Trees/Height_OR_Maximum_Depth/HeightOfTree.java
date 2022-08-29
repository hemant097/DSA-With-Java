package Trees.Height_OR_Maximum_Depth;


/*Height or maximum depth of a tree is the number of nodes on the longest path
to the leaf node
*/
class TreeNode{
	  int data;
	  TreeNode left;
	  TreeNode right;

	  TreeNode(int data){
	    this.data = data;
	    this.left = this.right = null;
	  }
	}
class Tree{
	TreeNode root;
	
	public Tree() {
		root=null;
	}
}
public class HeightOfTree {
	
	public static int height(TreeNode root){
	    if(root==null)
	    return 0;
	    return 1 + Math.max(height(root.left),height(root.right) );
	  }
	public static void main(String[] args) {
		Tree tree = new Tree();
      tree.root = new TreeNode(1);
      tree.root.left = new TreeNode(2);
      tree.root.right = new TreeNode(3);
      tree.root.left.left = new TreeNode(7);
      tree.root.left.right = new TreeNode(8);
      tree.root.right.left = new TreeNode(81);
      tree.root.right.right= new TreeNode(75);
      tree.root.right.right.right= new TreeNode(124);
      int h=height(tree.root);
      
      System.out.println("Height of the tree is "+h);
  
	}}

