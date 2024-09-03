package application.Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateController {

    @FXML
    private Button btnList;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextArea taContent;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;

    @FXML
    void toList(ActionEvent event) throws Exception {
    	Main.setRoot("UI/List");
    }

    @FXML
    void update(ActionEvent event) {
    	
    }

}






