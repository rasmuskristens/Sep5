package main;

import javafx.application.Application;
import javafx.stage.Stage;
import Model.MathModel;
import Model.ModelManager;
import View.ViewHandler;
import ViewModel.ViewModelFactory;

public class MyApplication extends Application {
	public void start(Stage primaryStage) {
		MathModel model;
		try {
			model = new ModelManager();
			ViewModelFactory viewModelFactory = new ViewModelFactory(model);
			ViewHandler view = new ViewHandler(viewModelFactory);
			view.start(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
