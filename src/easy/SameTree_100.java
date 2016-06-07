package easy;

public class SameTree_100 {

	/**
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == q) {
			return true;
		} else if (p != null && q == null) {
			return false;
		} else if (q != null && p == null) {
			return false;
		}

		if (p.left == null && q.left == null && p.right == null && q.right == null) {
			return p.val == q.val;
		}

		// 先比較左邊是否相等
		boolean leftSame = isSameTree(p.left, q.left);

		// 左邊相等才需要比較右邊
		if (leftSame) {
			boolean rightSame = isSameTree(p.right, q.right);
			if (rightSame) {
				return p.val == q.val;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		TreeNode sourceTree = new TreeNode(1);
		TreeNode leftNode = new TreeNode(2);
		TreeNode rightNode = new TreeNode(3);
		sourceTree.left = leftNode;
		sourceTree.right = rightNode;

		TreeNode targetTree = new TreeNode(1);
		TreeNode leftNode1 = new TreeNode(2);
		TreeNode rightNode1 = new TreeNode(3);
		targetTree.left = leftNode1;
		targetTree.right = rightNode1;

		System.out.println(isSameTree(sourceTree, targetTree));
	}

}
