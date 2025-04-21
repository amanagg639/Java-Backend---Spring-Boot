package org.payroll.employee_payroll.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Employee {
    @Id
    private int id;
    private String name;
    private String gender;

}

