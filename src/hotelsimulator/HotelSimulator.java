package hotelsimulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interfaces.IVorm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import DataStructuur.Elements;
import DataStructuur.HotelElements;

/**
 *
 * @author Mollaiedaryani
 */
public class HotelSimulator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
         //get vormFactory    
        HotelElements abFactory = Elements.getFactory("vorm");
        
        //get an object of vorm bioscoop
        IVorm vf = abFactory.getVorm("Bioscoop");
        
        //call teken method of vorm Bioscoop
        vf.teken();


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
