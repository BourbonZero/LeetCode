package leetcode.solutions;

import java.util.*;

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
public class NextGreaterElementIII {

	public int nextGreaterElement(int n) {
		int num = n;
		List<Integer> list = new ArrayList<Integer>();
		list.add(num % 10);//填入个位
		int weight = 10;
		int quotient = num / weight;
		int digit = quotient % 10;
		while (quotient > 0) {
			if (digit < list.get(list.size() - 1)) {
				long result = 0;
				int ptr = -1;
				for (int i = 0; i < list.size(); i++) {
					result *= 10;
					if (ptr == -1 && list.get(i) > digit) {
						result += digit;
						ptr = i;
					} else {
						result += list.get(i);
					}
				}
				result += (quotient + list.get(ptr) - digit) * weight;
				if (result > Integer.MAX_VALUE){
					return -1;
				}
				return (int) result;
			} else {
				list.add(digit);
				weight *= 10;
				quotient = num / weight;
				digit = quotient % 10;
			}
		}
		return -1;
	}
}
