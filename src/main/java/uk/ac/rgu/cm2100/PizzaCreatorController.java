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
public class PizzaCreatorController extends Controller<MenuManager> implements Initializable {
    
    @FXML
    private ListView  lstToppings;
    @FXML
    private Button btnAddTopping;
    
    @FXML
    private ListView lstCrust;
    @FXML
    private Button btnChooseCrust;
            
    @FXML
    private Button btnSavePizza;
    
      @FXML
    private Button btnToppingManager;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void btnSavePizzaClicked()throws IOException{
       
       MainApp.setRoot("MenuManager", null);
    }
    
    @FXML
    private void btnToppingManagerClicked() throws IOException{
       
       MainApp.setRoot("ToppingManager", null);
    }
    
    @FXML
    private void btnAddToppingClicked() {
    }
    @FXML
    private void btnChooseCrustClicked(){
    }
    
    
    @Override
    public void setModel(MenuManager model) {
        
    }
}
