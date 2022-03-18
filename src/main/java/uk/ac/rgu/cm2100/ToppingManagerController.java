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
import uk.ac.rgu.cm2100.controllers.Controller;
import uk.ac.rgu.cm2100.model.managers.MenuManager;

/**
 * FXML Controller class
 *
 * @author Teo
 */
public class ToppingManagerController extends Controller<MenuManager> implements Initializable {
    
    @FXML
    private Button btnBacktoHome;
    @FXML
    private ListView  lstToppings;
    
    @FXML
    private Button btnAddCustomTopping;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnBacktoHomeClicked() throws IOException{
       
       MainApp.setRoot("launchscreen",null);
    }
    
    
     @FXML
    private void btnAddCustomToppingClicked() throws IOException{
       
       MainApp.setRoot("CustomToppings",null);
    }
    
    @Override
    public void setModel(MenuManager model) {
        
    }
}
