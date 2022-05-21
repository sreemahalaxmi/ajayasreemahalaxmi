import java.util.*;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String username="ABC";
        String password="ABCDE";
        String uname,pssd;
        int i=1;
        while(i>0) {
        	System.out.println("username:");
	        uname=sc.next();
         	System.out.println("Password:");
			pssd=sc.next();
			if(username.equals(uname) && password.equals(pssd))
			{
				System.out.println("Welcome "+uname);
	            break;

			}
			else
			{
                 System.out.println("Username and Password are wrong!Re-enter");
                 i++;
           	}
	        if(i>30) {
           	    System.out.println("Contact Admin");
		        break;
	        }
        }
	}
}
          