/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fm20xx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TransferController implements Initializable {
    @FXML ImageView icon;
    
    @FXML
    private void home(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TeamSelect.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    private TextField amount1IN;

    @FXML
    private TextField amount2IN;

    @FXML
    private TextField player1IN;

    @FXML
    private TextField player2IN;

    @FXML
    private TextField teamIN;

    @FXML
    void confirm(ActionEvent event) throws IOException {
        String amount1 = amount1IN.getText();
        try {
            int amt1 = Integer.parseInt(amount1);
            System.out.println("Your current bid is: " + amt1);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.close();
        }
        System.out.println(amount1IN.getText());
        
        String amount2 = amount2IN.getText();
        try {
            int amt2 = Integer.parseInt(amount2);
            System.out.println("Your current bid is: " + amt2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.close();
            
        }
        System.out.println(amount2IN.getText());
        
        System.out.println(player2IN.getText());
        System.out.println(player1IN.getText());
        switch(teamIN.getText()){
            case "Atletico de Manila":
                System.out.println("11");
            break;
            
            case "Dynamo Dresden":
                 System.out.println("12");
            break;
            
            case "Sofia Strikers":
                 System.out.println("13");
            break;
            
            case "Yokohama Marinos":
                 System.out.println("14");
            break;
            
            default:
                System.out.println("0");
                Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                thisStage.close();
            break;
        }
        System.out.println(teamIN.getText());
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}