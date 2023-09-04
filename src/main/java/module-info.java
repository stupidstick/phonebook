module com.pervukhin.phonebook {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pervukhin.phonebook.main to javafx.graphics;
    opens com.pervukhin.phonebook.controller.menu to javafx.fxml;
}