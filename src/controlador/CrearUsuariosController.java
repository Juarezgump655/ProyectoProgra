/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.Organizaciones;
import modelo.Usuario;

/**
 * FXML Controller class
 *
 * @author ajuar
 */
public class CrearUsuariosController implements Initializable {

    @FXML
    private Pane GestionarUsuarios;
    @FXML
    private TextField txtCodigoUs;
    @FXML
    private ImageView icon11;
    @FXML
    private ImageView icon21;
    @FXML
    private ImageView icon31;
    @FXML
    private TextField txtNombreusuario;
    @FXML
    private TextField txtCorreoUsuario;
    @FXML
    private Label lblAvisoCorreoUS;
    @FXML
    private TextField txtTelUsuario;
    @FXML
    private ImageView icon41;
    @FXML
    private Label lblAvisoTelefono;
    @FXML
    private TextField txtDirecUsuario;
    @FXML
    private Button buttCrearUsuario;
    @FXML
    private Label lblAvisonU;
    @FXML
    private Label lblcodigo;
    @FXML
    private PasswordField labelContraseña;
    @FXML
    private TextField txtNombreUs;
    @FXML
    private Label lblAvisoNombre;
    @FXML
    private Label lblAvisoContraseña;
    @FXML
    private RadioButton bttAdiministrador;
    @FXML
    private RadioButton bttUsuario;
    @FXML
    private ImageView iconContra;
    @FXML
    private ImageView iconNombre;
    @FXML
    private ImageView iconCrearUsuario;
    private ObservableList<Usuario> Usuarios;
    private Usuario usuario1;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Image crearUsuario = new Image ("iconos/iconUsuarios.png");
       iconCrearUsuario.setImage(crearUsuario);
 
       Image iconoCorreo = new Image ("iconos/Correo.png");
    
       icon31.setImage(iconoCorreo);
      
       Image iconoNome = new Image ("iconos/Nombre.png");
     
       icon21.setImage(iconoNome);
     
       
       Image iconoNumeral = new Image ("iconos/Numeral.png");
      
       icon11.setImage(iconoNumeral);
       
       Image iconoTelefono = new Image ("iconos/Telefono.png");
      
       icon41.setImage(iconoTelefono);
       

       Image iconoContra = new Image ("iconos/iconContra.png");
       iconContra.setImage(iconoContra);
       
       Image iconoNom = new Image ("iconos/iconNombre.png");
       iconNombre.setImage(iconoNom);
    }    

    @FXML
    private void verificarUS(KeyEvent event) {
     if(verificarCodigo(txtCodigoUs.getText())  ){
            lblcodigo.setVisible(false);    
        }else{
            lblcodigo.setVisible(true);
        }
       if(verificarNombre(txtNombreUs.getText())){
            lblAvisoNombre.setVisible(false);    
        }else{
            lblAvisoNombre.setVisible(true);
        }
       if(verificarNombre(txtNombreusuario.getText())){
            lblAvisonU.setVisible(false);    
        }else{
            lblAvisonU.setVisible(true);
        }
        if(verificarCorreo(txtCorreoUsuario.getText())){
            lblAvisoCorreoUS.setVisible(false);    
        }else{
            lblAvisoCorreoUS.setVisible(true);
        }
         if(verificarContraseña(labelContraseña.getText()) ){
            lblAvisoContraseña.setVisible(false);    
        }else{
            lblAvisoContraseña.setVisible(true);
        }
        if (!verificarNumero (txtTelUsuario.getText()) || txtTelUsuario.getText().length() > 8) {   // .length es para que se verfirique el txtTel que tenga el numero de caracteres asignado por nosotros
            lblAvisoTelefono.setVisible(true);    
        }else{
            lblAvisoTelefono.setVisible(false);
        }      
    }
    public void initAttributtes(ObservableList<Usuario> Usuarios) {
   this.Usuarios = Usuarios;
    }

    @FXML
    private void CrearUsuario(ActionEvent event) {
        String codigoOrgUs = this.txtCodigoUs.getText();
        String nombreUs = this.txtNombreusuario.getText();
        String Contraseña = this.labelContraseña.getText();
        String direccionUs = this.txtDirecUsuario.getText();
        String telefonoUs  = this.txtTelUsuario.getText();
        String correoUs = this.txtCorreoUsuario.getText();
        String Nombre = this.txtNombreUs.getText();
        String TipoU = "A";
        if(this.bttAdiministrador.isSelected()){
             TipoU = "A";
        } 
        if(this.bttUsuario.isSelected()){
             TipoU = "U";
        } 
        Usuario Usuario = new Usuario(codigoOrgUs, "",TipoU, nombreUs, Contraseña, Nombre, 
                correoUs, telefonoUs, direccionUs );
        
         if (!verificarCodigo(txtCodigoUs.getText())  || !verificarNombre(txtNombreUs.getText())
                || !verificarNombre(txtNombreusuario.getText()) ||!verificarCorreo(txtCorreoUsuario.getText()) || !verificarContraseña(labelContraseña.getText())|| 
                  !verificarNumero (txtTelUsuario.getText()) ) {

                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("DATOS INCORRECTOS"
                        + "\nPORFAVOR VERIFIQUE LOS DATOS");
                alert.showAndWait(); 
             }
              else{
             if (txtTelUsuario.getText().length() >8) {
                  
                 
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("DATOS INCORRECTOS"
                            + "\nPORFAVOR VERIFIQUE EL NUMERO DE TELEFONO");
            alert.showAndWait();    
               }else {
              this.usuario1 = Usuario;
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setHeaderText(null);
              alert.setTitle("Informacion");
              alert.setContentText("SE HA CREADO EL USARIO CORRECTAMENTE");
              alert.showAndWait();
              
               Stage myStage = (Stage) this.buttCrearUsuario.getScene().getWindow();
         myStage.close();
              }
         }
        
        
    }
      private boolean verificarNumero (String telefono) {  
        Pattern patron = Pattern.compile("[0-9]{8}");
        Matcher mat = patron.matcher(telefono);
        return mat.find();
  
    }
    
    private boolean verificarCodigo (String codigo) { 
        Pattern patron = Pattern.compile("[A-Za-z0-9]{1,}"); 
        Matcher mat = patron.matcher(codigo);    
        return mat.find();
        
    }
     
    private boolean verificarCorreo(String correo) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9"
                + "-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();
        
    }
    private boolean verificarNombre(String correo) {
        
        Pattern patron = Pattern.compile("[A-Za-z0-9]{1,}");
        Matcher mat = patron.matcher(correo);
        return mat.find();
        
        
    }
     private boolean verificarContraseña (String contraseña) {
       
        String cadena = contraseña;
        Boolean mayus = false;
        Boolean minus = false;
        Boolean num = false;
        Boolean car = false;
        Boolean lar = false;
        for (int i = 0; i < cadena.length(); i++) {

            if (Character.isUpperCase(cadena.charAt(i))) {
                mayus = true;
            }
            else if (Character.isLowerCase(cadena.charAt(i))) {
                minus = true;
            }
            else if (Character.isDigit(cadena.charAt(i))) {
                num = true;
            }
            else {
                car = true;
            }
        }
       if (cadena.length() >= 8) {
           lar = true;
       }
        if( mayus==true && minus==true && num==true && car==true && lar==true){
            return true;
        }else {
            return false;
        }
     
     
    }
     public Usuario getUsuario (){
        return usuario1;
    }
     
   
        
     
        
        
        
  }
     
     

