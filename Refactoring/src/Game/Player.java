package Game;
import java.util.Comparator;
public class Player {
	public int victories;
	private AbstractChoice choice;
	private String username;
	
	public Player(String username) {
		victories = 0;
		this.username = username;
	}
	public void setChoice(AbstractChoice c) {
		choice = c;
	}
	public Choice getChoice() {
		return choice;
	}

	public int getPriority() {
		return choice.value;
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(username).append(" : choice : " +choice);
		return sb.toString();
	}
	public String getUsername() {
		return username;
	}
	
	
	
}
