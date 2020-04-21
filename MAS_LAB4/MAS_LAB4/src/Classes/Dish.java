package Classes;

public class Dish {

	private String name;
	private Food[] composition;

	private double price;

	public Dish() {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food[] getComposition() {
		return this.composition;
	}

	public void setComposition(Food[] composition) {
		this.composition = composition;
	}

	public int compareTo(double calories) {
		throw new UnsupportedOperationException();
	}

	public boolean equals(Dish dish) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Dish(String name, Food[] composition, double price) {
		throw new UnsupportedOperationException();
	}
	
	public void deleteDish(Dish dish) {
		throw new UnsupportedOperationException();
	}

	public Dish selectDish(Dish dish) {
		throw new UnsupportedOperationException();
	}

	public void addIngredients(Food ingredient) {
		throw new UnsupportedOperationException();
	}

	public void removeIngredient(Food[] composition, Food ingredient) {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
