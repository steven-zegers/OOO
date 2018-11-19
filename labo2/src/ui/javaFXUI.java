package ui;

import com.sun.org.apache.bcel.internal.classfile.Code;
import domain.Caesar;
import domain.CodeerController;
import domain.Spiegeling;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;

public class javaFXUI extends Application {
    private TextField input;
    private TextField output;
    private Label inputLabel;
    private Label outputLabel;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        CodeerController controller = new CodeerController(new Caesar());
        primaryStage.setTitle("Geheimschrift app");
        VBox root = new VBox();
        Scene mainScene = new Scene(root, 550, 400);
        primaryStage.setScene(mainScene);


        ObservableList<String> scripts = FXCollections.observableArrayList("Caesar", "Mirror");
        ComboBox scriptsBox = new ComboBox(scripts);
        scriptsBox.setValue("Caesar");
        root.getChildren().add(scriptsBox);

        input = new TextField();

        inputLabel = new Label("Input: ");
        output = new TextField();
        outputLabel = new Label("Output: ");
        output.setDisable(true);
        root.getChildren().addAll(inputLabel, input, outputLabel, output);
        ButtonBar buttonBar = new ButtonBar();
        Button encode = new Button("Encode");
        Button decode = new Button("Decode");
        buttonBar.getButtons().addAll(encode, decode);
        root.getChildren().add(buttonBar);

        encode.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputTekst = input.getText();
                if(scriptsBox.getValue().equals("Caesar")) {
                    controller.setGeheimschrift(new Caesar());

                } else {
                    controller.setGeheimschrift(new Spiegeling());

                }
                output.setText(controller.codeer(inputTekst));
            }
        });

        decode.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputTekst = input.getText();
                if (scriptsBox.getValue().equals("Caesar")) {
                    controller.setGeheimschrift(new Caesar());
                } else {
                    controller.setGeheimschrift(new Spiegeling());
                }
                output.setText(controller.decodeer(inputTekst));
            }
        });

        primaryStage.show();
    }
}
