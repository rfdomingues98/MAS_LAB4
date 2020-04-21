package Classes;

public class Order {

	private Client client;
	private Menu[] orderMenu;
	private double price;

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Menu[] getOrderMenu() {
		return this.orderMenu;
	}

	public void setOrderMenu(Menu[] orderMenu) {
		this.orderMenu = orderMenu;
	}

	public Order(Client client, Dish[] orderMenu) {
		throw new UnsupportedOperationException();
	}

	public double calculatePrice(Client client, Menu[] orderMenu) {
		throw new UnsupportedOperationException();
	}
}
