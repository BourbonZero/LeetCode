package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/25
 * @description 434. 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的非空字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 */
public class NumberOfSegments {

	public int countSegments(String s) {
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isWhitespace(c)) {
				if (flag == false) {
					flag = true;
				}
			} else {
				if (flag == true) {
					flag = false;
					count++;
				}
			}
		}
		if (flag == true) count++;
		return count;
	}
}
