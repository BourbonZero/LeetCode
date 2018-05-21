package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/25
 * @description 240. 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵中的一个目标值。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列
 * 每列的元素从上到下升序排列
 * <p>
 * 考虑下面的矩阵：
 * [[1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]]
 * 给定目标值 target = 5, 返回 true。
 * 给定目标值 target = 20, 返回 false。
 */
public class Search2DMatrixII {

	public boolean searchMatrix(int[][] matrix, int target) {
		int xMax = matrix.length;
		if (xMax == 0){
			return false;
		}
		int yMax = matrix[0].length;
		if (yMax == 0) {
			return false;
		}

		//从右上角开始遍历
		//偏下向下，偏大向左，直到匹配或出界
		//左下角同理
		int x = 0;
		int y = yMax - 1;
		boolean flag = false;
		while (x < xMax && y >= 0) {
			if (matrix[x][y] == target) {
				flag = true;
				break;
			} else if (matrix[x][y] > target) {
				y--;
			} else {
				x++;
			}
		}
		return flag;
	}
}
