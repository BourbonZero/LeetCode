package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/5/21
 * @description 504. 七进制数
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * 注意: 输入范围是 [-1e7, 1e7] 。
 * 输入: 100
 * 输出: "202"
 * <p>
 * 输入: -7
 * 输出: "-10"
 */
public class Base7 {

	public String convertToBase7(int num) {
		//10的7次方 < 7的10次方
		int a = Math.abs(num);
		int[] nums = new int[10];
		int ptr = -1;
		while (a != 0) {
			ptr++;
			nums[ptr] = a % 7;
			a = a / 7;
		}

		String result = new String();
		if (num < 0) {
			result += "-";
		}else if (num == 0){
			result += "0";
		}
		for (; ptr >= 0; ptr--) {
			result += nums[ptr];
		}
		return result;
	}
}
