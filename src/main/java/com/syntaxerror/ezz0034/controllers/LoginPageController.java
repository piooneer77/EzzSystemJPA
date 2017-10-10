
package com.syntaxerror.ezz0034.controllers;

import com.syntaxerror.ezz0034.business.UserBusiness;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class LoginPageController extends BaseController implements Initializable {

    
    
    // <editor-fold defaultstate="collapsed" desc="page controls">
    @FXML
    private Button btn_login;
    @FXML
    private PasswordField txt_pass;
    @FXML
    private Label lbl_status;
    @FXML
    private TextField txt_user;
    // </editor-fold>
    
    public void Login(ActionEvent event) throws IOException, SQLException, ClassNotFoundException{
        if(txt_user.getText().length()<1){
            lbl_status.setText(displayMissingInfoMessege());
            lbl_status.setTextFill(Color.RED);
        } else if (txt_pass.getText().length()<1){
            lbl_status.setText(displayMissingInfoMessege());
            lbl_status.setTextFill(Color.RED);
        } else if (userIsValid()) {
            goToHomePage(event);
        } else { 
            lbl_status.setText(displayErrorMessege()); 
            lbl_status.setTextFill(Color.RED);
        }
    }
    
    private boolean userIsValid() throws SQLException, ClassNotFoundException {
        UserBusiness userBusiness = new UserBusiness();
        user = userBusiness.findUserByIdAndMagic(txt_user.getText(), txt_pass.getText());
        if(user != null){
        return true;
        }else{
            return false;
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    

    

    
    
}
