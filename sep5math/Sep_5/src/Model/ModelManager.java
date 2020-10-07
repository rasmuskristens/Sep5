package Model;

public class ModelManager implements MathModel {

	private int score;
	private int Value;

	public ModelManager() {
		
	}
	
	@Override
	public int getScore() {
		return score;
	}

	@Override
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int getValue() {
		return Value;

	}

}
