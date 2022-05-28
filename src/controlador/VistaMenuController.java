/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.S;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Organizaciones;
import modelo.Recursos;
import modelo.Usuario;

/**
 * FXML Controller class
 *
 * @author ajuar
 */
public class VistaMenuController implements Initializable {

  @FXML
    private Label labelCerar;
    @FXML
    private Pane bttCrearORg;
    @FXML
    private Pane bttGestionarUsuario;
    @FXML
    private Pane bttGesionarRecursos;
    @FXML
    private Pane bttGGestionarSolicitud;
    @FXML
    private Pane bttAprobarSolicitud;
    @FXML
    private Pane bttEntregar;
    @FXML
    private Pane PanelRegresar;
    @FXML
    private ImageView imageFlecha;
    @FXML
    private Label labelGestionar;
    @FXML
    private Pane GestionarOrg;
    @FXML
    private TextField txtCodigo;
    @FXML
    private ImageView icon1;
    @FXML
    private ImageView icon2;
    @FXML
    private ImageView icon3;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCorreo;
    @FXML
    private Label lblAviso;
    @FXML
    private TextField txtTel;
    @FXML
    private ImageView icon4;
    @FXML
    private Label lblAviso1;
    @FXML
    private TextField txtDirec;
    @FXML
    private ImageView imageCrear;
    @FXML
    private Button buttCrearOrganizacion;
    @FXML
    private Label lblAviso13;
    @FXML
    private Label lblAviso12;
    @FXML
    private TableView  <Organizaciones>  tableOrg;
    @FXML
    private TableColumn columCodorg;
    @FXML
    private TableColumn  columNomorg;
    @FXML
    private TableColumn  columCorreoorg;
    @FXML
    private TableColumn columTelorg;
    @FXML
    private TableColumn  columDireorg;
    @FXML
    private Button bttModificarOrganizacion;
    @FXML
    private Button bttInactivarOrg;
    
    private ObservableList<Usuario> Usuarios;
    private ObservableList<Organizaciones> Org;
     private ObservableList<Recursos> rec;
    @FXML
    private Label labelHora;
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
    private TextField txtTelUsuario;
    @FXML
    private ImageView icon41;
    @FXML
    private TextField txtDirecUsuario;
    @FXML
    private Button buttCrearUsuario;
    @FXML
    private Label lblAvisonU;
    @FXML
    private Label lblcodigo;
    @FXML
    private TableView <Usuario>  tableUsuarios;
    @FXML
    private TableColumn  columCodigoUs;
    @FXML
    private TableColumn columNombreUs;
    @FXML
    private TableColumn columNombreusuario;
    @FXML
    private TableColumn  columTellUs;
    @FXML
    private TableColumn  columCorreoUs;
    @FXML
    private TableColumn  columDicUs;
    @FXML
    private Button bttModificarUsuario;
    @FXML
    private Button bttInactivarUsuario;
    @FXML
    private PasswordField labelContraseña;
    @FXML
    private Label lblAvisoNombre;
    @FXML
    private Label lblAvisoContraseña;
    @FXML
    private RadioButton bttAdiministrador;
    @FXML
    private RadioButton bttUsuario;
    @FXML
    private ImageView iconCrearUsuario;
    @FXML
    private ImageView iconContra;
    @FXML
    private ImageView iconNombre;
    @FXML
    private Label labelGestionarUs;
    @FXML
    private TextField txtNombreUs;
    @FXML
    private Label lblAvisoCorreoUS;
    @FXML
    
