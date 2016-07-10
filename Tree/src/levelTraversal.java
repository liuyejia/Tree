import java.util.*;

public class levelTraversal {

public ArrayList<LinkedList<TreeNode>> levelTraversal(TreeNode root)
  {
	int level=0;
	ArrayList<LinkedList<TreeNode>> res=new ArrayList<LinkedList<TreeNode>>();
	LinkedList<TreeNode> list=new LinkedList<TreeNode>();
	list.add(root);
	res.add(level,list);
	while(true)
	{
		list=new LinkedList<TreeNode>();
		for(int i=0;i<res.get(level).size();i++)
		{
			TreeNode n=(TreeNode)res.get(level).get(i);
			if(n!=null)
			{
			if(n.left!=null)
				list.add(n.left);
			if(n.right!=null)
				list.add(n.right);
			}
		}
		   if(list.size()>0)
			res.add(level+1, list);
		   else
			   break;
		   level++;
			
		}
	return res;
	}
public void printRes(ArrayList<LinkedList<TreeNode>> res)
{
	int depth=0;
	for(LinkedList<TreeNode> list:res)
	{
		Iterator<TreeNode> it=list.iterator();
		System.out.println("TreeNodes at depth "+depth+":");
		while(it.hasNext())
		{
			System.out.print(" "+((TreeNode)it.next()).val);
			
		}
		System.out.println();
		depth++;
	}
  }
}

