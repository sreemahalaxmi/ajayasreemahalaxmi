public class DessertItem {

    public static void main(String[] args) {
        checkout checkout = new checkout();

        checkout.enterItem(new Candy("Groundnut Butter", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 120, 0));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, 60));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 5, 299));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        checkout.clear();

        checkout.enterItem(new IceCream("Butterscotch Ice Cream", 155, 0));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 110, 40));
        checkout.enterItem(new Candy("Gummy Worms", 1.44, 79));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 5, 299));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);
    
        
        
        
        
        
    }
   
}    
