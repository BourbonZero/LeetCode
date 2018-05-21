package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/26
 * @description 507. 完美数
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 *
 * 输入: 28
 * 输出: True
 * 解释: 28 = 1 + 2 + 4 + 7 + 14
 */
public class PerfectNumber {

	public boolean checkPerfectNumber(int num) {
		if (num == 1) return false;
		int sum = 1;
		int max = (int) Math.sqrt(num);
		int i = 2;
		while (i <= max) {
			if (num % i == 0) {
				sum += i;
				if (num / i != i) {
					sum += num / i;
				}
			}
			i++;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
}
