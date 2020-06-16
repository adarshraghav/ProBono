package sample;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginController
{
    public TextField txtUsername;
    public Label lblSign;
    public PasswordField txtPassword;
    public Label lblresult;

    public void login(ActionEvent actionEvent)
    {


        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        try
        {
            Statement statement=connection.createStatement();
            String sql="SELECT FROM page WHERE Username='"+txtUsername.getText()+"'AND Password='"+txtPassword.getText()+"'";
            ResultSet resultSet=statement.executeQuery(sql);

            if(resultSet.next()) {
                lblresult.setText("welcome");
            }
            else
                {
                lblresult.setText("please try again");
            }



        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }


    }

