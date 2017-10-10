package com.syntaxerror.ezz0034;

import com.syntaxerror.ezz0034.controllers.BaseNavigation;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class MainApp extends Application {

    private BaseNavigation BaseNavigation;
    
    @Override
    public void start(Stage stage) throws IOException {
        BaseNavigation = new BaseNavigation();
        BaseNavigation.goToLoginPage(stage);           
    }

    public static void main(String[] args) {
        launch(args);
    }

}
