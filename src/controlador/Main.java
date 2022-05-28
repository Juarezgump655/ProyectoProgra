/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ajuar
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
      try{
        FXMLLoader loader = new FXMLLoader ();   
       
        loader.setLocation(Main.class.getResource("/vista/Login.fxml"));
        //Cargamos Nuestra ventana
        Pane ventana = (Pane) loader.load();
        // Cargamos el scene
        Scene scene = new Scene(ventana);
       
        // Seteo la scene y la muestro
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        /*
         stage.initStyle(StageStyle.TRANSPARENT);
     */
         }catch(IOException e){
             System.out.println(e.getMessage());
             
            
        }
    }
    
}
