package com.csi.jdkfeatures;

import java.util.Optional;

public class OptionalClassConcept {
	public static void main(String[] args) {

		String companyName = "CSI";
		

		Optional<String> cName = Optional.ofNullable(companyName);
		
		if(cName.isPresent())
		{
			System.out.println("\n Company Name Length: "+ companyName.length());
		}
		else
		{
			System.out.println("Company Name is null");
		}
	}
}
