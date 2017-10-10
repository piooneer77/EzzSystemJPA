
package com.syntaxerror.ezz0034.models;


import java.time.LocalDate;


public class Ticket {
    private int tktid;
    private String tktnumber;
    private String tktcst;
    private String tktven;
    private String tktemp;
    private float tktvalue;
    private float tktcommision;
    private LocalDate tktDate;
    private LocalDate tktDepDate;
    private String tktroute;

    public Ticket(int id,String tktnumber, String tktcst, String tktven, String tktemp, float tktvalue, float tktcommision, LocalDate tktDate, LocalDate tktDepDate, String tktroute) {
        this.tktid = id;
        this.tktnumber = tktnumber;
        this.tktcst = tktcst;
        this.tktven = tktven;
        this.tktemp = tktemp;
        this.tktvalue = tktvalue;
        this.tktcommision = tktcommision;
        this.tktDate = tktDate;
        this.tktDepDate = tktDepDate;
        this.tktroute = tktroute;
    }

    public Ticket(String tktnumber,String tktcst, String tktven, String tktemp, float tktvalue, float tktcommision, LocalDate tktDate, LocalDate tktDepDate, String tktroute) {
        this.tktnumber = tktnumber;
        this.tktcst = tktcst;
        this.tktven = tktven;
        this.tktemp = tktemp;
        this.tktvalue = tktvalue;
        this.tktcommision = tktcommision;
        this.tktDate = tktDate;
        this.tktDepDate = tktDepDate;
        this.tktroute = tktroute;
    }

    public int getTktid() {
        return tktid;
    }

    public String getTktnumber() {
        return tktnumber;
    }

    public String getTktcst() {
        return tktcst;
    }

    public String getTktven() {
        return tktven;
    }

    public String getTktemp() {
        return tktemp;
    }

    public float getTktvalue() {
        return tktvalue;
    }

    public float getTktcommision() {
        return tktcommision;
    }

    public LocalDate getTktDate() {
        return tktDate;
    }

    public LocalDate getTktDepDate() {
        return tktDepDate;
    }

    public String getTktroute() {
        return tktroute;
    }
    
    
    
}
