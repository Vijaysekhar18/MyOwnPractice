package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMP {
	public int[] longestPrefixSuffix(String pattern) {
		int len = pattern.length();
		int[] lps = new int[len];
		
		int i = 1, j= 0;
		while(i < len) {
			if (pattern.charAt(i) == pattern.charAt(j)) {
				lps[i] = j+1;
				j++;
				i++;
			}
			else {//(pattern.charAt(i) != pattern.charAt(j)) 
				if (j == 0) i++;
				else j = lps[j-1];
			}
		}
		return lps;
	}
	
	public ArrayList<Integer> findMatches(String str, String pattern) {
		int S = str.length(), P = pattern.length();
		int[] lps = longestPrefixSuffix(pattern);
		int i = 0; //Main String Pointer
		int j = 0; //Pattern String Pointer
		
		ArrayList<Integer> matches = new ArrayList<>();
		while (i < S) {
			//Shift Pattern Pointer j - backwards
			while (j != 0 && str.charAt(i) != pattern.charAt(j)) {
				j = lps[j-1];
			}
			
			if (str.charAt(i) == pattern.charAt(j)) {
				//characters matched
				if (j == P-1) {
					matches.add(i-j);
					j = 0;
				}
				else j++;
			}
			i++;
		}
		return matches;
	}
	
	public void printList(List list) {
		StringBuilder str = new StringBuilder("[ ");
		for(Object temp: list) {
			str.append(temp + " ");
		}
		str.append(" ]");
		System.out.println(str);
	}

}