package uk.ac.rgu.cm2100;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Consumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import uk.ac.rgu.cm2100.controllers.Controller;
import uk.ac.rgu.cm2100.model.Order;
import uk.ac.rgu.cm2100.model.managers.OrderManager;
import uk.ac.rgu.cm2100.model.Model;
import uk.ac.rgu.cm2100.model.IOrder;
import uk.ac.rgu.cm2100.model.Order;


/**
 * FXML Controller class
 *
 * @author Teo
 */
public class OrderManagerController extends Controller<OrderManager> implements Initializable {
    
    @FXML
    private Button btnBacktoHome;
    @FXML
    private ListView lstPrevOrders;
    
    @FXML
    private Button btnOrderdetails;
    
    @FXML 
    private Label lblOrderDetails;
     
    
    @FXML
    private HBox boxButtons;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<String> ordersList = new ArrayList<>();
        ordersList.add("1rstOrder");
        ordersList.add("2Order");

        
        ObservableList<String> listOrders = FXCollections.observableArrayList(ordersList);
        lstPrevOrders.setItems(listOrders);
    }
       
    
    @FXML
    private void btnBacktoHomeClicked() throws IOException{
       
       MainApp.setRoot("launchscreen", this.model);
    }
    
    @FXML
    private void lstPrevOrders(){
    String selected = this.lstPrevOrders.getSelectionModel().getSelectedItem().toString();
    System.out.println(this.lstPrevOrders);


    }

   @FXML
    private void btnOrderdetailsClicked() {
        Order orderTitles = (Order) this.lstPrevOrders.getSelectionModel().getSelectedItem();
        //this.lblOrderDetails.setText(Orders);
        System.out.println(orderTitles);
    }
  
    @Override
    public void setModel(OrderManager model) {
        this.model = model;
        
       List<Order> orderDetails = this.model.getOrders();

        lstPrevOrders.setItems(FXCollections.observableArrayList(orderDetails));
        
        this.model.addPropertyChangeListener((evt)->{
            lstPrevOrders.setItems(FXCollections.observableList(OrderManagerController.this.model.getOrders()));
            OrderManagerController.this.btnOrderdetailsClicked();
        });
        
        List<Order> orders = this.model.getOrders();
        orders.forEach(new Consumer<Order>() {
            @Override
            public void accept(Order c) {
                Button btn = new Button();
                btn.setOnAction(evt -> {
                    OrderManagerController.this.model.addOrder(c);
                });
                boxButtons.getChildren().add(btn);
            }
        });
        
        
    }

}
    
   
    
     //public void setModel(OrderManager model) {
    //     this.model = model;
    //     List<Order> orders = this.model.getOrders();
    //     
    //     lstPrevOrders.setItems(FXCollections.observableArrayList(orders));
    //}
  
        

       

    
    

    
     
    
   
       
        

    

    
        
    
      
    
        
    
    
    
    
