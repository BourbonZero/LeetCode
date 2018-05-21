package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/24
 * @description 223. 矩形面积
 * 在二维平面上计算出两个由直线构成的矩形叠加覆盖后的总面积。
 * 每个矩形由其左下顶点和右上顶点坐标表示，(A,B)(C,D)和(E,F)(G,H)。
 */
public class RectangleCommonArea {
	public static final int[] input = {-3, 0, 3, 4, 0, -1, 9, 2};

	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int common = calCommon(A, C, E, G) * calCommon(B, D, F, H);
		return (C-A)*(D-B)+(G-E)*(H-F)-common;
	}

	//计算(a,b)和(c,d)的公共长度
	private int calCommon(int a, int b, int c, int d) {
		if (a <= c && b > c) {
			return (b < d) ? b - c : d - c;
		} else if (a > c && d > a) {
			return (b < d) ? b - a : d - a;
		}
		return 0;
	}
}
