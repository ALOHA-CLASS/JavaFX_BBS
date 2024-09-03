package application.Controller;

import application.Main;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class UpdateController {

    @FXML
    private Button btnList;

    @FXML
    private Button btnUpdate;
    
    @FXML
    private Button btnDelete;

    @FXML
    private TextArea taContent;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;
    
    private BoardService boardService = new BoardServiceImpl();
    
    int boardNo;

    @FXML
    void toList(ActionEvent event) throws Exception {
    	Main.setRoot("UI/List");
    }

    @FXML
    void update(ActionEvent event) throws Exception {
    	Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
    	board.setNo(boardNo);
    	int result = boardService.update(board);
    	if( result > 0 ) {
    		System.out.println("update data OK!");
    		Main.setRoot("UI/List");
    	}
    }

	public void passData(int boardNo) {
		this.boardNo = boardNo;
		Board board = boardService.select(boardNo);
		tfTitle.setText( board.getTitle() );
		tfWriter.setText( board.getWriter() );
		taContent.setText( board.getContent() );
	}


    @FXML
    void delete(ActionEvent event) throws Exception {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Delete Data");
    	alert.setHeaderText("Are you sure you want to delete this post? no : " + boardNo);
    	alert.setContentText("Once deleted, it cannot be undone.");
    	
    	int result = 0;
    	if( alert.showAndWait().get() == ButtonType.OK ) {
    		result = boardService.delete(boardNo);
    	}
    	if( result > 0 ) {
    		System.err.println("delete post OK!");
    		Main.setRoot("UI/List");
    	}

    }

}













