package Game;

public class Rock extends AbstractChoice {
	public Rock() {
		name = "Rock";
	}

	@Override
	public Choice getWinner(Choice c) {
		if(c instanceof Paper) {
			return c;
		}
		return this;
	}

}
