package com.atguigu.ssh.entity;

public class Employee {

	private Integer empId;
	private String name;

	private Department dept;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept+ "]";
	}

}
