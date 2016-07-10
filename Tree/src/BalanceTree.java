/*
import java.util.*;

public class BalanceTree {

	public static boolean isBalanced(TreeNode root)
	{
		if(root==null)
			return true;
		if(height(root)==-1)
			return false;
		return true;
	}
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		int left=height(root.left);
		int right=height(root.right);
		if(left==-1||right==-1)
			return -1;
		if(Math.abs(left-right)>1)
			return -1;
		return 1+Math.max(height(root.left),height(root.right));
	}
	/*
	public static void main(String[] args)
	{
		TreeNode x1=new TreeNode(1);
		x1.left=new TreeNode(2);
		
		x1.left.right=new TreeNode(4);
		System.out.println(isBalanced(x1));
	}
	
	
}
*/
