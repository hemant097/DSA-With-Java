package Trees.Level_Order_Traversal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

/* Level Order Traversal means traversing the tree on each level from left to right
 * 							1
 * 						  /   \
 *  					2		3
 *  				   /\		/\
 *  				  /  \	   /  \				
 *                  4   5   6   7 
 
 			So the level order traversal would be 1 2 3 4 5 6 7
 			
 			But here we are displaying each level in a separate ArrayList
 */
public class LevelOrderTraversal {
	
public static void  LOTR(TreeNode root) {
	 
		//we can also use List here, works fine, just keep in mind
	//that list has no poll() so use remove(0)
	
			Deque<TreeNode> queue = new ArrayDeque<>();
	        queue.add(root);
	        
	        while (!queue.isEmpty()) {
	            int qlen = queue.size();
	            
	            List<Integer> levelElements = new ArrayList<>();
	            for (int i = 0; i < qlen; i++) {
	            
	            TreeNode tempNode = queue.poll();
	            levelElements.add(tempNode.data);
	 
	            //Enqueue left child 
	            if (tempNode.left != null) 
	                queue.add(tempNode.left);
	            
	 
	            //Enqueue right child
	            if (tempNode.right != null) 
	                queue.add(tempNode.right);
	            
	            }
	          
	            System.out.println(levelElements);
		}
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
        
        LOTR(tree.root);
       
	}
}

