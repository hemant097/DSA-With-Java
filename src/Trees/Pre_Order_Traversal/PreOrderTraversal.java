package Trees.Pre_Order_Traversal;

import java.util.ArrayList;
import java.util.List;

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
public class PreOrderTraversal {
	
	static List<Integer> arr =new ArrayList<>();
	
	  public static List<Integer> preorder(TreeNode root){
	    if(root==null)
	    return null ;
	    
	    
	    arr.add(root.data);
	    preorder(root.left);
	    preorder(root.right);
	    
	    return arr;
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
        
        preorder(tree.root);
        
        System.out.println("Pre Order Traversal is");
        System.out.println(arr);
	}
}
