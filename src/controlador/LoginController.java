/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ajuar
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtnombreUsuario;
    @FXML
    private PasswordField txtCohntraseña;
    @FXML
    private ImageView iconFondo;
    @FXML
    private ImageView iconLogo;
    @FXML
    private Button buttCrearrec;
    @FXML
    private Label labelCerar;
    
   String nombreUsuario, contraseñaUsuario;
    
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Image fondo = new Image ("iconos/city.png");
       iconFondo.setImage(fondo);
       
       Image logo = new Image ("iconos/logo.png");
       iconLogo.setImage(logo);
    }    

    @FXML
    private void iniciarSesion(ActionEvent event) {
      if( verificarInicio(txtnombreUsuario.getText(),txtCohntraseña.getText())){
             try{
            FXMLLoader loader = new FXMLLoader ();   

            loader.setLocation(Main.class.getResource("/vista/VistaMenu.fxml"));
            Parent root = loader.load();

          
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            
            // Ciero la ventana donde estoy
            Stage myStage = (Stage) this.buttCrearrec.getScene().getWindow();
            myStage.close();
            
             }catch(IOException e){
                 System.out.println(e.getMessage());      
                 }
      }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("NOMBRE DE USUARIO O CONTRASEÑA INCORRECTOS"
                        + "\nPORFAVOR VERIFIQUE LOS DATOS");
                alert.showAndWait(); 
      }
         
         
         
         
         
    }

    @FXML
    private void Cambiarcolor(MouseEvent event) {
           labelCerar.setStyle("-fx-background-color:transparent;"); 
    }

    @FXML
    private void CambiarColor(MouseEvent event) {
          labelCerar.setStyle("-fx-background-color: red;");
    }

    @FXML
    private void CerrarAplicacion(MouseEvent event) {
        Stage myStage = (Stage) this. labelCerar.getScene().getWindow();
         myStage.close();
    }
    
    public boolean verificarInicio (String nombreUsuario, String contraseñaUsuario){
        Boolean Nombre = false;
        Boolean Contra = false;
         if("Usuario".equals(nombreUsuario))  {
            Nombre = true;
         }
        if("Usuario123".equals(contraseñaUsuario)) {
             Contra = true;
         }
        if( Nombre==true && Contra==true){
            return true;
        }else {
            return false;
        }
     
    }
    
}
