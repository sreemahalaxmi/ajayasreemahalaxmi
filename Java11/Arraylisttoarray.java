 import java.util.ArrayList;
import java.util.List;

public class Arraylisttoarray {
	
	public static void main(String args[])
	{
		List<String> List = new ArrayList<String>();
		List.add("An");
		List.add("arrayList");
		List.add("is");
		List.add("a");
		List.add("part");
		List.add("of");
		List.add("Collection");
		List.add("Framework.");
		
		
		String[] array = List.toArray(new String[0]);
		
		for (String s: array) {
			System.out.println(s);
		}
	}

}