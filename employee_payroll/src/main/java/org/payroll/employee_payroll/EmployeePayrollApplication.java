package org.payroll.employee_payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeePayrollApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EmployeePayrollApplication.class, args);
        EmployeeController employeeController = (EmployeeController) context.getBean("employeeController");
    }

}
