package com.example;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        dao.addEmployee(new Employee("Gaurav Singh", "Engineering"));
        dao.addEmployee(new Employee("Saurav Singh", "Sales"));
    }
}
