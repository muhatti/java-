package komuverse;

//textual representation of how an object will look like in the memory
//Whatever we write in class is in actual the property of object as we are describing the object
class Product{
	//attributes
	int productId;
	String productName;
	int productPrice;
	
	//constructor
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	//methods (behavior)
	//to write data in Product Object we have this method
	void inputProductInfo(int productId, String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	//method to read product information
	void displayProductInfo() {
		System.out.println("--------Product ID: "+productId+"----------");
		System.out.println("Product Name:\t"+productName);
		System.out.println("Price:\t"+productPrice);
		System.out.println("-------------------------------------------");
	}
}	
public class InheritanceApp {
	//main is executed by JVM when my program will run
	
	public static void main(String args[]) {
		
	}
}
