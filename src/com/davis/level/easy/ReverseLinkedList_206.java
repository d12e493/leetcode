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
			// ??ˆå?‡ä?‹ä?ç¯?é»æš«å­?
			ListNode nextList = head.next;
			// ??Šä?‹ä?ç¯?é»æ”¹??ä?‹å?reverseå¥½ç?„list
			head.next = reverseNode;
			// ??Šé?™æ¬¡èª¿æ•´å¥½ç?„æ”¾??reverseNode
			reverseNode = head;
			// ??‡å?‘ä?‹ä??‹ç?é»?
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
