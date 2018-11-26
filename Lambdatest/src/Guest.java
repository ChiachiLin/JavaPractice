import java.util.*;
public class Guest {
	public static void main(String args[]) {
		List<String> names =new ArrayList<>();
		collectNameTo(names); 
		System.out.println("訪客名單 : ");
		printUpperCase(names); 
	}
	static void collectNameTo(List<String>names) {  //蒐集名字放入names
		Scanner scn = new Scanner(System.in);
		String name;
		while(true) {
			System.out.print("訪客名稱 : ");
			name = scn.nextLine();
			if (name.equals("quit")){
				break;
			}
			names.add(name);
		}
	}
	static void printUpperCase(List<String> names) { //轉成大寫輸出
		for(int i =0;i<names.size();i++) {
			String name = names.get(i);
			System.out.println(name.toUpperCase());
		}
	}
}
