package com.atguigu.ssh.service;

import java.util.List;

import com.atguigu.ssh.entity.Department;
import com.atguigu.ssh.entity.Employee;

public interface EmployeeService {
	
	List<Employee> queryEmpList() throws Exception;	
	
	List<Department> queryDeptList() throws Exception ;
	
	void saveEmp(Employee emp)throws Exception ;
	
	Employee getEmpById(Integer empId) throws Exception ;
	
	void updateEmp(Employee emp) throws Exception ;
	
	void deleteEmp(Integer empId) throws Exception ;

	void deleteEmp(Employee employee) throws Exception;
}
