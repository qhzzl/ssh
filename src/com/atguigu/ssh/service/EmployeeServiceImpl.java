package com.atguigu.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.ssh.dao.HibernateDao;
import com.atguigu.ssh.entity.Department;
import com.atguigu.ssh.entity.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private HibernateDao hibernateDao;

	@Override
	public List<Employee> queryEmpList() throws Exception {
		return hibernateDao.queryEmpList();
	}

	@Override
	public List<Department> queryDeptList() throws Exception {
		return hibernateDao.queryDeptList();
	}

	@Override
	public void saveEmp(Employee emp) throws Exception {
		hibernateDao.saveEmp(emp);
	}

	@Override
	public Employee getEmpById(Integer empId) throws Exception {
		return hibernateDao.getEmpById(empId);
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		hibernateDao.updateEmp(emp);
	}

	@Override
	public void deleteEmp(Integer empId) throws Exception {
		hibernateDao.deleteEmp(empId);
	}
	
	@Override
	public void deleteEmp(Employee employee) throws Exception {
		hibernateDao.deleteEmp(employee);
	}

}