    private Label lblAvisoTelefono;
    @FXML
    private Pane gestionarRecurso;
    @FXML
    private TextField txtCodigoRec;
    @FXML
    private ImageView icon12;
    @FXML
    private ImageView icon22;
    @FXML
    private TextField txtNombreRec;
    @FXML
    private TextField txtCosto;
    @FXML
    private Label lblCosto;
    @FXML
    private Button buttCrearrec;
    @FXML
    private Label lblAvisoNombreRec;
    @FXML
    private Label lblcodigoRec;
    @FXML
    private TableView<Recursos> tableRecursos;
    @FXML
    private TableColumn ColumCodrec;
    @FXML
    private TableColumn  columNomRec;
    @FXML
    private TableColumn  columUsuariorec;
    @FXML
    private TableColumn columTiempomax;
    @FXML
    private TableColumn  columCosto;
    @FXML
    private Button bttModiificarRecurso;
    @FXML
    private Button bttinactivarRecurso;
    @FXML
    private TextField txtTiempom;
    @FXML
    private Label lblAtime;
    @FXML
    private RadioButton bttsiapro;
    @FXML
    private RadioButton bttNoapro;
    @FXML
    private RadioButton bttsiconfi;
    @FXML
    private RadioButton bttnoconfi;
    @FXML
    private ImageView IconCosto;
    @FXML
    private ImageView iconTIme;
    @FXML
    private ImageView IconApro;
    @FXML
    private ImageView iconRequiere;
    @FXML
    private Label labelGestionarRec;
    @FXML
    private TableColumn columnCodigoOrg;
    @FXML
    private TextField txtCodigoOrgUs;
    @FXML
    private Label lablelCodA;
    @FXML
    private TextField txtCodigoUsA;
    @FXML
    private TextField txtCodigoUR;
    @FXML
    private TextField txtCodigoUE;
    @FXML
    private Label lablelCodE;
    @FXML
    private Label lablelCodR;
    @FXML
    private TextField txtCodigoOrgRec;
    @FXML
    private Label lblcodigoOrgRec;
    @FXML
    private Pane bttGenerarReportes;
    @FXML
    private Pane bttPaginaprincipal;
    @FXML
    private Label PaginaPrincipal;
    @FXML
    private Pane pagiinaPrincipal;
    @FXML
    private ImageView imagedescarga;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Org = FXCollections.observableArrayList();
       Usuarios = FXCollections.observableArrayList();
       rec =FXCollections.observableArrayList();;
        // tabla Organizaciones
        this.tableOrg.setItems(Org);
        this.columCodorg.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columNomorg.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columCorreoorg.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.columDireorg.setCellValueFactory(new PropertyValueFactory("telefono"));        //le decimos a nuestra tabla con que atributo se asoicia cada columna
        this.columTelorg.setCellValueFactory(new PropertyValueFactory("correoElectronico"));
      
        
        // tabla Usuarios
        this.tableUsuarios.setItems(Usuarios);
        this.columCodigoUs.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columnCodigoOrg.setCellValueFactory(new PropertyValueFactory("organizacion"));
        this.columNombreusuario.setCellValueFactory(new PropertyValueFactory("nombreUsuario"));
        this.columNombreUs.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columCorreoUs.setCellValueFactory(new PropertyValueFactory("correoElectronico"));
        this.columDicUs.setCellValueFactory(new PropertyValueFactory("direccion"));        //le decimos a nuestra tabla con que atributo se asoicia cada columna
        this.columTellUs.setCellValueFactory(new PropertyValueFactory("telefono"));
        
        this.tableRecursos.setItems(rec);
        this.ColumCodrec.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columUsuariorec.setCellValueFactory(new PropertyValueFactory("organizacion"));
        this.columNomRec.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columTiempomax.setCellValueFactory(new PropertyValueFactory("tiempoMaximoUso"));
        this.columCosto.setCellValueFactory(new PropertyValueFactory("costo"));        //le decimos a nuestra tabla con que atributo se asoicia cada columna
      
       
        
//Se grea Toggle group para que solo se selecicione un Radio button
      ToggleGroup tg = new  ToggleGroup();
      this.bttAdiministrador.setToggleGroup(tg);
      this.bttUsuario.setToggleGroup(tg);
      
      ToggleGroup tg1 = new  ToggleGroup();
      this.bttsiapro.setToggleGroup(tg1);
      this.bttNoapro.setToggleGroup(tg1);
      
      ToggleGroup tg2 = new  ToggleGroup();
      this.bttsiconfi.setToggleGroup(tg2);
      this.bttnoconfi.setToggleGroup(tg2);
       // Esto nos permite obtener la fecha actual para poder mostrarla
        Calendar calendario = Calendar.getInstance();
        int anio = calendario.get(Calendar.YEAR);
        int dia = calendario.get(Calendar.DATE);
        labelHora.setText("Hoy es " + dia +" de junio" +" de " + anio );
        
        
        
          //setetamos las imagenes para que se muestren en nuestro programa
       Image crearUsuario = new Image ("iconos/iconUsuarios.png");
       iconCrearUsuario.setImage(crearUsuario);
       
       Image crear = new Image ("iconos/Crear2.png");
       imageCrear.setImage(crear);
       
       Image iconoCorreo = new Image ("iconos/Correo.png");
       icon3.setImage(iconoCorreo);
       icon31.setImage(iconoCorreo);
      
       Image iconoNome = new Image ("iconos/Nombre.png");
       icon2.setImage(iconoNome);
       icon21.setImage(iconoNome);
       icon22.setImage(iconoNome);
       
       Image iconoNumeral = new Image ("iconos/Numeral.png");
       icon1.setImage(iconoNumeral);
       icon11.setImage(iconoNumeral);
        icon12.setImage(iconoNumeral);
       Image iconoTelefono = new Image ("iconos/Telefono.png");
       icon4.setImage(iconoTelefono);
       icon41.setImage(iconoTelefono);
       
