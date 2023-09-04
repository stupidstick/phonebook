package com.pervukhin.phonebook.view.menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuViewFactory {
    private Stage stage;
    public MenuViewFactory(Stage mainStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuView.class.getResource("menu.fxml"));
        Scene scene = new Scene(loader.load());
        stage = mainStage;
        stage.setTitle("PhoneBook");
        stage.setResizable(false);
        stage.setScene(scene);
    }

    public Stage getStage(){
        return stage;
    }
}
