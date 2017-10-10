
package com.syntaxerror.ezz0034.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BaseNavigation {
    
    public void goToLoginPage(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginPage.fxml"));
        Scene scene = new Scene(root, 320, 240);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    
    protected void goToHomePage(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/HomePage.fxml"));
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("/styles/Styles.css");        
        stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.show();
    }
    
    protected void goToCustomerPage(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/NewCustomer.fxml").openStream());
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setTitle("New Customer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    protected void goToEmployeePage(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/NewEmployee.fxml").openStream());
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setTitle("New Employee");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    protected void goToLoginPage(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/LoginPage.fxml").openStream());
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    protected void goToTicketPage(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/NewTicket.fxml").openStream());
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setTitle("New Ticket");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    protected void goToVendorPage(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/NewVendor.fxml").openStream());
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setTitle("New Vendor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
