import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		String line = input("�п�J�^��G");
		Set<String> words = tokens(line);
		System.out.printf("�����Ƴ�r�� %d �ӡG%s%n", words.size(), words);
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