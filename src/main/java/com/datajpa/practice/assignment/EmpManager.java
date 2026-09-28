
package com.datajpa.practice.assignment;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class EmpManager {

    public void empManage(Services service) {

        Scanner sc = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n========== EMPLOYEE MENU ==========");

            System.out.println("1. Save Employee");
            System.out.println("2. Find All Employees");
            System.out.println("3. Find Employee By ID");
            System.out.println("4. Delete Employee By ID");
            System.out.println("5. Delete All Employees");

            System.out.println("6. Find By Department");
            System.out.println("7. Find By City");
            System.out.println("8. Find By Email");
            System.out.println("9. Find By Salary Greater Than");
            System.out.println("10. Find By Salary Less Than or Equal");
            System.out.println("11. Find By Age Greater Than");
            System.out.println("12. Find By Department And City");
            System.out.println("13. Find By Department OR Designation");
            System.out.println("14. Find By Name Starts With");
            System.out.println("15. Find By Name Containing");
            System.out.println("16. Find By Salary Between");
            System.out.println("17. Find By Department Order By Salary Desc");
            System.out.println("18. Find Top 3 Employees By Salary");
            System.out.println("19. Find Highest Salary Employee");
            System.out.println("20. Find Top 5 Employees By City Order By Salary");

            System.out.println("0. Exit");

            System.out.println("===================================");

            System.out.print("Enter your choice: ");

            try {

                choice = Integer.parseInt(sc.nextLine().trim());

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
                continue;
            }


            switch (choice) {


                // =================================================
                // 1. SAVE EMPLOYEE
                // =================================================

                case 1:

                    Employee emp = new Employee();

                    System.out.print("Enter ID: ");
                    emp.setId(Integer.parseInt(sc.nextLine()));

                    System.out.print("Enter Name: ");
                    emp.setName(sc.nextLine());

                    System.out.print("Enter Department: ");
                    emp.setDepartment(sc.nextLine());

                    System.out.print("Enter City: ");
                    emp.setCity(sc.nextLine());

                    System.out.print("Enter Email: ");
                    emp.setEmail(sc.nextLine());

                    System.out.print("Enter Designation: ");
                    emp.setDesignation(sc.nextLine());

                    System.out.print("Enter Age: ");
                    emp.setAge(Integer.parseInt(sc.nextLine()));

                    System.out.print("Enter Salary: ");
                    emp.setSalary(Double.parseDouble(sc.nextLine()));

                    service.save(emp);

                    System.out.println("Employee saved successfully.");

                    break;


                // =================================================
                // 2. FIND ALL
                // =================================================

                case 2:

                    service.findAll();

                    break;


                // =================================================
                // 3. FIND BY ID
                // =================================================

                case 3:

                    System.out.print("Enter Employee ID: ");

                    int id = Integer.parseInt(sc.nextLine());

                    service.findById(id);

                    break;


                // =================================================
                // 4. DELETE BY ID
                // =================================================

                case 4:

                    System.out.print("Enter Employee ID: ");

                    int deleteId = Integer.parseInt(sc.nextLine());

                    service.deletById(deleteId);

                    System.out.println("Employee deleted successfully.");

                    break;


                // =================================================
                // 5. DELETE ALL
                // =================================================

                case 5:

                    service.deleteAll();

                    System.out.println("All employees deleted successfully.");

                    break;


                // =================================================
                // 6. FIND BY DEPARTMENT
                // =================================================

                case 6:

                    System.out.print("Enter department: ");

                    service.Service_findByDepartment(sc.nextLine());

                    break;


                // =================================================
                // 7. FIND BY CITY
                // =================================================

                case 7:

                    System.out.print("Enter city: ");

                    service.Service_findByCity(sc.nextLine());

                    break;


                // =================================================
                // 8. FIND BY EMAIL
                // =================================================

                case 8:

                    System.out.print("Enter email: ");

                    service.Service_findByEmail(sc.nextLine());

                    break;


                // =================================================
                // 9. SALARY GREATER THAN
                // =================================================

                case 9:

                    System.out.print("Enter minimum salary: ");

                    service.Service_findBySalaryGreaterThan(
                            Double.parseDouble(sc.nextLine()));

                    break;


                // =================================================
                // 10. SALARY LESS THAN
                // =================================================

                case 10:

                    System.out.print("Enter maximum salary: ");

                    service.Service_findBySalaryLessThan(
                            Double.parseDouble(sc.nextLine()));

                    break;


                // =================================================
                // 11. AGE GREATER THAN
                // =================================================

                case 11:

                    System.out.print("Enter age: ");

                    service.Service_findByAgeGreaterThan(
                            Integer.parseInt(sc.nextLine()));

                    break;


                // =================================================
                // 12. DEPARTMENT AND CITY
                // =================================================

                case 12:

                    System.out.print("Enter department: ");

                    String department = sc.nextLine();

                    System.out.print("Enter city: ");

                    String city = sc.nextLine();

                    service.Service_findByDepartmentAndCity(
                            department, city);

                    break;


                // =================================================
                // 13. DEPARTMENT OR DESIGNATION
                // =================================================

                case 13:

                    System.out.print("Enter department: ");

                    String dep = sc.nextLine();

                    System.out.print("Enter designation: ");

                    String designation = sc.nextLine();

                    service.Service_findEmp_MatchWith_Designation_OR_Department(
                            dep, designation);

                    break;


                // =================================================
                // 14. NAME STARTS WITH
                // =================================================

                case 14:

                    System.out.print("Enter name prefix: ");

                    service.Service_findByNameStartsWith(
                            sc.nextLine());

                    break;


                // =================================================
                // 15. NAME CONTAINING
                // =================================================

                case 15:

                    System.out.print("Enter name text: ");

                    service.Service_findByNameContaining(
                            sc.nextLine());

                    break;


                // =================================================
                // 16. SALARY BETWEEN
                // =================================================

                case 16:

                    System.out.print("Enter minimum salary: ");

                    double minSalary =
                            Double.parseDouble(sc.nextLine());

                    System.out.print("Enter maximum salary: ");

                    double maxSalary =
                            Double.parseDouble(sc.nextLine());

                    service.Service_findBySalaryBetween(
                            minSalary, maxSalary);

                    break;


                // =================================================
                // 17. DEPARTMENT ORDER BY SALARY DESC
                // =================================================

                case 17:

                    System.out.print("Enter department: ");

                    String dept = sc.nextLine();

                    service.Service_findByDepartmentOrderBySalaryDesc(
                            dept);

                    break;


                // =================================================
                // 18. TOP 3 SALARY
                // =================================================

                case 18:

                    service.Service_findTop3ByOrderBySalaryDesc();

                    break;


                // =================================================
                // 19. HIGHEST SALARY
                // =================================================

                case 19:

                    service.Service_findFirstByOrderBySalaryDesc();

                    break;


                // =================================================
                // 20. TOP 5 BY CITY
                // =================================================

                case 20:

                    System.out.print("Enter city: ");

                    service.Service_findTop5ByCityOrderBySalaryDesc(
                            sc.nextLine());

                    break;


                // =================================================
                // EXIT
                // =================================================

                case 0:

                    System.out.println(
                            "Exiting Employee Management...");

                    return;


                default:

                    System.out.println(
                            "Invalid choice. Please try again.");
            }
        }
    }
}

