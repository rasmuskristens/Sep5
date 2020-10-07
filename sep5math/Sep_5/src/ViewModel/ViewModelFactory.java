package ViewModel;

import Model.MathModel;

public class ViewModelFactory {
	 private FrontPageViewModel frontPageViewModel;
	 private Chapter1ViewModel chapter1viewModel;

	 public ViewModelFactory (MathModel model) {
		 frontPageViewModel = new FrontPageViewModel(model);
		 chapter1viewModel = new Chapter1ViewModel(model);

		}
	 public FrontPageViewModel getFrontPageViewModel() {
			
			return frontPageViewModel;
		}
	 
	 public Chapter1ViewModel getChapter1ViewModel() {
			
			return chapter1viewModel;
		}

}
