package View;

import ViewModel.Chapter1ViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;


import View.ViewHandler;
import ViewModel.FrontPageViewModel;

public class Chapter1Controller {
	private Region root;
	private Chapter1ViewModel viewModel;
	private ViewHandler viewhandler;

	public Chapter1Controller() {

	}

	@FXML
	void firstproblemOnMouseEntered(MouseEvent event) {

	}

	@FXML
	void secondproblemOnMouseEntered(MouseEvent event) {

	}

	@FXML
	private ImageView firstProblem;

	@FXML
	private ImageView secondproblem;

	@FXML
	private ProgressBar progressbar;

	public void init(ViewHandler viewHandler, Chapter1ViewModel chapter1ViewModel, Region root) {
		this.viewhandler = viewHandler;
		this.viewModel = chapter1ViewModel;
		this.root = root;

	}

	public void reset() {
	}

	public Region getRoot() {
		return root;
	}

}
