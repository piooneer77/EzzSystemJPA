
package com.syntaxerror.ezz0034.controllers;

import com.syntaxerror.ezz0034.models.User;

public abstract class BaseController extends BaseNavigation {
    
    public User user;
    
    protected String displayErrorMessege() {
        return ("User Is Invalid");
    }
    
    protected String displayMissingInfoMessege() {
        return ("Missing Info");
    }
    
    protected String displayMissingselection() {
        return ("Select Item To Do Action");
    }
    
    protected String displayWrongNumbersMessege() {
        return ("Please Enter a Valid Numbers");
    }
}
