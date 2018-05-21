package leetcode.solutions;

import java.util.Stack;

/**
 * @author Bourbon
 * @date 2018/5/21
 * @description 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 */
public class NextGreaterElementII {

	public int[] nextGreaterElements(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		Stack<Integer> stack = new Stack<Integer>();//存储数组索引

		int ptr = 0;
		while (ptr < length) {
			if (stack.empty()) {
				stack.push(ptr);
			} else {
				while (!stack.empty() && nums[stack.peek()] < nums[ptr]) {
					result[stack.pop()] = nums[ptr];
				}
				stack.push(ptr);
			}
			ptr++;
		}

		ptr = 0;
		while (ptr < length && !stack.empty()) {
			while (nums[stack.peek()] < nums[ptr]) {
				result[stack.pop()] = nums[ptr];
			}
			ptr++;
		}
		while (!stack.empty()) {
			result[stack.pop()] = -1;
		}
		return result;
	}
}
