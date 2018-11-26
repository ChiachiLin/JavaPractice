import java.util.Arrays;
import java.util.Comparator;
public class test {

	public static void main(String[] args) {
		String[] names = {"Justin", "caterpillar", "Bush"};
		//Arrays.sort(names, StringOrder ::byLexicographyIgnoreCase);
		//Arrays.sort(names, (name1, name2)->StringOrder.byLength(name1, name2));
		//Arrays.sort(names, StringOrder::byLength);
		//Arrays.sort(names, StringOrder::byLexicography);
		Arrays.sort(names, StringOrder::byLexicographyIgnoreCase);
		for (String name : names) {
			System.out.println(name);
		}
	}
}	
