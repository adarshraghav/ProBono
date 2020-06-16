package projectcode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller3 {
    @FXML
    private void prevScreen2(ActionEvent event) throws IOException {
        Parent view3 = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene3 = new Scene(view3);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void addScene(ActionEvent event) throws IOException {
        Parent view3 = FXMLLoader.load(getClass().getResource("case001.fxml"));

        Scene scene3 = new Scene(view3);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

}
