package Klodshans;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonCounterGUI extends Application {

    private int count = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Person Counter");

        // create form for adding people
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();
        Button addButton = new Button("Add Person");
        HBox addPersonForm = new HBox(nameLabel, nameTextField, addButton);
        addPersonForm.setAlignment(Pos.CENTER);
        addPersonForm.setSpacing(10);

        // create label for displaying count
        Label countLabel = new Label("Count: " + count);

        // create layout for form and count label
        VBox layout = new VBox(20, addPersonForm, countLabel);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        // create action for add button
        addButton.setOnAction(event -> {
            String name = nameTextField.getText();
            if (!name.isEmpty()) {
                count++;
                countLabel.setText("Count: " + count);
                nameTextField.clear();
            }
        });

        // create button to move to next menu
        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            // create new menu here
            Label doneLabel = new Label("Done adding people!");
            VBox doneLayout = new VBox(doneLabel);
            doneLayout.setAlignment(Pos.CENTER);
            doneLayout.setPadding(new Insets(20));
            Scene doneScene = new Scene(doneLayout, 400, 200);
            primaryStage.setScene(doneScene);
        });

        // add next button to layout
        layout.getChildren().add(nextButton);

        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
