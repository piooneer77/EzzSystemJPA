
package com.syntaxerror.ezz0034.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Vendor_tbl" )
public class Vendor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int venid;
    private String venname;
    
    public Vendor(String venname) {
        this.venname = venname;
    }

    public int getVenid() {
        return venid;
    }

    public String getVenname() {
        return venname;
    }
    
    
}
