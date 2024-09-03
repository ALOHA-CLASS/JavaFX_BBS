package application.Controller;

import application.Main;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateController {

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnMain;

    @FXML
    private TextArea taContent;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;

    private BoardService boardService = new BoardServiceImpl();
    
    @FXML
    void create(ActionEvent event) throws Exception {
    	Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
    	int result = boardService.insert(board);
    	if( result > 0 ) {
    		System.out.println("insert data OK!");
    		Main.setRoot("UI/List");
    	}
    }

    @FXML
    void toList(ActionEvent event) throws Exception {
    	Main.setRoot("UI/List");
    }

}











