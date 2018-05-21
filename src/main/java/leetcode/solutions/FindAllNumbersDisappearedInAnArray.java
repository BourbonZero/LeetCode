package leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Bourbon
 * @date 2018/4/26
 * @description 448. 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 输入:[4,3,2,7,8,2,3,1]
 * 输出:[5,6]
 */
public class FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			list.add(i);
		}
		for (int i = 0; i < nums.length; i++) {
			list.remove(new Integer(nums[i]));
		}
		return list;
	}
}
