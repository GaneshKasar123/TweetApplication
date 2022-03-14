package com.csi.jdkfeatures;

interface Data {
	void get();
}

public class LambdaExpressionConcept {
	public static void main(String[] args) {

		Data dd = () -> {
			System.out.println("HEY");
		};
		dd.get();
	}
}
