package assessment;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		boolean gameOver = false;
		game.begin();
		while(gameOver == false) {
			game.adventure();
			gameOver = game.gameState();
		}
	}

}
