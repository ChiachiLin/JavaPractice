package game;



public class GameDemo {
		public static void main(String[] args) {
		GameDemo.play(Action2.DOWN.ordinal());
		GameDemo.play(Action2.RIGHT.ordinal());
	}
	
public static void play(int i) {
	switch(i) {
		case 0:
			System.out.println("STOP");
			break;
		case 1:
			System.out.println("UP");
			break;
		case 2:
			System.out.println("DOWN");
			break;
		case 3:
			System.out.println("RIGHT");
			break;
		case 4:
			System.out.println("LEFT");
			break;
		}
	}
}
