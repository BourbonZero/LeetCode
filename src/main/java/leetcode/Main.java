package leetcode;

import leetcode.dataStructure.ListNode;
import leetcode.solutions.NextGreaterElementII;
import leetcode.solutions.RotateFunction;
import leetcode.solutions.RotateList;

import java.util.Stack;

/**
 * @author Bourbon
 * @date 2018/4/24
 * @description
 */
public class Main {

	public static void main(String[] args) {
		NextGreaterElementII test = new NextGreaterElementII();
		System.out.println(test.nextGreaterElements(new int[]{1,2,1}));

//		Stack<Integer> stack = new Stack<Integer>();
//		int[] nums = new int[]{1,2,1};
//		int ptr = 0;
//		while (ptr < nums.length) {
//			if (stack.empty()) {
//				stack.push(ptr);
//			} else {
//				System.out.println(stack.empty());
//				System.out.println(stack.peek());
//				stack.push(ptr);
//			}
//			ptr++;
//		}

	}
}
