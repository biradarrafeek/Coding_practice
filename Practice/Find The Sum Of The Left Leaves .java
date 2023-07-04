// Find The Sum Of The Left Leaves


import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Tree node structure:

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

public class Solution {
    public static int sumOfLeftLeaves(TreeNode<Integer> root) {
        // Write your code here.
		if(root == null)
			return 0;

		int sum=0;

		if(root.left!=null && root.left.left==null && root.left.right==null)
			sum+=root.left.data;

			sum+=sumOfLeftLeaves(root.left);
			sum+=sumOfLeftLeaves(root.right);

			return sum;
    }
}
