package com.atguigu.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atguigu.ssh.entity.Department;
import com.atguigu.ssh.entity.Employee;

@Repository("hibernateDao")
public class HibernateDaoImpl implements HibernateDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Employee> queryEmpList() throws Exception {
		return getSession().createQuery("FROM Employee e LEFT JOIN FETCH e.dept").list();
		//return getSession().createQuery("FROM Employee").list();
	}

	@Override
	public List<Department> queryDeptList() throws Exception {
		return getSession().createQuery("FROM Department").list();
	}

	@Override
	public void saveEmp(Employee emp) throws Exception {
		getSession().save(emp);
		
	}

	@Override
	public Employee getEmpById(Integer empId) throws Exception {
		return (Employee) getSession().get(Employee.class, empId);
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		getSession().update(emp);
		
	}

	@Override
	public void deleteEmp(Employee emp) throws Exception {
		getSession().delete(emp);
		
	}

	@Override
	public void deleteEmp(Integer empId) throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		
		getSession().delete(emp);
		
	}

}
