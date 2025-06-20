package hangman;
import javax.swing. SwingUtilities ;

public class TimerRunnable implements Runnable {
	private final Timer game;
	
	public TimerRunnable(Timer game) {
		this.game= game;
	}
	@Override
	public void run() {
		while(game.timerRunning && game.timeLeft > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			
		}
		
		game.timeLeft--;
		
		SwingUtilities.invokeLater(() -> game.timeLabel.setText("Zeit übrig: "+ game.timeLeft));
		
		if(game.timeLeft <=0) {
			game.timerRunning = false;
			System.out.println("Zeit abgelaufen");
			
			SwingUtilities.invokeLater(() -> game.endGame(false));
		}
	}

}
