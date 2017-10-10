
package com.syntaxerror.ezz0034.models;


public class Employee {
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
