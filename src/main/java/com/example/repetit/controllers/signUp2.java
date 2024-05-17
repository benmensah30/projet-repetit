package com.example.repetit.controllers;

import com.example.repetit.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class signUp2 {

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    //methode qui permet de passer de la page de connexion a la page d'inscription
    public void signInConnect() throws IOException {


        Parent good = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("connection.fxml")));
        Stage stg = new Stage();
        Scene scene = new Scene(good);
        stg.setScene(scene);
        stg.show();

        Stage connectscene = (Stage) username.getScene().getWindow();
        connectscene.close();
    }

}
