package com.hibernate.manoj.entity.service;

import org.springframework.stereotype.Service;
import com.hibernate.manoj.entity.Employee;
import com.hibernate.manoj.entity.repository.EmployeeRepository;

import java.util.List;

	@Service
	public class EmployeeService {

	    private final EmployeeRepository repository;

	    public EmployeeService(EmployeeRepository repository) {
	        this.repository = repository;
	    }

	    public Employee save(Employee employee) {
	        return repository.save(employee);
	    }

	    public List<Employee> getAll() {
	        return repository.findAll();
	    }

	    public Employee getById(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Employee not found"));
	    }

	    public List<Employee> getByDepartment(String dept) {
	        return repository.findByDepartment(dept);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	}