package Game;

public class Paper extends AbstractChoice {
	public Paper() {
		name = "paper";
	}

	@Override
	public Choice getWinner(Choice c) {
		if(c instanceof Scissor) {
			return c;
		}
		return this;
	}
	
}
