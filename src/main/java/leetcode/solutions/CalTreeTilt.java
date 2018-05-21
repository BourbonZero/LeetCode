package leetcode.solutions;

import leetcode.dataStructure.TreeNode;

/**
 * @author Bourbon
 * @date 2018/4/24
 * @description 563.二叉树的坡度
 * 给定一个二叉树，计算整个树的坡度。
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 * 整个树的坡度就是其所有节点的坡度之和。
 */
public class CalTreeTilt {

	public static final TreeNode root = new TreeNode(1);
	static {
		root.left = new TreeNode(10);
		root.right = new TreeNode(100);
	}

	private int tilt = 0;

	public int findTilt(TreeNode root) {
		if (root!=null){
			calSum(root);
			return tilt;
		}
		return 0;
	}

	/**
	 *
	 * @param node
	 * @return 计算子树和
	 */
	private int calSum(TreeNode node){
		if (node != null){
			int left = calSum(node.left);
			int right = calSum(node.right);
			tilt += Math.abs(left - right);
			return left + right + node.val;
		}
		return 0;
	}
}
