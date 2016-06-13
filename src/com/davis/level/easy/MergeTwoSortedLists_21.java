package com.davis.level.easy;

import com.davis.pojo.ListNode;

public class MergeTwoSortedLists_21 {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}

		ListNode newList = new ListNode(0);
		ListNode lastNode = newList;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				lastNode.next = l1;
				l1 = l1.next;
			} else {
				lastNode.next = l2;
				l2 = l2.next;
			}
			lastNode = lastNode.next;
		}

		// 如果l2的長度比l1多
		if (l1 != null) {
			lastNode.next = l1;
		} else {
			lastNode.next = l2;
		}

		return newList.next;
	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(5);
		l11.next = l12;
		ListNode l13 = new ListNode(6);
		l12.next = l13;

		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(2);
		l21.next = l22;
		ListNode l23 = new ListNode(7);
		l22.next = l23;

		ListNode appenNode = mergeTwoLists(l11, l21);
		while (appenNode != null) {
			System.out.println(appenNode.val);
			appenNode = appenNode.next;
		}
	}

}
