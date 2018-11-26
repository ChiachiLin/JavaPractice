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
			out.println("�����ʵe");
			break;
		case UP:
			out.println("�V�W����ʵe");
			break;
		case DOWN:
			out.println("�V�U����ʵe");
			break;
		case RIGHT:
			out.println("�V�k����ʵe");
			break;
		case LEFT:
			out.println("�V������ʵe");
			break;
		}
	}

}
