package polymorphism;

public class Price {
	
	int applePrice;
	
	int bananaPrice ;
	
	String appleBrand;
	
	String bananaBrand;
	
	public Price() {
	
	}
	
	
	public Price(int applePrice) {// constructor
		this.applePrice = applePrice;
	}
	public Price (int applePrice , int bananaPrice) {// constructor
		this.applePrice = applePrice;
		this.bananaPrice= bananaPrice;
	}
	

}
