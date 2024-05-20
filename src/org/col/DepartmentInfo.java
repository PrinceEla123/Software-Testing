package org.col;

public class DepartmentInfo {
	private void ug(int age,String Name,Float salary) {
		System.out.println("Ur age :" + age );
		System.out.println("Ur Name :" + Name);
		System.out.println("Ur salary :" + salary);
	}
	private void ug(String dept) {
		System.out.println("Ur dept :" + dept);
	}
private void ug(int Year) {
	System.out.println("Ur year :" + Year);
	

}
	
	
	public static void main(String[] args) {
		DepartmentInfo d=new DepartmentInfo();
		d.ug(22, "Elai", 20000f);
		d.ug("Cse");
		d.ug(4);
		
	
	}

}
