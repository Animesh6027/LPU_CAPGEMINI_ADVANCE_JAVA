/*Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

Requirements:

The Laptop class should have three instance variables:
brand (String)
ramSize (int)
price (double)

Implement the following constructors using constructor chaining (this()):

Default constructor that sets default values ("Unknown", 8GB, 50000.0).
Constructor with only brand (calls the default constructor).
Constructor with brand and ramSize (calls the constructor with brand).
Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

Create a printDetails() method to display laptop details.

In main(), create different Laptop objects using all constructors and print their details.*/


class Laptop {
	String brand;
	int ramSize;
	double price;

	Laptop(){
		this.brand = "unknown";
		this.ramSize = 8;
		this.price = 50000.0;
	}

	Laptop(String brand){
		this();
		this.brand = brand;
	}
	Laptop(String brand, int ramSize){
		this(brand);
		this.ramSize = ramSize;
	}

	Laptop(String brand, int ramSize, double price){
		this(brand, ramSize);
		this.price = price;
	}

	public void printDetails(){
		System.out.println("Brand: " + brand);
		System.out.println("Ram Size: " + ramSize + "GB");
		System.out.println("Price: " + price);
		System.out.println(" ");

	}

	public static void main(String[] args) {
		Laptop r1 = new Laptop();
		Laptop r2 = new Laptop("Dell");
		Laptop r3 = new Laptop("HP", 16);
		Laptop r4 = new Laptop("Asus", 12, 85000.0);

		r1.printDetails();
		r2.printDetails();
		r3.printDetails();
		r4.printDetails();
	}

}