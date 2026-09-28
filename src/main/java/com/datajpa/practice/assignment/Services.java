
package com.datajpa.practice.assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

	@Autowired
	public EmpRepository repository;

	// ==================== Basic CRUD Operations ====================

	// Save employee
	public void save(Employee emp) {
		Employee em = repository.save(emp);
		System.out.println(em);
	}

	// Find all employees
	public void findAll() {
		List<Employee> list = repository.findAll();
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employee by ID
	public void findById(int id) {
		Optional<Employee> byId = repository.findById(id);
		if(byId != null) {
			Employee employee = byId.get();
			System.out.println(employee);
			
		}
		else {
			System.out.println("this id is not present in database...");
		}
	}

	// Delete employee by ID
	public void deletById(int id) {
		repository.deleteById(id);
	}

	// Delete all employees
	public void deleteAll() {
		repository.deleteAll();
	}

	// ==================== Derived Query Methods ====================

	// Find employees by department
	public void Service_findByDepartment(String department) {
		List<Employee> list = repository.findByDepartment(department);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees by city
	public void Service_findByCity(String city) {
		List<Employee> list = repository.findByCity(city);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees by email
	public void Service_findByEmail(String email) {
		List<Employee> list = repository.findByEmail(email);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose salary is greater than given salary
	public void Service_findBySalaryGreaterThan(Double salary) {
		List<Employee> list = repository.findBySalaryGreaterThan(salary);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose salary is less than or equal to given salary
	public void Service_findBySalaryLessThan(Double salary) {

		List<Employee> list = repository.findBySalaryLessThan(salary);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose age is greater than given age
	public void Service_findByAgeGreaterThan(int age) {

		List<Employee> list = repository.findByAgeGreaterThan(age);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees by department AND city
	public void Service_findByDepartmentAndCity(String department, String city) {

		List<Employee> list = repository.findByDepartmentAndCity(department, city);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees where department OR designation matches
	public void Service_findEmp_MatchWith_Designation_OR_Department(
			String department, String designation) {

		List<Employee> list =
				repository.findEmp_MatchWith_Designation_OR_Department(
						department, designation);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose name starts with given prefix
	public void Service_findByNameStartsWith(String prefix) {

		List<Employee> list = repository.findByNameStartsWith(prefix);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose name contains given text
	public void Service_findByNameContaining(String text) {

		List<Employee> list = repository.findByNameContaining(text);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees whose salary is within given range
	public void Service_findBySalaryBetween(Double minSalary, Double maxSalary) {

		List<Employee> list =
				repository.findBySalaryBetween(minSalary, maxSalary);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employees by department and sort salary in descending order
	public void Service_findByDepartmentOrderBySalaryDesc(String department) {

		List<Employee> list =
				repository.findByDepartmentOrderBySalaryDesc(department);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find top 3 employees with highest salary
	public void Service_findTop3ByOrderBySalaryDesc() {

		List<Employee> list = repository.findTop3ByOrderBySalaryDesc();

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find employee with the highest salary
	public void Service_findFirstByOrderBySalaryDesc() {

		List<Employee> list = repository.findFirstByOrderBySalaryDesc();

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	// Find top 5 highest-paid employees from a particular city
	public void Service_findTop5ByCityOrderBySalaryDesc(String city) {

		List<Employee> list =
				repository.findTop5ByCityOrderBySalaryDesc(city);

		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}

