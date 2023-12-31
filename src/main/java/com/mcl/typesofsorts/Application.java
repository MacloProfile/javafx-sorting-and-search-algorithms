package com.mcl.typesofsorts;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    //first window
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 280);
        stage.setTitle("Kinds of sorts");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    //second window
    public static void openResultWindow() throws IOException {
        Stage inputStage = new Stage();
        inputStage.setTitle("Input!");
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("result.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 600, 400);
        inputStage.setScene(secondScene);
        inputStage.setResizable(false);
        inputStage.show();
    }

    //error message
    public static String errorMessage = "ERROR";

    public static String getErrorMessage() {
        return errorMessage;
    }
    //error window
    public static void error(String message) throws IOException {
        Stage errorStage = new Stage();
        errorStage.setTitle("ERROR");
        errorMessage = message;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("error.fxml"));
        Scene secondScene = new Scene(fxmlLoader.load(), 200, 120);
        errorStage.setScene(secondScene);
        errorStage.setResizable(false);
        errorStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
