package com.pervukhin.phonebook.main;

import com.pervukhin.phonebook.view.menu.MenuViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PhoneBookApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MenuViewFactory factory = new MenuViewFactory(stage);
        factory.getStage().show();
    }

    public static void main(String[] args) {
        launch();
    }
}