       Image iconoFlecha = new Image ("iconos/Flecha.png");
       imageFlecha.setImage(iconoFlecha);
        
       Image iconoContra = new Image ("iconos/iconContra.png");
       iconContra.setImage(iconoContra);
       
       Image iconoNom = new Image ("iconos/iconNombre.png");
       iconNombre.setImage(iconoNom);
       
       Image iconoTime = new Image ("iconos/reloj.png");
       iconTIme.setImage(iconoTime);
       
       Image iconoRequiere = new Image ("iconos/aprobado.png");
       iconRequiere.setImage(iconoRequiere);
      
       Image iconConfirmacion = new Image ("iconos/confirmar.png");
       IconApro.setImage(iconConfirmacion);
       
       Image iconCosto = new Image ("iconos/Dolar.png");
       IconCosto.setImage(iconCosto);
       
       Image iconPrincipal = new Image("iconos/descarga.png");
       imagedescarga.setImage(iconPrincipal);
       
      labelGestionar.setVisible(false);
      labelGestionarUs.setVisible(false);
    
       
       
    }    
    @FXML
    private void CerrarAplicacion(MouseEvent event) {
        Stage myStage = (Stage) this. labelCerar.getScene().getWindow();
         myStage.close();
    }
    @FXML
    private void GestionarOrg(MouseEvent event) {
        GestionarOrg.setVisible(true);
         labelGestionar.setVisible(true);
          GestionarUsuarios.setVisible(false);
           labelGestionarUs.setVisible(false);
           gestionarRecurso.setVisible(false);
           labelGestionarRec.setVisible(false);
             PaginaPrincipal.setVisible(false);
               pagiinaPrincipal.setVisible(false);
    }
    @FXML
    private void GesrionarUsuario(MouseEvent event) {
       labelGestionarUs.setVisible(true);
       GestionarUsuarios.setVisible(true);
       GestionarOrg.setVisible(false);
       labelGestionar.setVisible(false);
       gestionarRecurso.setVisible(false);
       labelGestionarRec.setVisible(false);
         PaginaPrincipal.setVisible(false);
           pagiinaPrincipal.setVisible(false);
         
    }
    @FXML
    private void GestionarRecursos(MouseEvent event) {
      GestionarOrg.setVisible(false);
      GestionarUsuarios.setVisible(false);
      gestionarRecurso.setVisible(true);
      labelGestionarRec.setVisible(true);
      labelGestionar.setVisible(false);
      labelGestionarUs.setVisible(false);
        PaginaPrincipal.setVisible(false);
          pagiinaPrincipal.setVisible(false);
    }
    @FXML
    private void gestionarPaginaprincipal(MouseEvent event) {
        pagiinaPrincipal.setVisible(true);
        PaginaPrincipal.setVisible(true);
         GestionarOrg.setVisible(false);
       labelGestionar.setVisible(false);
       gestionarRecurso.setVisible(false);
       labelGestionarRec.setVisible(false);
       gestionarRecurso.setVisible(false);
      labelGestionarRec.setVisible(false);
       
       
    }

    @FXML
    private void GestionarSolicitud(MouseEvent event) {
    }

    @FXML
    private void menuAprobarSolicitud(MouseEvent event) {
    }

    @FXML
    private void menuEntregar(MouseEvent event) {
    }
    //Hacemos un efecto hover cambiando el backgraud de los panel cuando el mause entre o salga
   @FXML
    private void cambiarColorOrgs(MouseEvent event) {
          bttCrearORg.setStyle("-fx-background-color: #516FFF;"); 
    }
    @FXML
    private void cambiarColorOrg(MouseEvent event) {
        bttCrearORg.setStyle("-fx-background-color: #70B4FC;");                                                                                            
    }
      @FXML
    private void CambiarColorUsuarioS(MouseEvent event) {
        bttGestionarUsuario.setStyle("-fx-background-color: #516FFF;");
    }
    @FXML
    private void CambiarColorUsuario(MouseEvent event) {
         bttGestionarUsuario.setStyle("-fx-background-color: #70B4FC;");
    }
  
   @FXML
    private void Cambiarcolorregresar(MouseEvent event) {
          PanelRegresar.setStyle("-fx-background-color: #516FFF;");
    }
    @FXML
    private void CambiarColorregresar(MouseEvent event) {
          PanelRegresar.setStyle("-fx-background-color: #8FC5FF;");
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
    private void cambiarRecsalir(MouseEvent event) {
        bttGesionarRecursos.setStyle("-fx-background-color: #516FFF;");  
    }
    @FXML
    private void cambiarRecentrar(MouseEvent event) {
         bttGesionarRecursos.setStyle("-fx-background-color: #70B4FC;");
    }
     @FXML
    private void colorGenerarSalir(MouseEvent event) {
      
        bttGenerarReportes.setStyle("-fx-background-color: #516FFF;");  
    }

    @FXML
    private void colorGenerarEntrar(MouseEvent event) {
          bttGenerarReportes.setStyle("-fx-background-color: #70B4FC;");
    }
     @FXML
    private void cambiarColorpagsalir(MouseEvent event) {
          
                  bttPaginaprincipal.setStyle("-fx-background-color: #516FFF;");  
    }

    @FXML
    private void cambiarColorpagentrar(MouseEvent event) {
        bttPaginaprincipal.setStyle("-fx-background-color: #70B4FC;");
    }

    
      @FXML
    private void colorCambiar(MouseEvent event) {
    }

    @FXML
    private void regrear(MouseEvent event) {
            try{
            FXMLLoader loader = new FXMLLoader ();   

            loader.setLocation(Main.class.getResource("/vista/Login.fxml"));
            Parent root = loader.load();

            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            // Ciero la ventana donde estoy
            Stage myStage = (Stage) this.PanelRegresar.getScene().getWindow();
            myStage.close();
             }catch(IOException e){
                 System.out.println(e.getMessage());      
                 }
    }

    @FXML
    private void xd(KeyEvent event) {
         // Verificaddores del menu Organizaciones
          if (verificarCorreo(txtCorreo.getText())) {
            lblAviso.setVisible(false);    
        }else{
            lblAviso.setVisible(true);
        }
           if (verificarCodigo(txtCodigo.getText())) {
            lblAviso12.setVisible(false);    
        }else{
            lblAviso12.setVisible(true);
        }
        if (!verificarNumero (txtTel.getText()) || txtTel.getText().length() > 8) {   // .length es para que se verfirique el txtTel que tenga el numero de caracteres asignado por nosotros
            lblAviso1.setVisible(true);    
        }else{
            lblAviso1.setVisible(false);
        }       
        if (verificarNombre(txtNombre.getText())) {             
            lblAviso13.setVisible(false);    
        }else{
            lblAviso13.setVisible(true);
        }
    }

    @FXML
    private void CrearOrganizacion(ActionEvent event) {
       String nombre = this.txtNombre.getText();
        String codigoOrg = this.txtCodigo.getText();
        String direccion = this.txtDirec.getText();
        String telefono  = this.txtTel.getText();
        String correo = this.txtCorreo.getText();
        
        //creo una organizacion
         Organizaciones Organizacion = new Organizaciones (codigoOrg, nombre, direccion,  telefono, correo);
        
        // verificamos el formato los txt donde se recibe la informacion
         if (!verificarCorreo(txtCorreo.getText()) || !verificarNumero (txtTel.getText()) 
                || !verificarCodigo(txtCodigo.getText()) ||!verificarNombre(txtNombre.getText())
                 || this.Org.contains(Organizacion)   ) {
     
             
             if (this.Org.contains(Organizacion) ){
             Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("LA ORGANIZACION YA EXISTE");
              alert.showAndWait();  
             }
             else{
               
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("DATOS INCORRECTOS"
                        + "\nPORFAVOR VERIFIQUE LOS DATOS");
                alert.showAndWait(); 
             }
              }else{
             if (txtTel.getText().length() >8) {
                  
                 
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("DATOS INCORRECTOS"
                            + "\nPORFAVOR VERIFIQUE EL NUMERO DE TELEFONO");
            alert.showAndWait();    
               }else {
              this.Org.add (Organizacion);
              this.tableOrg.setItems(Org);
              
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setHeaderText(null);
              alert.setTitle("Informacion");
              alert.setContentText("SE HA CREADO LA ORGANIZACION CORRECTAMENTE\n" + "AHORA DEBES CREAR UN USUARIO" );
              alert.showAndWait();
              
               try{
             // Cargo la vista
            FXMLLoader loader = new FXMLLoader ();   
  
            loader.setLocation(Main.class.getResource("/vista/CrearUsuarios.fxml"));
            // Cargo la ventana
            Parent root = loader.load();
            
            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.showAndWait();
            
            CrearUsuariosController controlador = loader.getController();
            controlador.initAttributtes(Usuarios);
            
            Usuario U = controlador.getUsuario();
            U.setOrganizacion(codigoOrg);
             if (U != null) {
                // Añado la persona
               Usuarios.add(U);
               
                // Refresco la tabla
                this.tableUsuarios.refresh();
            }

           
             }catch(IOException ex){
            Alert aalert = new Alert(Alert.AlertType.ERROR);
            aalert.setHeaderText(null);
            aalert.setTitle("Error");
            aalert.setContentText(ex.getMessage());
            aalert.showAndWait();     
            }
               
               
              txtCodigo.clear();
               txtCorreo.clear();
                txtDirec.clear();    //limpiamos los textfield para ingresar nueva informacion
                 txtNombre.clear();
                  txtTel.clear();

              }
         }
       

    }
   
    
    

    @FXML
    private void seleccionarOrg(MouseEvent event) {
        
        Organizaciones Organizacion =this.tableOrg.getSelectionModel().getSelectedItem();
        
       
       if(Organizacion != null){
 
           this.txtCodigo.setText(Organizacion.getCodigo());
           this.txtNombre.setText(Organizacion.getNombre());
           this.txtCorreo.setText(Organizacion.getCorreoElectronico());
           this.txtDirec.setText(Organizacion.getDireccion());
           this.txtTel.setText(Organizacion.getTelefono());
           
           txtCodigo.setEditable(false);
           txtNombre.setEditable(false);
          buttCrearOrganizacion.setVisible(false);
       }
    }

    @FXML
    private void modificarOrganizacion(ActionEvent event) {
        Organizaciones Organizacion =this.tableOrg.getSelectionModel().getSelectedItem();
         
       if (Organizacion==null){       
           Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("DEBE SELECCIONAR UNA PERSONA");
              alert.showAndWait();  
         } else { 
           try {
               
           
        String nombre = this.txtNombre.getText();
        String codigoOrg = this.txtCodigo.getText();
        String direccion = this.txtDirec.getText();
        String telefono  = this.txtTel.getText();
        String correo = this.txtCorreo.getText();
          
      Organizaciones Organizacion1 = new Organizaciones (codigoOrg, nombre, direccion,  telefono, correo); 
      
  
        if (!this.Org.contains(Organizacion1)){
              Organizacion.setCodigo((Organizacion1.getCodigo()));
              Organizacion.setNombre(Organizacion1.getNombre());
              Organizacion.setDireccion(Organizacion1.getDireccion());
              Organizacion.setCorreoElectronico(Organizacion1.getCorreoElectronico());
              Organizacion.setTelefono(Organizacion1.getTelefono());
            
               
               this.tableOrg.refresh();
               
           txtCodigo.setEditable(true);
           txtNombre.setEditable(true);
           
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("ORGANIZACION MODIFICADA");
                  alert.showAndWait();  
                  
               txtCodigo.clear();
               txtCorreo.clear();
                txtDirec.clear();    //limpiamos los textfield para ingresar nueva informacion
                 txtNombre.clear();
                  txtTel.clear();
              buttCrearOrganizacion.setVisible(true);
              
             
               
               
            }else {

                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("LA ORGANIZACION YA EXISTE");
                  alert.showAndWait();   
             }
      
        }catch (NumberFormatException e) {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("FORMATO INCORRECTO");
                  alert.showAndWait();  
        }
     
        }
    }

    @FXML
    private void InactivarOrg(ActionEvent event) {
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("SE HA INACTIVADO LA ORGANIZACION");
                  alert.showAndWait();
    }

    @FXML
    private void verificarUS(KeyEvent event) {
         // Verificadores del menu Usuario
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
        if (!verificarCodigo(txtCodigoOrgUs.getText())) {   // .length es para que se verfirique el txtTel que tenga el numero de caracteres asignado por nosotros
            lblcodigo.setVisible(true);    
        }else{
            lblcodigo.setVisible(false);
        }     
    }

    @FXML
    private void CrearUsuario(ActionEvent event) {
        
        String codigoOrgUs = this.txtCodigoUs.getText();
        String nombreUs = this.txtNombreusuario.getText();
        String Codorg = this.txtCodigoOrgUs.getText();
        String Contraseña = this.labelContraseña.getText();
        String direccionUs = this.txtDirecUsuario.getText();
        String telefonoUs  = this.txtTelUsuario.getText();
        String correoUs = this.txtCorreoUsuario.getText();
        String Nombre = this.txtNombreUs.getText();
        String TipoU = "U";
        if(this.bttAdiministrador.isSelected()){
             TipoU = "A";
        } 
        if(this.bttUsuario.isSelected()){
             TipoU = "U";
        } 
        
        Usuario Usuario = new Usuario(codigoOrgUs,Codorg ,TipoU, nombreUs, Contraseña, Nombre, 
                correoUs, telefonoUs, direccionUs  );
        
        if (!verificarCodigo(txtCodigoUs.getText())  || !verificarNombre(txtNombreUs.getText())
                || !verificarNombre(txtNombreusuario.getText()) ||!verificarCorreo(txtCorreoUsuario.getText()) || !verificarContraseña(labelContraseña.getText())|| 
                this.Usuarios.contains(Usuario) ||  !verificarNumero (txtTelUsuario.getText()) ||  verificarCodigo(Codorg)) {
     
          
            if (this.Usuarios.contains(Usuario) ){
             Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("EL USUARIO YA EXISTE");
              alert.showAndWait();  
             }else{
               
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("DATOS INCORRECTOS"
                        + "\nPORFAVOR VERIFIQUE LOS DATOS");
                alert.showAndWait(); 
             }
              }else{
             if (txtTel.getText().length() >8) {
                  
                 
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("DATOS INCORRECTOS"
                            + "\nPORFAVOR VERIFIQUE EL NUMERO DE TELEFONO");
            alert.showAndWait();    
               }else {
              this.Usuarios.add (Usuario);
              this.tableUsuarios.setItems(Usuarios);
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setHeaderText(null);
              alert.setTitle("Informacion");
              alert.setContentText("SE HA CREADO EL USARIO CORRECTAMENTE");
              alert.showAndWait();
              
              txtCodigoUs.clear();
               txtCorreoUsuario.clear();
                txtDirecUsuario.clear();    //limpiamos los textfield para ingresar nueva informacion
                 labelContraseña.clear();
                  txtNombreusuario.clear();
                    txtNombreUs.clear();
                    txtTelUsuario.clear();
              }
         }
    }

    @FXML
    private void seleccionarUsuario(MouseEvent event) {
         Usuario Usuario =this.tableUsuarios.getSelectionModel().getSelectedItem();
        
       
       if(Usuario != null){
 
           this.txtCodigoUs.setText(Usuario.getCodigo());
           this.txtCodigoOrgUs.setText(Usuario.getOrganizacion());
           this.txtNombreusuario.setText(Usuario.getNombreUsuario());
           this.txtCorreoUsuario.setText(Usuario.getCorreoElectronico());
           this.txtDirecUsuario.setText(Usuario.getNombre());
           this.txtTelUsuario.setText(Usuario.getTelefono());
           this.txtNombreUs.setText(Usuario.getNombre());
           this.labelContraseña.setText(Usuario.getPassword());
          
          txtCodigoUs.setEditable(false);
          txtCodigoOrgUs.setVisible(false);
          buttCrearUsuario.setVisible(false);
       }
        
        
    }

    @FXML
    private void modificarUsuario(ActionEvent event) {
         Usuario  Usuario  =this.tableUsuarios.getSelectionModel().getSelectedItem();
       if (Usuario==null){       
           Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("DEBE SELECCIONAR UNA PERSONA");
              alert.showAndWait();  
         }   else { 
                   try {
                     String codigoOrgUs = this.txtCodigoOrgUs.getText();
                     String Codigo = this.txtCodigo.getText();
                    String nombreUs = this.txtNombreusuario.getText();
                     String Contraseña = this.labelContraseña.getText();
                    String direccionUs = this.txtDirecUsuario.getText();
                    String telefonoUs  = this.txtTelUsuario.getText();
                    String correoUs = this.txtCorreoUsuario.getText();
                    String Nombre = this.txtNombreUs.getText();
                    String TipoU = "U";
                    if(this.bttAdiministrador.isSelected()){
                         TipoU = "A";
                    } 
                    if(this.bttUsuario.isSelected()){
                         TipoU = "U";
                      }
       Usuario  Usuario1 = new Usuario (Codigo, codigoOrgUs,TipoU, nombreUs, Contraseña, Nombre, 
                correoUs, telefonoUs, direccionUs   ); 
      
                  if (!this.Usuarios.contains(Usuario1)){
                      
              Usuario.setCodigo((Usuario1.getCodigo()));
              Usuario.setOrganizacion((Usuario1.getOrganizacion()));
              Usuario.setNombreUsuario(Usuario1.getNombreUsuario());
              Usuario.setDireccion(Usuario1.getDireccion());
              Usuario.setCorreoElectronico(Usuario1.getCorreoElectronico());
              Usuario.setNombre(Usuario1.getNombre());
              Usuario.setPassword(Usuario1.getPassword());
              Usuario.setTipo(Usuario1.getTipo());
              Usuario.setTelefono(Usuario1.getTelefono());
            
               
               this.tableUsuarios.refresh();
               
           txtCodigoUs.setEditable(true);
          
           
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("USARIO MODIFICADO");
                  alert.showAndWait();  
                  
               txtCodigoUs.clear();
               txtCorreoUsuario.clear();
                txtDirecUsuario.clear();    //limpiamos los textfield para ingresar nueva informacion
                 txtNombreUs.clear();
                  txtTelUsuario.clear();
                  txtNombreusuario.clear();
                   labelContraseña.clear();
                  
              buttCrearUsuario.setVisible(true);
              
             
               
               
            }else {

                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("El USARIO YA EXISTE");
                  alert.showAndWait();   
             }
                       
                       
                        }catch (NumberFormatException e) {
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("FORMATO INCORRECTO");
                  alert.showAndWait();  
                   }
                   }
        
        
        
    }

    @FXML
    private void InactivarUsuario(ActionEvent event) {
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("SE HA INACTIVADO EL USUARIO");
                  alert.showAndWait();
    }

    @FXML
    private void verificarRecurso(KeyEvent event) {
        // Verificadores del menu Usuario
         if(verificarCodigo(txtCodigoRec.getText()) ){
            lblcodigoRec.setVisible(false);    
        }else{
            lblcodigoRec.setVisible(true);     
            }
           if(verificarCodigo(txtCodigoOrgRec.getText())){
            lblcodigoOrgRec.setVisible(false);    
        }else{
            lblcodigoOrgRec.setVisible(true);     
            }
           if(verificarInt(txtTiempom.getText())){
            lblAtime.setVisible(false);    
        }else{
            lblAtime.setVisible(true);     
            }
         
    }

    @FXML
    private void crearRecurso(ActionEvent event) {
        String codigo = this.txtCodigoRec.getText();
        String nombre = this.txtNombreRec.getText();
        String organizacion = this.txtCodigoOrgRec.getText();
        String requiere_apobacion = "no";
        if(this.bttsiapro.isSelected()){
             requiere_apobacion = "si";
        } 
        if(this.bttNoapro.isSelected()){
             requiere_apobacion = "no";
        } 
        String usuarioaprobacion = this.txtCodigoUsA.getText();
        String requiereconfi = "no";
         if(this.bttsiconfi.isSelected()){
             requiereconfi = "si";
        } 
        if(this.bttNoapro.isSelected()){
             requiereconfi = "no";
        } 
        String UsuarioR = this.txtCodigoUR.getText();
        String UsuairioE = this.txtCodigoUE.getText();
        String tiempoMax = this.txtTiempom.getText();
        String costo = this.txtCosto.getText();
        
        Recursos recurso = new Recursos (codigo,nombre ,organizacion, requiere_apobacion, usuarioaprobacion, requiereconfi, 
                UsuarioR, UsuairioE, tiempoMax, costo );
        
        
         if (!verificarCodigo(txtCodigoRec.getText())  || !verificarNombre(txtNombreRec.getText())
                || !verificarCodigo(txtCodigoOrgRec.getText()) ||
                this.rec.contains(recurso)|| !verificarInt(txtTiempom.getText()) ) {
     
          
            if (this.rec.contains(recurso) ){
             Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("EL RECURSO YA EXISTE");
              alert.showAndWait();  
             }else{
               
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("DATOS INCORRECTOS"
                        + "\nPORFAVOR VERIFIQUE LOS DATOS");
                alert.showAndWait(); 
             }
              } else
              this.rec.add (recurso);
              this.tableRecursos.setItems(rec);
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setHeaderText(null);
              alert.setTitle("Informacion");
              alert.setContentText("SE HA CREADO EL USARIO CORRECTAMENTE");
              alert.showAndWait();
              
               txtCodigoRec.clear();
               txtCodigoOrgRec.clear();
                txtNombreRec.clear();    //limpiamos los textfield para ingresar nueva informacion
                 txtTiempom.clear();
                  txtCosto.clear();
                      } 


    @FXML
    private void ModificarRecurso(ActionEvent event) {
        Recursos  recurso  =this.tableRecursos.getSelectionModel().getSelectedItem();
       if (recurso==null){       
           Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("DEBE SELECCIONAR UNA PERSONA");
              alert.showAndWait();  
         }   else { 
                   try {
                    String codigo = this.txtCodigoRec.getText();
        String nombre = this.txtNombreRec.getText();
        String organizacion = this.txtCodigoOrgRec.getText();
        String requiere_apobacion = "no";
        if(this.bttsiapro.isSelected()){
             requiere_apobacion = "si";
        } 
        if(this.bttNoapro.isSelected()){
             requiere_apobacion = "no";
        } 
        String usuarioaprobacion = this.txtCodigoUsA.getText();
        String requiereconfi = "no";
         if(this.bttsiconfi.isSelected()){
             requiereconfi = "si";
        } 
        if(this.bttNoapro.isSelected()){
             requiereconfi = "no";
        } 
        String UsuarioR = this.txtCodigoUR.getText();
        String UsuairioE = this.txtCodigoUE.getText();
        String tiempoMax = this.txtTiempom.getText();
        String costo = this.txtCosto.getText();
        
         Recursos recurso1 = new Recursos (codigo,nombre ,organizacion, requiere_apobacion, usuarioaprobacion, requiereconfi, 
                UsuarioR, UsuairioE, tiempoMax, costo ); 
      
                  if (!this.rec.contains(recurso1)){
                      
              recurso.setCodigo((recurso1.getCodigo()));
              recurso.setOrganizacion((recurso1.getOrganizacion()));
              recurso.setRequiereAprobacion(recurso1.getRequiereAprobacion());
              recurso.setUsuarioAprobacion(recurso1.getUsuarioAprobacion());
              recurso.setRequiereConfirmacion(recurso1.getRequiereConfirmacion());
              recurso.setUsuarioRecepcion(recurso1.getUsuarioRecepcion());
              recurso.setUsuarioEntrega(recurso1.getUsuarioEntrega());
              recurso.setTiempoMaximoUso(recurso1.getTiempoMaximoUso());
              recurso.setCosto(recurso1.getCosto());
            
               
               this.tableRecursos.refresh();
               
           txtCodigoOrgRec.setEditable(true);
           txtCodigoRec.setEditable(true);
           
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("USARIO MODIFICADO");
                  alert.showAndWait();  
                  
               txtCodigoRec.clear();
               txtCodigoOrgRec.clear();
                txtNombreRec.clear();    //limpiamos los textfield para ingresar nueva informacion
                 txtTiempom.clear();
                  txtCosto.clear();
            
                  
              buttCrearrec.setVisible(true);
              
             
               
               
            }else {

                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("El USARIO YA EXISTE");
                  alert.showAndWait();   
             }
                       
                       
                        }catch (NumberFormatException e) {
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setHeaderText(null);
                  alert.setTitle("Error");
                  alert.setContentText("FORMATO INCORRECTO");
                  alert.showAndWait();  
                   }
                   }
        
        
       
    }

    @FXML
    private void InactivarRecurso(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setHeaderText(null);
                  alert.setTitle("Informacion");
                  alert.setContentText("SE HA INACTIVADO EL RECURSO");
                  alert.showAndWait();  
    }
     
     // Hacemos metodos booleanos que comprueben el formato de nuestros textfields para verificar que estan correcetos
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
     
   public void initAttributtesOrg (ObservableList<Organizaciones> organizacion) {
   this.Org = organizacion;
   }
   
   public boolean verificarInt (String dato){
       String cadena = dato;
       boolean num= false;
       
       for (int i = 0; i < cadena.length(); i++) {
             if (Character.isDigit(cadena.charAt(i))) {
                num = true;
               } else {
                num = false ;  
                }
               
           }
       
       if (num == true){
           return true;
       } else{
           return false;
       }

   }

    @FXML
    private void seleccionarRecurso(MouseEvent event) {
        Recursos recurso =this.tableRecursos.getSelectionModel().getSelectedItem();
        
       
       if(recurso != null){
 
           this.txtCodigoRec.setText(recurso.getCodigo());
           this.txtCodigoOrgRec.setText(recurso.getOrganizacion());
           this.txtNombreRec.setText(recurso.getNombre());
           this.txtCodigoUsA.setText(recurso.getUsuarioAprobacion());
           this.txtCodigoUE.setText(recurso.getUsuarioEntrega());
           this.txtCodigoUR.setText(recurso.getUsuarioRecepcion());
           this.txtTiempom.setText(recurso.getTiempoMaximoUso());
           this.txtCosto.setText(recurso.getCosto());
          
          txtCodigoUs.setEditable(false);
          txtCodigoOrgUs.setVisible(false);
          buttCrearUsuario.setVisible(false);
          
              
          }
    }

   
   
   
      
            
      
      
    @FXML
    private void menuReportes(MouseEvent event) {
    }

    @FXML
    private void requiereApro(MouseEvent event) {
       if(bttsiapro.isSelected()){
          txtCodigoUsA.setVisible(true);
          lablelCodA.setVisible(true);
      }else {
          txtCodigoUsA.setVisible(false);
          lablelCodA.setVisible(false);
      }
    }

    @FXML
    private void requiereconfi(MouseEvent event) {
         if (bttsiconfi.isSelected()){
          txtCodigoUE.setVisible(true);
           txtCodigoUR.setVisible(true);
           lablelCodE.setVisible(true);
           lablelCodR.setVisible(true);
      } else {
          txtCodigoUE.setVisible(false);
           txtCodigoUR.setVisible(false);
              lablelCodE.setVisible(false);
           lablelCodR.setVisible(false);
      }
    }

   
    
   
    
     
  
}
