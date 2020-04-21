package Classes;

public class Client {

	private String name;
	private int nif;
	private String address;
	private int[] discounts;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNif() {
		return this.nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int[] getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(int[] discounts) {
		this.discounts = discounts;
	}
}
