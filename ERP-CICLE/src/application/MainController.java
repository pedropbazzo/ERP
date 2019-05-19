package application;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainController {
	@FXML
	private ImageView calc;
	@FXML
	private AnchorPane p;
	@FXML
	private Pane painel1;
	@FXML
	private Pane painel3;
	
	
	public void fechar(){
		painel3.setVisible(false);
	}

	public void t(){
		painel3.setVisible(true);
		
		
		
	}
	
	
	

}
