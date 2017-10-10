
package com.syntaxerror.ezz0034.business;

import com.syntaxerror.ezz0034.models.Customer;
import com.syntaxerror.ezz0034.repositories.CustomerRepository;
import java.util.List;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerBusiness {
    
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getListCustomer() {
        return customerRepository.findAll();
    }

    public void createNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    
}
