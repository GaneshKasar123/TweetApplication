package com.csi.jdkfeatures;

import java.util.StringJoiner;

public class StringJoinerConcept {
	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("&");
		sj.add("INFOSYS");
		sj.add("TCS");
		sj.add("WIPRO");
		System.out.println(sj);
	}
}
