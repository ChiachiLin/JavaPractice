
public class UtilDemo {
	public static void main(String[] args) {
		String[] words = {"B","C","A","T","F","R","J"};
		Util.sort(words);
		for (String word : words) {
			System.out.print(word+" ");
		}
	}

}
