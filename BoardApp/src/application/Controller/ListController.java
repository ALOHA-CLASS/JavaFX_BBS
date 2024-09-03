package application.Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListController {

    @FXML
    private TableView<?> boardTableView;

    @FXML
    private TableColumn<?, ?> colNo;
    @FXML
    private TableColumn<?, ?> colTitle;
    @FXML
    private TableColumn<?, ?> colWriter;
    @FXML
    private TableColumn<?, ?> colDate;
    @FXML
    private TableColumn<?, ?> colView;
    
    @FXML
    private Button btnCreate;

    @FXML
    private Button btnMain;

    @FXML
    void toCreate(ActionEvent event) throws Exception {
    	Main.setRoot("UI/Create");
    }

    @FXML
    void toMain(ActionEvent event) throws Exception {
    	Main.setRoot("Main");
    }

}
