public class ArithmeticException {
public static void main(String[] args) {
try {
int a=10;
int b=0;
int result=a/b;
System.out.println("Result is :"+result);
}
catch(Exception e)
{
System.out.println("Divided by Zero");
e.printStackTrace();
}
System.out.println("can't divided by Zero:");
	}}
