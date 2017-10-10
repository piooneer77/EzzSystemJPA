
package com.syntaxerror.ezz0034.controllers;


import com.syntaxerror.ezz0034.business.CustomerBusiness;
import com.syntaxerror.ezz0034.business.EmployeeBusiness;
import com.syntaxerror.ezz0034.business.TicketBusiness;
import com.syntaxerror.ezz0034.business.VendorBusiness;
import com.syntaxerror.ezz0034.models.Ticket;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class NewTicketController extends BaseController implements Initializable {
    
    private CustomerBusiness customerBusiness;
    private EmployeeBusiness employeeBusiness;
    private VendorBusiness vendorBusiness;
    private TicketBusiness ticketBusiness;

    // <editor-fold defaultstate="collapsed" desc="page controls">
    @FXML
    private Label lbl_title;
    @FXML
    private Button btn_save;
    @FXML
    private TextField txt_value;
    @FXML
    private TextField txt_tktnumber;
    @FXML
    private Label lbl_status;
    @FXML
    private TextField txt_route;
    @FXML
    private ChoiceBox<String> cb_tktCustomer;
    @FXML
    private ChoiceBox<String> cb_tktVendor;
    @FXML
    private ChoiceBox<String> cb_tktEmployee;
    @FXML
    private TextField txt_commision;
    @FXML
    private DatePicker dp_date;
    @FXML
    private DatePicker dp_depdate;
    @FXML
    private Button btn_Home;
    // </editor-fold>
    
    public void createNewTicket(ActionEvent event) throws IOException, SQLException, ClassNotFoundException{
        if(fieldsAreEmpty()){
            lbl_status.setText(displayMissingInfoMessege());
            lbl_status.setTextFill(Color.RED);
        } else if (numbersIsValid()) { 
            ticketBusiness = new TicketBusiness();
            ticketBusiness.createNewTicket(createTicketObject());
            goToHomePage(event);
        } else {
            lbl_status.setText(displayWrongNumbersMessege());
            lbl_status.setTextFill(Color.RED);
        }
    }
    
    private Ticket createTicketObject(){
        return ticketBusiness.createNewTicket(new Ticket(txt_tktnumber.getText(),
                    cb_tktCustomer.getValue(),
                    cb_tktVendor.getValue(),
                    cb_tktEmployee.getValue(),
                    Float.parseFloat(txt_value.getText()),
                    Float.parseFloat(txt_commision.getText()),
                    dp_date.getValue(),
                    dp_depdate.getValue(),
                    txt_route.getText()));
    }
    
    private boolean numbersIsValid(){
        try {
        Float.parseFloat(txt_value.getText());
        Float.parseFloat(txt_commision.getText());
        return true;
        } catch (Exception ex){
            return false;
        }
    }
    
    private boolean fieldsAreEmpty(){
        if (txt_value.getText().length()<1 || 
                txt_route.getText().length()<1 ||
                txt_commision.getText().length()<1 ||
                cb_tktCustomer.getValue() == null ||
                cb_tktVendor.getValue() == null ||
                cb_tktEmployee.getValue() == null
                ){
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
        
        customerBusiness = new CustomerBusiness();
        employeeBusiness = new EmployeeBusiness();
        vendorBusiness = new VendorBusiness();
        cb_tktCustomer.setItems(customerBusiness.getListCustomer());
        cb_tktEmployee.setItems(employeeBusiness.getListCustomer());
        cb_tktVendor.setItems(vendorBusiness.getListCustomer());
    }    
    
    @FXML
    private void Login(ActionEvent event) {
    }
    
}
