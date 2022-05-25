public class UnsupportedOperationException {
public static void main(String[] args) {
	int a[]= {0};
	try {
		int b=0;
		int result=10/b;
		System.out.println("Result is :"+result);
	}
	catch(Exception e) {
	System.out.println("can't divided by Zero");
	e.printStackTrace();
	
}}
}