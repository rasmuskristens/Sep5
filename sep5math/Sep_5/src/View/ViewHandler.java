package View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import ViewModel.ViewModelFactory;

public class ViewHandler {
	private Stage primaryStage;
	private Scene currentScene;
	private ViewModelFactory ViewModelFactory;
	private Chapter1Controller chapter1controller;
	private FrontPageController FrontPageController;

	public ViewHandler(ViewModelFactory viewModelFactory) {
		this.ViewModelFactory = viewModelFactory;
		this.currentScene = new Scene(new Region());

	}

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		openView("Frontpage");
	}

	public void openView(String id) {
		Region root = null;
		switch (id) {
		case "Frontpage":
			root = loadFrontpageView("FrontPage.fxml");
			break;
		case "Chapter1":
			root = loadChapter1("Chapter1.fxml");
			break;
		}
		currentScene.setRoot(root);
		String title = "";
		if (root.getUserData() != null) {
			title += root.getUserData();
		}
		primaryStage.setTitle(title);
		primaryStage.setScene(currentScene);
		primaryStage.setWidth(root.getPrefWidth());
		primaryStage.setHeight(root.getPrefHeight());
		primaryStage.show();
	}

	public void closeView() {
		primaryStage.close();
	}

	private Region loadFrontpageView(String fxmlFile) {
		Region root = null;
		if (FrontPageController == null) {
			// load from FXML
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource(fxmlFile));
				root = loader.load();
				FrontPageController = loader.getController();
				FrontPageController.init(this, ViewModelFactory.getFrontPageViewModel(), root);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			// reset window
			FrontPageController.reset();
		}
		return FrontPageController.getRoot();
	}
	
	private Region loadChapter1(String fxmlFile) {
		Region root = null;
		if (chapter1controller == null) {
			// load from FXML
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource(fxmlFile));
				root = loader.load();
				chapter1controller = loader.getController();
				chapter1controller.init(this, ViewModelFactory.getChapter1ViewModel(), root);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			chapter1controller.reset();
		}
		return chapter1controller.getRoot();
	}
}


