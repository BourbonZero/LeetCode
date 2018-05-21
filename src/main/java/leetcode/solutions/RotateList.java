package leetcode.solutions;

import leetcode.dataStructure.ListNode;

/**
 * @author Bourbon
 * @date 2018/4/26
 * @description 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * <p>
 * 示例 2:
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 */
public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) return null;

		ListNode fast = head;
		int count = 1;
		while (fast.next != null) {
			fast = fast.next;
			count++;
		}
		k %= count;

		fast = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		ListNode slow = head;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = head;
		fast = slow.next;
		slow.next = null;
		return fast;
	}
}
