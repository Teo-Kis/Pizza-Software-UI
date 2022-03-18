/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import uk.ac.rgu.cm2100.model.managers.MenuManager;
import uk.ac.rgu.cm2100.controllers.Controller;

/**
 * FXML Controller class
 *
 * @author Teo
 */
public class MenuManagerController extends Controller<MenuManager> implements Initializable {
    
    @FXML
    private Button btnBacktoHome;
    @FXML
    private ListView lstMenuItems;
    @FXML
    private Button btnDeleteMenuItem;
    @FXML
    private Button btnAddNewPizza;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private void btnBacktoHomeClicked() throws IOException{
       
       MainApp.setRoot("launchscreen", null);
    }
    
    
    
     @FXML
    private void btnDeleteMenuItemClicked() {
    }
        
    
    @FXML
    private void btnAddNewPizzaClicked() throws IOException{
       
       MainApp.setRoot("PizzaCreator", null);
    }

    @Override
    public void setModel(MenuManager model) {
        
    }
}
