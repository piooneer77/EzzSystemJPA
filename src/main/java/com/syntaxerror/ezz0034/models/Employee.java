
package com.syntaxerror.ezz0034.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Employee_tbl" )
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String empname;

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
    
    public Employee(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }
}
