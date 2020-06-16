package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CodeController
{
    @FXML
    private TextField txtLawcode;
    public void code(ActionEvent event){
        if(txtLawcode.getText().equals("court")){
            System.out.println("welcome");
        }
        else{
            System.out.println("retry");
        }
    }

}