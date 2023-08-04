package Game;

public class SelectWinner {
		
	public static Player getWinner(Player player1, Player player2) {
		if(player1 != null && player2 != null) {
			
			if(player1.getPriority() > player2.getPriority()) {
				player1.victories++;
				return player1;
				
			}else if(player1.getPriority() < player2.getPriority()) {
				player2.victories++;
				return player2;
				
			}
			return null;
		}
		return null;
	}
	public static void showWinner(Player player1, Player player2) {
		if(player1.victories == 3) {
			System.out.println("Winner "+player1.getUsername());
		}else {
			System.out.println("Winner "+player2.getUsername());
		}
		
	}
}
