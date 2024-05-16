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

public class ConnectionController {

    @FXML
    private PasswordField passwordPF;

    @FXML
    private TextField usernameTF;

    //methode qui permet de passer de la page de connexion a la page d'inscription
    public void signUpConnect() throws IOException {

        Parent good = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("signUp.fxml")));
        Stage stg = new Stage();
        Scene scene = new Scene(good);
        stg.setScene(scene);
        stg.show();

    }

}
