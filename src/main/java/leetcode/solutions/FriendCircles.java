package leetcode.solutions;

import java.util.Arrays;

/**
 * @author Bourbon
 * @date 2018/4/25
 * @description 547. 朋友圈
 * 班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。
 * 如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
 * 给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。
 * 你必须输出所有学生中的已知的朋友圈总数。
 *
 * N 在[1,200]的范围内。
 * 对于所有学生，有M[i][i] = 1。
 * 如果有M[i][j] = 1，则有M[j][i] = 1。
 */
public class FriendCircles {

	private int n;
	private boolean[] isFound;

	public int findCircleNum(int[][] M) {
		n = M.length;

		//记录是否为圈外人
		isFound = new boolean[n];
		Arrays.fill(isFound, false);

		int current = 0;
		int count = 0;
		while (current < n) {
			//还没有进入任何一个朋友圈
			if (isFound[current] == false) {
				findFriends(M, current);
				count++;
			}
			current++;
		}
		return count;
	}

	private void findFriends(int[][] M, int current) {
		for (int i = 0; i < n; i++) {
			//是朋友
			if (M[current][i] == 1) {
				//朋友还没进入朋友圈
				if (isFound[i] == false) {
					//拉进朋友圈
					isFound[i] = true;
					//再找朋友的朋友
					findFriends(M, i);
				}
			}
		}
	}
}
