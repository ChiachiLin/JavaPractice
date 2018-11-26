
public class GameDemo2{
	public static void main(String[] args) {
		GameDemo2.play(Action3.RIGHT);
		GameDemo2.play(Action3.UP);
	} 
	static void play(Action3 action) {
		action.execute();
	}
}
