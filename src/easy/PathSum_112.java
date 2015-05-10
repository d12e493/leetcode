package easy;

public class PathSum_112 {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static boolean hasPathSum(TreeNode root, int sum) {

		return sumNode(sum, root, 0);
	}

	public static boolean sumNode(int targetSum, TreeNode node, int tempSum) {

		if(node==null){
			return false;
		}
		
		tempSum += node.val;

		if (node.left == null && node.right == null) {
			if (tempSum == targetSum) {
				return true;
			} else {
				return false;
			}
		} else {
			return sumNode(targetSum, node.left, tempSum)
					|| sumNode(targetSum, node.right, tempSum);
		}
	}

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(5);
//		TreeNode left = new TreeNode(4);
//		TreeNode right = new TreeNode(8);
//		root.left = left;
//		root.right = right;
//
//		TreeNode left11 = new TreeNode(11);
//		left.left = left11;
//
//		TreeNode left13 = new TreeNode(13);
//		TreeNode right4 = new TreeNode(4);
//		right.left = left13;
//		right.right = right4;
//
//		System.out.println(hasPathSum(root, 17));
		
		TreeNode root=new TreeNode(1);
		TreeNode left=new TreeNode(2);
		root.left=left;
		
		System.out.println(hasPathSum(root, 0));

	}

}
