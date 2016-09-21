package com.atguigu.ssh.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.ssh.entity.Department;
import com.atguigu.ssh.entity.Employee;
import com.atguigu.ssh.service.EmployeeService;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

@Controller("employeeAction")
@Scope("prototype")
public class EmployeeAction implements RequestAware,ModelDriven<Employee>,Preparable{
	@Autowired
	private EmployeeService employeeService;
	
	private Employee employee;
	private Integer empId;

	private Map<String, Object> request;
	
	public String queryList() throws Exception{
		List<Employee> empList = employeeService.queryEmpList();
		request.put("empList", empList);
		return "queryListSuccess";
	}
	
	public String toAdd() throws Exception{
		List<Department> deptList = employeeService.queryDeptList();
		request.put("deptList", deptList);
		return "toAddSuccess";
	}
	
	public void prepareAdd(){
		employee = new Employee();
	}
	public String add() throws Exception{
		employeeService.saveEmp(employee);
		return "addSuccess";
	}
	
	public void prepareEdit() throws Exception{
		employee = employeeService.getEmpById(empId);
	}
	public String edit() throws Exception{
		List<Department> deptList = employeeService.queryDeptList();
		request.put("deptList", deptList);
		return "editSuccess";
	}
	
	public void prepareUpdate() throws Exception{
		employee = employeeService.getEmpById(empId);
		System.out.println("employee" + employee);
	}
	public String update() throws Exception{
		System.out.println("employee" + employee);
		employeeService.updateEmp(employee);
		return "updateSuccess";
	}
	
	public void prepareDelete() throws Exception{
		employee = employeeService.getEmpById(empId);
	}
	public String delete() throws Exception{
		
		employeeService.deleteEmp(employee);
		return "updateSuccess";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public void prepare() throws Exception {
		System.out.println("prepare()...");
	}

	@Override
	public Employee getModel() {
		return employee;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request; 
	}
}
