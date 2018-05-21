package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/24
 * @description 668. 乘法表中第k小的数
 * 几乎每一个人都用 乘法表。但是你能在乘法表中快速找到第k小的数字吗？
 * 给定高度m 、宽度n 的一张 m * n的乘法表，以及正整数k，你需要返回表中第k 小的数字。
 */
public class KthSmallestNumberInMultiplicationTable {

	//二分查找
	public int solve(int m, int n, int k) {
		int min = 1 * 1;
		int max = m * n;

		while (min < max) {
			int mid = (min + max) / 2;
			int count = count(m, n, mid);
			if (count < k) {
				min = mid + 1;
			} else {
				int temp = count(m, n, mid - 1);
				if (temp < k) {
					min = mid;
					max = mid;
				} else {
					max = mid - 1;
				}
			}
		}
		return max;
	}

	//计算<=value的数的个数
	private int count(int m, int n, int value) {
		int i = m;
		int j = 1;
		int result = 0;
		while (i >= 1 && j <= n) {
			if (i * j <= value) {
				result += i;
				j++;
			} else {
				i--;
			}
		}
		return result;
	}
}
