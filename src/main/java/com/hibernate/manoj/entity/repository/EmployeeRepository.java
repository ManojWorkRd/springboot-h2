package com.hibernate.manoj.entity.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.manoj.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {


	    List<Employee> findByDepartment(String department);

}
