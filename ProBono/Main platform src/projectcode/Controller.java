package projectcode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class Controller {
    @FXML
    private void addScene(ActionEvent event) throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("Clients.fxml"));

        Scene scene2 = new Scene(view2);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void addScene2(ActionEvent event) throws IOException{
        Parent view3 = FXMLLoader.load(getClass().getResource("Files.fxml"));

        Scene scene3 = new Scene(view3);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void addScene3(ActionEvent event) throws IOException{
        Parent view5 = FXMLLoader.load(getClass().getResource("Hearing.fxml"));

        Scene scene5 = new Scene(view5);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene5);
        window.show();
    }

    @FXML
    private void addScene4(ActionEvent event) throws IOException{
        Parent view4 = FXMLLoader.load(getClass().getResource("Settings.fxml"));

        Scene scene4 = new Scene(view4);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }


}

