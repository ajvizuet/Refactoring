package Game;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class GameManagment {
		Player player1;
		Player player2;
		
		final int maxWins = 10;
		
		Map<String, AbstractChoice> diccionario = new HashMap<>();
		
		public GameManagment(Player player1, Player player2) {
			diccionario.put("Rock", new Rock());
			diccionario.put("Scissors", new Scissor());
			diccionario.put("Paper", new Paper());
			this.player1 = player1;
			this.player2 = player2;
			startGame();
		}
		private void startGame() {
			int round = 1;
			while(player1.victories != 3 && player2.victories != 3) {
				setChoice(player1);
				setChoice(player2);
				System.out.println(player1 + "    vs    " + player2);
				
				Choice winner = getWinnerChoice(player1, player2);
				if(winner == player1.getChoice()) {
					
					System.out.println("Round "+round +" Winner -> " +player1.getUsername()+"\n");
				}else if(winner == player2.getChoice()) {
					System.out.println("Round "+round +" Winner -> " +player2.getUsername()+"\n");			
				}else {
					System.out.println("tie"+"\n");
				}
				round++;
			}
			Player win = showWinner(player1, player2);
			System.out.print(win);
			
		}
		private void setChoice(Player player1) {
			String[] keys = {"Rock","Scissors","Paper"};
			Random random = new Random();
			
			int indexRandom = random.nextInt(keys.length);
			player1.setChoice(diccionario.get(keys[indexRandom]));
		}
		private Player showWinner(Player p1, Player p2) {
			if(p1.victories > p2.victories) {
				return p1;
			}
			return p2;
		}
		private Choice getWinnerChoice(Player p1, Player p2) {
			return player1.getChoice().getWinner(player2.getChoice());
		}
		
}
