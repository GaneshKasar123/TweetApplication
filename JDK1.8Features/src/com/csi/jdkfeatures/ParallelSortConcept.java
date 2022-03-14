package com.csi.jdkfeatures;

import java.util.Arrays;

public class ParallelSortConcept {
	public static void main(String[] args) {

		int arr[]={6, 4, 8, 9, 2};
		
		System.out.println("\n Before Sort: ");
		for(int i: arr)
		{
			System.out.println(i);
		}
		
		System.out.println("\n After Sort: ");
		Arrays.parallelSort(arr);
		for(int i: arr)
		{
			System.out.println(i);
		}
		
	}
}
