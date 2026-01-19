/*
A mobile phone can be initialized with default settings or custom settings.

Create class Mobile with:
	•	String brand
	•	int storage
	•	boolean is5G

Requirements:
	1.	Default constructor sets:
	•	brand = “Unknown”
	•	storage = 64
	•	is5G = false
	2.	Parameterized constructor sets all values.
	3.	Use this() to chain constructors.
*/

class Mobile{
	String brand;
	int storage;
	boolean is5G;

	Mobile(){
		this.brand = "unknown";
		this.storage = 64;
		this.is5G = true;
	}

	Mobile(String brand, int storage, boolean is5G){
		this();
		this.brand = brand;
		this.storage = storage;
		this.is5G = is5G;
	}
}

class Chaining{
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println("Brand: " + m1.brand);
		System.out.println("storage: " + m1.storage);
		System.out.println("is5G: " + m1.is5G);

		Mobile m2 = new Mobile("Apple", 256, true);

		System.out.println("Brand: " + m2.brand);
		System.out.println("storage: " + m2.storage);
		System.out.println("is5G: " + m2.is5G);
	}
}

