package uk.ac.rgu.cm2100;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import uk.ac.rgu.cm2100.controllers.Controller;
import uk.ac.rgu.cm2100.model.managers.MenuManager;
import uk.ac.rgu.cm2100.model.Model;
import uk.ac.rgu.cm2100.model.managers.OrderManager;

/**
 * JavaFX MainApp
 * Edited by: Teodora Kis 1804944
 */
public class MainApp extends Application {

    /* These static models can be used across different views while persisting data */
    public static final MenuManager menu = new MenuManager();
    public static final OrderManager orderManager = new OrderManager();

    /* The scene that is currently displayed */
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
              
        scene = new Scene(loadFXML("launchscreen", null), 640, 480);

        scene.getStylesheets().add("styles/default.css"); //loads a default stylesheet - helps fix some character encoding issues on some platforms...

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Sets the root of the scene using the given fxml file and model
     *
     * @param fxml
     * @param model
     * @throws IOException
     */
    
    static void setRoot(String fxml, Model model) throws IOException {
        
        /* quick hack to strip the .fxml extension if provided by mistake */
        if (fxml.endsWith(".fxml")) {
            fxml = fxml.split(".")[0];
        }
        
        /* Use the loadFXML method to get the root (Parent) and set the model */
        scene.setRoot(loadFXML(fxml, model));
    }

    private static Parent loadFXML(String fxml, Model model) throws IOException {

        /* Create the FXMLLoader and load the given fxml file */
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));

        /* Load the fxml into a parent */
        Parent parent = fxmlLoader.load();

        /* Get the controller and set the model */
        //Controller controller = fxmlLoader.getController();
        //controller.setModel(model);

        /* Return the parent for rendering in the scene */
        return parent;
    }

    public static void main(String[] args) {
        launch();
    }
}
