module BoardApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires lombok;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml, lombok, java.sql;
	opens application.Controller to javafx.fxml;
	opens application.DTO to javafx.base;
}
