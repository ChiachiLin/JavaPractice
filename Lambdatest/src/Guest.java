import java.util.*;
public class Guest {
	public static void main(String args[]) {
		List<String> names =new ArrayList<>();
		collectNameTo(names); 
		System.out.println("�X�ȦW�� : ");
		printUpperCase(names); 
	}
	static void collectNameTo(List<String>names) {  //�`���W�r��Jnames
		Scanner scn = new Scanner(System.in);
		String name;
		while(true) {
			System.out.print("�X�ȦW�� : ");
			name = scn.nextLine();
			if (name.equals("quit")){
				break;
			}
			names.add(name);
		}
	}
	static void printUpperCase(List<String> names) { //�ন�j�g��X
		for(int i =0;i<names.size();i++) {
			String name = names.get(i);
			System.out.println(name.toUpperCase());
		}
	}
}
