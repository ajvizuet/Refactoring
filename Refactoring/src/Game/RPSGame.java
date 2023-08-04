package Game;

public class RPSGame {
	String user1;
	String user2;
	public RPSGame(String user1, String user2) {
		  Player player1 = new Player(user1);
		  Player player2 = new Player(user2);
		  GameManagment gm = new GameManagment(player1, player2);
		  
		   
	}
	public static void main(String [] args) {
		RPSGame game = new RPSGame("Diego","Ariana");
	}
	
}
