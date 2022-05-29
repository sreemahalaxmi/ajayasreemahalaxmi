import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {

   private TreeMap<String,String> data;
   
   public PhoneDirectoryWithTreeMap() {
      data = new TreeMap<String,String>();
   }
   
   
    
   public String getNumber( String name ) {
         return data.get(name);
   }

   
    
   public void putNumber( String name, String number ) {
      if (name == null || number == null)
          throw new IllegalArgumentException("name and number cannot be null");
      data.put(name,number);
   }
   
   
   
   public void print() {
      for ( Map.Entry<String,String> entry : data.entrySet() )
         System.out.println( entry.getKey() + ":  " + entry.getValue() );
   }


public class TestPhoneDirectoryWithTreeMap {

	public static void main(String[] args) {
       Contact directory = new Contact();
       System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
       System.out.println("adds several entries.  It then prints the contents of");
       System.out.println("directory and does a few lookups.");
       System.out.println();
       directory.putNumber("Kavitha","555-1234");
       directory.putNumber("Vanitha","555-2345");
       directory.putNumber("Sunitha","555-3456");
       System.out.println("Contents are:");
       System.out.println();
       directory.print();
       System.out.println();
       System.out.println("Number for Kavitha is " + directory.getNumber("Kavitha"));
       System.out.println("Number for Vanitha is " + directory.getNumber("Vanitha"));
       System.out.println("Number for Sunitha is " + directory.getNumber("Sunitha"));
           
   }

}
}
