package com.gl.vm.empmsystem.service;
import java.util.List;

import com.gl.vm.empmsystem.entity.Employee;
import com.gl.vm.empmsystem.entity.Role;
import com.gl.vm.empmsystem.entity.User;

public interface EmployeeService {
	

	
		public List<Employee> findAll();
		
		public Employee findById(int theId);
		
		public void save(Employee theEmployee);
		
		public void deleteById(int theId);
		
		public List<Employee> searchByFirstName(String firstName);
		
		public List<Employee> sortByFirstNameAsc();
		
		public User saveUser(User user);
		public Role saveRole(Role role);
	}


