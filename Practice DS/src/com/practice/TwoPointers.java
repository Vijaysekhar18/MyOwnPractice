package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoPointers {
	
	public static void main(String[] args) {
		TwoPointers TP = new TwoPointers();
		Integer[] arr = {3, -2, 4, 5, 8};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		TP.getSumPairs(al, 4);
		System.out.println("-----------------------------");
		TP.getNearestSumPairs(al, 4);
	}

	public void getSumPairs(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		System.out.println("Sorted Input: " + Arrays.toString(A.toArray()));
		int i = 0, j = A.size()-1;
		int finalDiff = Integer.MAX_VALUE, final_sum = -1;;
		while(i < j) {
			long sum = A.get(i) + A.get(j);
			if (sum > B) j--;
			else if (sum <= B) i++;
			
			if(Math.abs(B-sum) < finalDiff) {
				finalDiff = (int)Math.abs(B-sum);
				final_sum = (int) sum;
			}
		}
		System.out.println("Sum: (" + final_sum + ", " + finalDiff + ")");
	}

	public void getNearestSumPairs(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		System.out.println("Sorted Input: " + Arrays.toString(A.toArray()));
		int i = 0, j = A.size()-1;
		while(i < j) {
			long sum = A.get(i) + A.get(j);
			if (sum > B) j--;
			else if (sum < B) i++;
			else {
				System.out.println("Pair Found: (" + A.get(i) + ", " + A.get(j) + ")");
				i++;
			}
		}
		System.out.println("Pair Not Found: (" + A.get(i) + ", " + A.get(j) + ")");
	}
}
