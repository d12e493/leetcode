package com.davis.level.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MinStack_155 {

	private Integer minNumber;
	private List<Integer> arrays;

	/** initialize your data structure here. */
	public MinStack_155() {
		this.arrays = new ArrayList<Integer>();
	}

	public void push(int x) {
		if (minNumber == null || x < minNumber) {
			minNumber = x;
		}
		arrays.add(x);
	}

	public void pop() {
		int popNumber = arrays.remove(arrays.size() - 1);
		if (popNumber == minNumber) {
			if (arrays.size() > 0) {
				Set<Integer> sortSet = new TreeSet<Integer>(arrays);
				minNumber = sortSet.iterator().next();
			} else {
				minNumber = null;
			}
		}
	}

	public int top() {
		return arrays.get(arrays.size() - 1);
	}

	public int getMin() {
		return minNumber;
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack
	 * obj = new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

	public static void main(String[] args) {
		MinStack_155 minStack = new MinStack_155();
		minStack.push(2147483646);
		minStack.push(2147483646);
		minStack.push(2147483647);
		minStack.top();
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.push(2147483647);
		minStack.top();
		minStack.getMin();
		minStack.push(-2147483648);
		minStack.top();
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
	}

}
