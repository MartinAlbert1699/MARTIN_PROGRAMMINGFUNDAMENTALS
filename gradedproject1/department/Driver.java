package com.gradedproject1.department;

public class Driver {
	public static void main(String[] args) {
		SuperDepartment spr = new SuperDepartment();
		System.out.println("Welcome to " + spr.DepartmentName());
		System.out.println(spr.getTodaysWork());
		System.out.println(spr.GetWorkDeadline());
		System.out.println(spr.isTodayAholiday());
		System.out.println();
		AdminDepartment adm = new AdminDepartment();
		System.out.println("Welcome to " + adm.DepartmentName());
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.GetWorkDeadline());
		System.out.println(spr.isTodayAholiday());
		System.out.println();
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.DepartmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.GetWorkDeadline()); 
	}
}
