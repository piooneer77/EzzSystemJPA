
package com.syntaxerror.ezz0034.controllers;


import com.syntaxerror.ezz0034.business.TicketBusiness;
import com.syntaxerror.ezz0034.models.Ticket;
import com.syntaxerror.ezz0034.models.User;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;


public class HomePageController extends BaseController implements Initializable {
    
    private TicketBusiness ticketBusiness;
    private String column;
    
    // <editor-fold defaultstate="collapsed" desc="page controls">
    @FXML
    private TextField txt_searharea;
    @FXML
    private ComboBox<String> cmb_searchwith;
    @FXML
    private Button btn_serach;
    @FXML
    private Label lbl_user;
    @FXML
    private DatePicker dp_from;
    @FXML
    private DatePicker dp_to;
    @FXML
    private Button btn_refresh;
    @FXML
    private Button btn_new;
    @FXML
    private Button btn_edit;
    @FXML
    private Button btn_delete;
    @FXML
    private Label lbl_status;
    @FXML
    private Button btn_newCustomer;
    @FXML
    private Button btn_newEmployee;
    @FXML
    private Button btn_newVendor;
    @FXML
    private TableView<Ticket> tv_Tickets;
    @FXML
    private TableColumn<Ticket, String> tc_id;
    @FXML
    private TableColumn<Ticket, String> tc_emp;
    @FXML
    private TableColumn<Ticket, String> tc_company;
    @FXML
    private TableColumn<Ticket, LocalDate> tc_date;
    @FXML
    private TableColumn<Ticket, Float> tc_value;
    @FXML
    private TableColumn<Ticket, Float> tc_commision;
    @FXML
    private TableColumn<Ticket, String> tc_route;
    @FXML
    private TableColumn<Ticket, LocalDate> tc_depdate;
    @FXML
    private TableColumn<Ticket, String> tc_vendor;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Buttons Navigation">
    
    public void createNewCustomer(ActionEvent event) throws IOException{
        goToCustomerPage(event);
    }
    
    public void createNewEmployee(ActionEvent event) throws IOException{
        goToEmployeePage(event);
    }
    
    public void createNewVendor(ActionEvent event) throws IOException{
        goToVendorPage(event);
    }
    
    public void createNewTicket(ActionEvent event) throws IOException{
        goToTicketPage(event);
    }
    
    // </editor-fold>
    
    public void Search(ActionEvent event) throws SQLException, ClassNotFoundException{
//        showSearchResults();
    }
    
//    private void showSearchResults() throws SQLException, ClassNotFoundException{
//        if(createdSearchObjet()){
//            ticketBusiness = new TicketBusiness();
//            tv_Tickets.setItems(ticketBusiness.searchWithoutDate(search));
//        } else {
//            lbl_status.setText(displayMissingInfoMessege());
//            lbl_status.setTextFill(Color.RED);
//        }
//    }
//    
//    private boolean createdSearchObjet(){
//        if(hasFieldsToSearchWithDate()){
//            decideWhatToSeachWith();
//            search = new Search(column, 
//                    txt_searharea.getText(), 
//                    dp_from.getValue(), 
//                    dp_to.getValue());
//            return true;
//        } else if (hasFieldsToSearchWithoutDate()){
//            decideWhatToSeachWith();
//            search = new Search(column, 
//                    txt_searharea.getText());
//            return true;
//        } else {
//            search = null; 
//            return false;
//        }
//    }
    
    private void decideWhatToSeachWith(){
        if (cmb_searchwith.getValue().equals("ID")) this.column = "tkt_id";
        else if (cmb_searchwith.getValue().equals("Employee")) this.column = "emp_firstname";
        else if (cmb_searchwith.getValue().equals("Company")) this.column = "cst_company";
        else if (cmb_searchwith.getValue().equals("Vendor")) this.column = "ven_name";
    }
    
    private boolean hasFieldsToSearchWithDate(){
        if(txt_searharea.getText().length()<1 || 
                cmb_searchwith.getValue().equals("All") ||
                cmb_searchwith.getValue()==null ||
                dp_from.getValue()==null ||
                dp_to.getValue()==null ){
            return false;
        }else {
            return true;
        }
    }
    
    private boolean hasFieldsToSearchWithoutDate(){
        if(txt_searharea.getText().length()<1 || 
                cmb_searchwith.getValue().equals("All") ||
                cmb_searchwith.getValue()==null){
            return false;
        }else {
            return true;
        }
    }
    
    public void delete(ActionEvent event) throws SQLException, ClassNotFoundException {
        Ticket ticket = tv_Tickets.getSelectionModel().getSelectedItem();
        if(ticket != null){
        ticketBusiness = new TicketBusiness();
        ticketBusiness.removeTicketById(tv_Tickets.getSelectionModel().getSelectedItem().getTktid());
        refresh(event);
        lbl_status.setText("");
        } else {
            lbl_status.setText(displayMissingselection());
            lbl_status.setTextFill(Color.RED);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // <editor-fold defaultstate="collapsed" desc="tableview data">
//        tc_id.setCellValueFactory(new PropertyValueFactory<>("tktnumber"));
//        tc_emp.setCellValueFactory(new PropertyValueFactory<>("tktemp"));
//        tc_company.setCellValueFactory(new PropertyValueFactory<>("tktcst"));
//        tc_date.setCellValueFactory(new PropertyValueFactory<>("tktDate"));
//        tc_value.setCellValueFactory(new PropertyValueFactory<>("tktvalue"));
//        tc_commision.setCellValueFactory(new PropertyValueFactory<>("tktcommision"));
//        tc_route.setCellValueFactory(new PropertyValueFactory<>("tktroute"));
//        tc_depdate.setCellValueFactory(new PropertyValueFactory<>("tktDepDate"));
//        tc_vendor.setCellValueFactory(new PropertyValueFactory<>("tktven"));
        
        ObservableList<String> searchList = FXCollections.observableArrayList("All","Ticket Number","Employee", "Company", "Vendor");
        cmb_searchwith.setItems(searchList);
        
        ticketBusiness = new TicketBusiness();
        tv_Tickets.setItems(ticketBusiness.getAllTickets()); // </editor-fold>
        // </editor-fold>
        
    }    
    
    public void refresh(ActionEvent event) {
        ticketBusiness = new TicketBusiness();
        tv_Tickets.setItems(ticketBusiness.getAllTickets());
    }
    
    public void setPageInfo(User user){
        this.user = user;
        lbl_user.setText(this.user.getUser());
    }
    
    @FXML
    private void update(ActionEvent event) {
        
    }
}
