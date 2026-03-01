package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu_item")
public class Menu {	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    private double price;
    private String category;
    private boolean available;

    public Menu() {}

	public Menu(String name, double price, String category, boolean available) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.available = available;
	}




	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Name: " + name +
               " | Price: " + price +
               " | Category: " + category +
               " | Available: " + available;
    }

	
}

