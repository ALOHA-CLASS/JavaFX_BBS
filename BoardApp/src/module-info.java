module BoardApp {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.Controller to javafx.fxml;
}
