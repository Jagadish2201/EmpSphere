
package com.datajpa.practice.assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

	// ==================== Basic Search ====================

	// Find employees by department
	List<Employee> findByDepartment(String department);

	// Find employees by city
	List<Employee> findByCity(String city);

	// Find employee by email
	List<Employee> findByEmail(String email);


	// ==================== Salary Queries ====================

	// Salary greater than given value
	List<Employee> findBySalaryGreaterThan(Double salary);

	// Salary less than or equal to given value
	@Query(value = "SELECT * FROM emp_table_jpa WHERE emp_salary <= :salary",
			nativeQuery = true)
	List<Employee> findBySalaryLessThan(
			@Param("salary") Double salary);


	// ==================== Age Query ====================

	// Age greater than given value
	List<Employee> findByAgeGreaterThan(int age);


	// ==================== Multiple Conditions ====================

	// Department AND city must match
	List<Employee> findByDepartmentAndCity(
			String department,
			String city);

	// Department OR designation must match
	@Query(value = "SELECT * FROM emp_table_jpa " +
			"WHERE emp_designation = :designation " +
			"OR emp_department = :department",
			nativeQuery = true)
	List<Employee> findEmp_MatchWith_Designation_OR_Department(
			@Param("designation") String designation,
			@Param("department") String department);


	// ==================== Name Queries ====================

	// Name starts with given text
	List<Employee> findByNameStartsWith(String prefix);

	// Name contains given text
	List<Employee> findByNameContaining(String text);


	// ==================== Range Query ====================

	// Salary between minimum and maximum value
	List<Employee> findBySalaryBetween(
			Double minSalary,
			Double maxSalary);


	// ==================== Sorting ====================

	// Employees from department sorted by salary DESC
	List<Employee> findByDepartmentOrderBySalaryDesc(
			String department);


	// ==================== Top / First Queries ====================

	// Top 3 employees by highest salary
	List<Employee> findTop3ByOrderBySalaryDesc();

	// Employee with highest salary
	List<Employee> findFirstByOrderBySalaryDesc();

	// Top 5 highest-paid employees from a particular city
	List<Employee> findTop5ByCityOrderBySalaryDesc(String city);
}

