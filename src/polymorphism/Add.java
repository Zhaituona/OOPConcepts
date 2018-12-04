package polymorphism;

public class Add {
	
	int totalPrice;
	String newBrand;
	

	public int addPriceOfFruit(int applePrice) {// method overloading
		return totalPrice= applePrice ;
	}
	
	public int addPriceOfFruit (int applePrice, int bananaPrice) { // method overloading
		return totalPrice = applePrice + bananaPrice;
	}
	
	public String showBrand(String appleBrand) {// method overloading 
		return appleBrand;
	}
	
	public String showBrand(String bananaBrand , String appleBrand) { // method overloading
		return newBrand = bananaBrand.concat(appleBrand);
	}

}
