package com.example.repetit.controllers;

import com.example.repetit.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SignUp {

    @FXML
    private TextField id;

    @FXML
    private ChoiceBox<?> choice;

    //methode qui permet de passer de la page de connexion a la page d'inscription
    public void signInRedirect() throws IOException {


        Parent good = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("signUp2.fxml")));
        Stage stg = new Stage();
        Scene scene = new Scene(good);
        stg.setScene(scene);
        stg.show();

        Stage connectscene = (Stage) choice.getScene().getWindow();
        connectscene.close();
    }

}
