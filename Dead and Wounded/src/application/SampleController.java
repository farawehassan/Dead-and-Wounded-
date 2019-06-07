package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SampleController{

	Main call = new Main();
				 
	@FXML
	void computerStarts(ActionEvent event) {
		call.gen_num();
		call.make_guess();
		call.run();
	}
	
	@FXML
    void multiplayerStarts(ActionEvent event) {
		call.startGame();
    }

		
}

