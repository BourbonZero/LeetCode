package leetcode.solutions;

import java.util.Stack;

/**
 * @author Bourbon
 * @date 2018/5/21
 * @description 556. 下一个更大元素 III
 * 给定一个32位正整数 n，你需要找到最小的32位整数，其与 n 中存在的位数完全相同，并且其值大于n。
 * 如果不存在这样的32位整数，则返回-1。
 * <p>
 * 输入: 12
 * 输出: 21
 * <p>
 * 输入: 21
 * 输出: -1
 */
public class NextGreaterElementIII_TODO {

	public int nextGreaterElement(int n) {
		int num = n;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(num % 10);
		num = num / 10;
		while (num > 0) {
			if (num % 10 >= stack.peek()) {
				stack.push(num % 10);
			} else {
				int result = num;

			}
			num = num / 10;
		}
		return -1;
	}
}
