package com.datajpa.practice.assignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_table_jpa")
public class Employee {

	
	@Id
	private int id;
	
	@Column(name="emp_Name" ,length = 45)
	private String name;
	
	@Column(name="emp_department" ,length = 45)
	private String department;
	
	@Column(name="emp_Email" ,length = 45)
	private String email;
	
	@Column(name="emp_City" ,length = 45)
	private String city;
	
	@Column(name="emp_designation" ,length = 45)
	private String designation;
	
	@Column(name="empAge")
	private int age;
	
	@Column(name="empPhone_Num")
	private double number;
	
	@Column(name="empSalary")
	private double salary;
}
