
public class Abstract {
public static void main(String[] args) {
		abstract class Bike{  
			Bike(){System.out.println("bike is created");}  
			abstract void run();  
			void changeGear(){System.out.println("gear changed");}  
		}  

		class Discover extends Bike{  
			void run(){System.out.println("running safely..");}  
		}  

		@SuppressWarnings("unused")
		class Main{
			@SuppressWarnings("unused")
			public static void main(String[] args) {  
				Bike obj = new Discover();  
				obj.run();  
				obj.changeGear();  
			}  
		}  

	}

}
 