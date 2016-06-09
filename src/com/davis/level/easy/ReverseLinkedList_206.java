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
			// ??��?��?��?�?點暫�?
			ListNode nextList = head.next;
			// ??��?��?�?點改??��?��?�reverse好�?�list
			head.next = reverseNode;
			// ??��?�次調整好�?�放??�reverseNode
			reverseNode = head;
			// ??��?��?��??��?�?
			head = nextList;
		}

		return reverseNode;
	}

	public static void main(String[] args) {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		first.next=second;
		second.next=third;
		
		ListNode reverList=reverseList(first);
		System.out.println(reverList.val);
		System.out.println(reverList.next.val);
		System.out.println(reverList.next.next.val);
	}

}
