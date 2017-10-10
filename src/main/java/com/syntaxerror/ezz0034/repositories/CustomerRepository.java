
package com.syntaxerror.ezz0034.repositories;

import com.syntaxerror.ezz0034.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository <Customer, Integer> {
    
}
