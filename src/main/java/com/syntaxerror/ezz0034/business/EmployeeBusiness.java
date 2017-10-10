
package com.syntaxerror.ezz0034.business;

import com.syntaxerror.ezz0034.models.Employee;
import com.syntaxerror.ezz0034.repositories.EmployeeRepository;
import java.util.List;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBusiness {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getListCustomer() {
        return employeeRepository.findAll();
    }

    public void createNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
}
