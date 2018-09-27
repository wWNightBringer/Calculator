package com.example;

import com.example.controllers.MainFieldController;
import com.example.controllers.RootLayoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage stage;
    private BorderPane borderPane;
    private Path path;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        primaryStage.getIcons().add(new Image("icons/512.png"));
        initRootLayout();
        showMainField();
        primaryStage.show();

    }

    private void showMainField() {
        FXMLLoader loader = new FXMLLoader();
        path = Paths.get("calculator/src/main/resources/view/MainField.fxml");
        try {
            loader.setLocation(path.toFile().toURL());
            AnchorPane anchorPane = loader.load();
            borderPane.setCenter(anchorPane);
            MainFieldController controller = loader.getController();
            controller.setMain(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void initRootLayout() {
        FXMLLoader loader = new FXMLLoader();
        path = Paths.get("calculator/src/main/resources/view/RootLayout.fxml");
        try {
            loader.setLocation(path.toFile().toURL());
            borderPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(borderPane);
        scene.getRoot().requestFocus();
        stage.setScene(scene);


    }

    public Stage getStage() {
        return stage;
    }
}
