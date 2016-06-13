package com.davis.level.easy;

public class ReverseLinkedList_206 {

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode reverseList(ListNode head) {

		ListNode reverseNode = null;

		while (head != null) {
			// 先將下一節點暫存
			ListNode nextList = head.next;
			// 把下一節點改成之前reverse好的list
			head.next = reverseNode;
			// 把這次調整好的放回reverseNode
			reverseNode = head;
			// 指向下一個節點
			head = nextList;
		}

		return reverseNode;
	}

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		first.next = second;
		second.next = third;

		ListNode reverList = reverseList(first);
		System.out.println(reverList.val);
		System.out.println(reverList.next.val);
		System.out.println(reverList.next.next.val);
	}

}
