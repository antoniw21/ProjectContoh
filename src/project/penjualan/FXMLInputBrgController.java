/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project.penjualan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LIKMI
 */
public class FXMLInputBrgController implements Initializable {

    @FXML
    private TextField txtkodebrg;
    @FXML
    private TextField txtnamabrg;
    @FXML
    private TextField txttarif;
    @FXML
    private Button btnsimpan;
    @FXML
    private Button btnbatal;
    @FXML
    private Button btnquit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnsimpanklik(ActionEvent event) {
    }

    @FXML
    private void btnbatalklik(ActionEvent event) {
    }

    @FXML
    private void btnquitklik(ActionEvent event) {
    }
    
}
