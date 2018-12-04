package polymorphism;

public class TestPrice {
	public static void main(String [] args) {
	
	Add ad1 = new Add();
	ad1.addPriceOfFruit(23);
	
	ad1.addPriceOfFruit(23, 15);
	System.out.println(ad1.addPriceOfFruit(23) + ad1.addPriceOfFruit(23, 15));
	System.out.println(String.valueOf(ad1.addPriceOfFruit(23)) + " " + String.valueOf(ad1.addPriceOfFruit(23, 15)));
	
	
	
	Price pr1 = new Price(23);
	System.out.println("Apple price is" + " " + pr1.applePrice);
	
	
	Price pr2 = new Price(23,15);
	System.out.println("Apple price is " + " "+ pr2.applePrice + " Banana price is " + " "+ pr2.bananaPrice);
	
	NewPrice nw = new NewPrice();
	nw.addPriceOfFruit(23);
	
	nw.addPriceOfFruit(23, 15);
	System.out.println(nw.addPriceOfFruit(23));
	System.out.println(nw.addPriceOfFruit(23, 15));
	
	Add ne1 = new NewPrice();
	


}
}