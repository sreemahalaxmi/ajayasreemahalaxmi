import java.util.*;
import java.util.function.Predicate;

class predicate {
	public static void main(String args[])
	{

		
		List<String> names = Arrays.asList("Laxmi", "sunitha", "maha", "suhana", "bunny");

 
		Predicate<String> p = (S) -> S.startsWith("S");

	
		for (String st : names) {
			
			if (p.test(st))
				System.out.println(st);
		}
	}
}
