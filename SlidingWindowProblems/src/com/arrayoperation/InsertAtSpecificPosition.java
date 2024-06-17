package com.arrayoperation;

import java.util.Arrays;

public class InsertAtSpecificPosition {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(Arrays.toString(insertAtPosition(arr, 3, 5, 2, 8)));;
	}

	public static int[] insertAtPosition(int[] arr, int size, int capacity, int pos, int element) {

		if (size == capacity) {
			return arr;
		}

		int idx = pos - 1;
		for (int i = size - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}
		arr[idx] = element;
		return arr;

	}
}
