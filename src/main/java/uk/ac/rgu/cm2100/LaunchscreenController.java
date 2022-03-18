/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import uk.ac.rgu.cm2100.controllers.Controller;
import uk.ac.rgu.cm2100.model.Model;


/**
 * FXML Controller class
 *
 * @author Teo
 */
public class LaunchscreenController extends Controller<Model> implements Initializable {
    
    @FXML
    private Button btnMenuManager;
    @FXML
    private Button btnOrderManager;
    
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnMenuManagerClicked() throws IOException{
       
       MainApp.setRoot("MenuManager", null);
    }
    
    @FXML
    private void btnOrderManagerClicked() throws IOException{
       
       MainApp.setRoot("OrderManager", null);
    }

    
    
  
    @Override
    public void setModel(Model model) {
        
    }
    
}
