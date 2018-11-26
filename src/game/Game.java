package game;
import static java.lang.System.out;

public class Game {
	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.UP);
	}
	
	public static void play(Action action) {
		switch(action) {
		case STOP:
			out.println("停止播放動畫");
			break;
		case UP:
			out.println("向上播放動畫");
			break;
		case DOWN:
			out.println("向下播放動畫");
			break;
		case RIGHT:
			out.println("向右播放動畫");
			break;
		case LEFT:
			out.println("向左播放動畫");
			break;
		}
	}

}
