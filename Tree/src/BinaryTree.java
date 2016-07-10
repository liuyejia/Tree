import java.util.*;

class BinaryTree
 {
 static TreeNode root;
 TreeNode create(int []arr)
 {
	 return sortedArrayToBST(arr,0,arr.length-1);
 }

/* A function that constructs Balanced Binary Search Tree 
 from a sorted array */
 TreeNode sortedArrayToBST(int[]arr, int start, int end) {

    /* Base Case */
    if (start > end) {
        return null;
    }

    
    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(arr[mid]);

   
    node.left = sortedArrayToBST(arr, start, mid - 1);

   
    node.right = sortedArrayToBST(arr, mid + 1, end);
     
    return node;
}

/* A utility function to print PreOrder traversal of BST */
   void preOrder(TreeNode node) {
    if (node == null) {
        return;
    }
    System.out.print(node.val + " ");
    preOrder(node.left);
    preOrder(node.right);
}
 
 public static void main(String[] args) {
    //worth noting.....static..
	BinaryTree tree = new BinaryTree();
    int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
    int n = arr.length;
    root = tree.create(arr);
    System.out.println("Preorder traversal of constructed BST");
    tree.preOrder(root);
    System.out.println();
    System.out.println("--------");
    System.out.println();
    System.out.println("level travelsal of BST");
    levelTraversal lt=new levelTraversal();
    ArrayList<LinkedList<TreeNode>> res=lt.levelTraversal(root);
    lt.printRes(res);
    
     }
 
}

