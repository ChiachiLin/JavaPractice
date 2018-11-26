public enum Action3 implements Command {
		STOP,RIGHT,LEFT,UP,DOWN;
public void execute() {
	switch(this) {
	case STOP:
		System.out.printf("停止播放動畫");
		break;
	case RIGHT:
		System.out.printf("向右播放動畫");
		break;
	case LEFT:
		System.out.printf("向左播放動畫");
		break;
	case UP:
		System.out.printf("向上播放動畫");
		break;
	case DOWN:
		System.out.printf("向下播放動畫");
		break;
		}
	}
}