
package com.syntaxerror.ezz0034.controllers;


import com.syntaxerror.ezz0034.business.CustomerBusiness;
import com.syntaxerror.ezz0034.models.Customer;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class NewCustomerController extends BaseController implements Initializable {

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
    private TextField txt_rep;
    @FXML
    private TextField txt_company;
    @FXML
    private ChoiceBox<String> cb_csttype;
    // </editor-fold>

    @FXML
    public void Create(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
        if(fieldsEmpty()){
            lbl_status.setText(displayMissingInfoMessege());
            lbl_status.setTextFill(Color.RED);
        } else { 
            CustomerBusiness customerBusiness = new CustomerBusiness();
            customerBusiness.createNewCustomer(new Customer(txt_company.getText(), txt_rep.getText(), cb_csttype.getValue()));
            goToHomePage(event);
        }
    }
    
    private boolean fieldsEmpty(){
        if (txt_company.getText().length()<1 || txt_rep.getText().length()<1 || cb_csttype.getSelectionModel() == null){
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
        ObservableList<String> customerlist = FXCollections.observableArrayList("Company","Employee");
        cb_csttype.setItems(customerlist);
    }    

    
    
}
