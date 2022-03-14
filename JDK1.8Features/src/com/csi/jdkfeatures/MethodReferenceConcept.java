package com.csi.jdkfeatures;

interface DataDetails {
	void get();
}

public class MethodReferenceConcept {

	public static void set() {
		System.out.println("HELLO");
	}

	public static void main(String[] args) {

		DataDetails dd = MethodReferenceConcept::set;
		dd.get();
	}
}
