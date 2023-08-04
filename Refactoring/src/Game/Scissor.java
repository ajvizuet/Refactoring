package Game;

public class Scissor extends AbstractChoice {
	public Scissor() {
		name = "Scissor";
	}

	@Override
	public Choice getWinner(Choice c) {
		if(c instanceof Rock) {
			return c;
		}
		return this;
	}
}
