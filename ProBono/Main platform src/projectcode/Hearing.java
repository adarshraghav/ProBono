package projectcode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Hearing {
    @FXML
    private void prevSceneh(ActionEvent event) throws IOException {
        Parent view5 = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene5 = new Scene(view5);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene5);
        window.show();
    }
}
