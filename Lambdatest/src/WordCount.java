import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		String line = input("請輸入英文：");
		Set<String> words = tokens(line);
		System.out.printf("不重複單字有 %d 個：%s%n", words.size(), words);
	}

	static String input(String prompt) {
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}

	static Set<String> tokens(String line) {
		String[] tokens = line.split(" ");
		Set<String> words = new HashSet<>();
		for (String token : tokens) {
			words.add(token);
		}
		return words;
	}
}