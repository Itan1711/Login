/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Adrian
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label mensaje;
    
   @FXML
   private TextField txt_correo;
   
   
  
    @FXML
   private PasswordField txt_contraseña;
    
    
    @FXML
   private void btnLoginActiom (ActionEvent event) throws Exception{
       if (txt_correo.getText().equals("estebanpiedra@gmail") && txt_contraseña.getText().equals("gogeta")   ){
          ((Node) event.getSource()).getScene().getWindow().hide(); // quitar el principal
          Parent parent = FXMLLoader.load(getClass().getResource("entrada.fxml")); // ingresar a otra ventana
          Stage stage = new Stage ();
          Scene scene = new Scene (parent);
          stage.setTitle("Entrada");
          stage.show();
          
       }else{
            mensaje.setText("Correo electrónico o contraseña son incorrectas");
       }
   }
    
    
   
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
