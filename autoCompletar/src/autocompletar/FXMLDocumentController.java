/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocompletar;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

/**
 *
 * @author dgpac
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField autoC;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> ar = new ArrayList<String>();
        String s1 ="Test1";
        String s2 ="Test2";
        String s3 ="Test3";
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);

        String s4 ="Test4";
        ar.add(s4);
        String[] possibleMySQL = {"hola", "helado", "David", "Daniel"};
        TextFields.bindAutoCompletion(autoC, ar);
    }    
    
}
