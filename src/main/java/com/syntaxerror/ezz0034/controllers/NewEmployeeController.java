
package com.syntaxerror.ezz0034.controllers;


import com.syntaxerror.ezz0034.business.EmployeeBusiness;
import com.syntaxerror.ezz0034.models.Employee;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class NewEmployeeController extends BaseController implements Initializable {
    
    // <editor-fold defaultstate="collapsed" desc="page controls">
    @FXML
    private Label lbl_title;
    @FXML
    private Button btn_save;
    @FXML
    private Button btn_Home;
    @FXML
    private Label lbl_status;
    @FXML
    private TextField txt_employee;
    // </editor-fold>
    
    public void createNewEmployee(ActionEvent event) throws IOException, SQLException, ClassNotFoundException{
        if(fieldsEmpty()){
            lbl_status.setText(displayMissingInfoMessege());
            lbl_status.setTextFill(Color.RED);
        } else { 
            EmployeeBusiness employeeBusiness = new EmployeeBusiness();
            employeeBusiness.createNewEmployee(new Employee(txt_employee.getText()));
            goToHomePage(event);
        }
    }
    
    private boolean fieldsEmpty(){
        if (txt_employee.getText().length()<1){
            return true;
        } else {
            return false;
        }
    }
    
    @FXML
    private void goToHome(ActionEvent event) throws IOException{
        goToHomePage(event);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
