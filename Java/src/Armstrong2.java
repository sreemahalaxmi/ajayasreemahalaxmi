
public class Armstrong2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=100,a,arm,n;
        System.out.println("Armstrong numbers between 100 and 999");
        while(i<999) {
	        n=i;
         	arm=0;
         	while(n>0) {
	         	a=n%10;
	         	arm=arm+(a*a*a);
				n=n/10;
            }
            if(arm==i)
	            System.out.println(i);
               i++;
        } 	

        
	}
}
	