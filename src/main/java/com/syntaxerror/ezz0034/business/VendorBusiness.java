
package com.syntaxerror.ezz0034.business;

import com.syntaxerror.ezz0034.models.Ticket;
import com.syntaxerror.ezz0034.models.Vendor;
import com.syntaxerror.ezz0034.repositories.VendorRepository;
import java.util.List;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorBusiness {
    
    @Autowired
    private VendorRepository vendorRepository;

    public void createNweVendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }

    public ObservableList<Vendor> getListCustomer() {
        return (ObservableList<Vendor>) vendorRepository.findAll();
    }
    
}
