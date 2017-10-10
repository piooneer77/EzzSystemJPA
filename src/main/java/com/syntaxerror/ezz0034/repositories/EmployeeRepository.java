
package com.syntaxerror.ezz0034.repositories;

import com.syntaxerror.ezz0034.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
    
}
