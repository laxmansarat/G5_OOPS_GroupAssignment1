package com.greatlearning.g5;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment admDpt = new AdminDepartment();
		
		System.out.println("Welcome to " + admDpt.departmentName());
		System.out.println(admDpt.getTodaysWork());
		System.out.println(admDpt.getWorkDeadline());
		System.out.println(admDpt.isTodayAHoliday());
		System.out.println();
	
		HrDepartment hrDpt = new HrDepartment();

		System.out.println("Welcome to " + hrDpt.departmentName());
		System.out.println(hrDpt.doActivity());
		System.out.println(hrDpt.getTodaysWork());
		System.out.println(hrDpt.getWorkDeadline());
		System.out.println(hrDpt.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techDpt = new TechDepartment();
		
		System.out.println("Welcome to " + techDpt.departmentName());
		System.out.println(techDpt.getTodaysWork());
		System.out.println(techDpt.getWorkDeadline());
		System.out.println(techDpt.getTechStackInformation());
		System.out.println(techDpt.isTodayAHoliday());
		System.out.println();
		
		
	
	
	}
	
	

	
}
