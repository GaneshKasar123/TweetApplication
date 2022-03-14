package com.csi.jdkfeatures;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private String empAddress;

	private double empSalary;

	public Employee(int empId, String empName, String empAddress, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}

}

public class ForEachConcept {
	public static void main(String[] args) {

		List<Employee> empList = new LinkedList<Employee>();

		empList.add(new Employee(121, "SWARA", "PUNE", 56000.00));
		empList.add(new Employee(122, "MANI", "USA", 3456.00));
		empList.add(new Employee(111, "LAKSHMI", "JAPAN", 43555.00));
		empList.add(new Employee(112, "BINU", "CANADA", 65000.00));
		empList.add(new Employee(151, "VENKAT", "NOIDA", 50000.00));
		
		/*for(Employee e: empList)
		{
			if(e.getEmpSalary()>50000.00)
			{
				System.out.println(e);
			}
		}*/
		
		//empList.forEach(emp->System.out.println(emp));
		
		//empList.forEach(System.out::println);
		
		empList.stream().filter(employee-> employee.getEmpSalary()>50000.00).forEach(System.out::println);
	}
}
