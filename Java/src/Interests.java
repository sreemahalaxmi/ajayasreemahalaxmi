
public class Interests {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double amount=0,principle=1000,rate=10,time=3,ci,si;
        System.out.println("Principle="+principle+"\nRate="+rate+"\nTime="+time);
        si=(principle*rate*time)/100;
        System.out.println("The simple Interest is :"+si);
		amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
        System.out.println("The amount is :"+amount);
        ci=amount-principle;
        System.out.println("The compound Interest is :"+ci);
}
	
}
