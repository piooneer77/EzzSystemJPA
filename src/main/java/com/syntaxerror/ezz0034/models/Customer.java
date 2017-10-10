
package com.syntaxerror.ezz0034.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Customer_tbl" )
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cstid;
    private String cstcompany;
    private String cstrepresentetive;
    private String csttype;
    
    public Customer(String company, String representetive, String type) {
        this.cstcompany = company;
        this.cstrepresentetive = representetive;
        this.csttype = type;
    }

    public int getId() {
        return cstid;
    }

    public String getCompany() {
        return cstcompany;
    }

    public String getRepresentetive() {
        return cstrepresentetive;
    }

    public String getType() {
        return csttype;
    }
    
    
}
