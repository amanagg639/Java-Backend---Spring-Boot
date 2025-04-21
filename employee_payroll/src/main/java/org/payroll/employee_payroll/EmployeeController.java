package org.payroll.employee_payroll;

import org.payroll.employee_payroll.model.Employee;
import org.payroll.employee_payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employeeDetails")
    public List<Employee> getData(){
       return employeeService.getData();
    }
}
