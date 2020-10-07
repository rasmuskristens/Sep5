package View;

import ViewModel.FrontPageViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;


import View.ViewHandler;
import ViewModel.FrontPageViewModel;

public class FrontPageController {

	private Region root;
	private FrontPageViewModel ViewModel;
	private ViewHandler viewhandler;

	

	public FrontPageController() {

	}

	
	@FXML
	private ImageView forsideimage;

	@FXML
	void ChoosegameOnAction(ActionEvent event) {
		viewhandler.openView("Chapter1");
	}

	public void init(ViewHandler viewhandler, FrontPageViewModel ViewModel, Region root) {
		this.viewhandler = viewhandler;
		this.ViewModel = ViewModel;
		this.root = root;

	}

	public Region getRoot() {
		return root;
	}

	public void reset() {
	}

}
