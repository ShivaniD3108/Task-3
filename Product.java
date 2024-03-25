package task3;

public class Product implements Taxable{
	int pid;
	double price;
	int quantity;
	
	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return price*quantity*salesTaxPcn;
	}
}
