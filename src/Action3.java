public enum Action3 implements Command {
		STOP,RIGHT,LEFT,UP,DOWN;
public void execute() {
	switch(this) {
	case STOP:
		System.out.printf("�����ʵe");
		break;
	case RIGHT:
		System.out.printf("�V�k����ʵe");
		break;
	case LEFT:
		System.out.printf("�V������ʵe");
		break;
	case UP:
		System.out.printf("�V�W����ʵe");
		break;
	case DOWN:
		System.out.printf("�V�U����ʵe");
		break;
		}
	}
}