import java.util.*;
class Var1 {
	public static void main(String[] args)
	{
		// Generic list using var
		var<var> al = new ArrayList<>();
			
		// add elements
		al.add(10);
		al.add(20);
		al.add(30);
		
		// print the list
		System.out.println(al);
		
		// instance variable
		int x  = 50;
		System.out.println(x);
		
		
	}
}