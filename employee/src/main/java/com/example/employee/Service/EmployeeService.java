package com.example.employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> getEmployee();

	Employee getEmployee(int id);

	List<Employee> addOneEmployee(Employee employee);

	List<Employee> updateOneEmployee(int id, Employee employee);

	List<Employee> deleteOneInventory(int id);

	
	
	
	
}
