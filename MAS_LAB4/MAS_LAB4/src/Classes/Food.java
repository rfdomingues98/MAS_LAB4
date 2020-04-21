package Classes;

public class Food {

	private double proteins;
	private double calories;
	private double weight;
	private boolean vegetarian = false;

	public double getProteins() {
		return this.proteins;
	}

	public void setProteins(double proteins) {
		this.proteins = proteins;
	}

	public double getCalories() {
		return this.calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean getVegetarian() {
		return this.vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public boolean equals(Food food) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}
