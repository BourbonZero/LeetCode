package leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Bourbon
 * @date 2018/4/25
 * @description 22. 括号生成
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 例如，给出 n = 3，生成结果为：
 * ["((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"]
 */
public class GenerateParentheses {

	List<String> result = new LinkedList<String>();

	public List<String> generateParenthesis(int n) {
		int left = 0;
		int right = 0;
		String current = new String("");
		addChar(left, right, n, current);
		return result;
	}

	private void addChar(int left, int right, int n, String current) {

		if (left == n && right == n) {
			result.add(current);
		} else if (left == n) {
			addChar(left, right + 1, n, current + ")");
		} else if (left == right) {
			addChar(left + 1, right, n, current + "(");
		} else {
			addChar(left + 1, right, n, current + "(");
			addChar(left, right + 1, n, current + ")");
		}
	}
}
