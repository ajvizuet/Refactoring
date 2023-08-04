package Game;

public abstract class AbstractChoice implements Choice {
	public int value;
	public String name;
	public AbstractChoice() {
		
	}
	@Override
	public String toString() {
		return name;
	}
	
}
