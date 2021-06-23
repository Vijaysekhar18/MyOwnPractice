package com.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.practice.KMP;

public class Main {

	
	public static void main(String[] args) {
		KMP kmp = new KMP();
		ArrayList<Integer> matches = kmp.findMatches("abeababeabce", "ab");
		System.out.println(Arrays.toString(matches.toArray()));
		
		System.out.println(Arrays.toString(kmp.longestPrefixSuffix("AACECAAAA")));
	}
}