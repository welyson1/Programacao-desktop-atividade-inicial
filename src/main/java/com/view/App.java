package com.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static FXMLLoader loader;

    @Override
    public void start(Stage stage) throws IOException {
        //Criação do palco e cena (Esse parte inicia a tela inicial)          
        loader = new FXMLLoader(getClass().getResource("/com/view/tela.fxml"));
            
        Parent root = loader.load(); 
        Scene scene = new Scene(root);
        stage.setTitle("Tools");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}