
public class PaperBook extends Book {
	private int stock;
	private float shippingWeight;
	
	public PaperBook(long isbn, String title, String author, int stock, float shippingWeight) {
		super(isbn, title, author);
		this.stock = stock;
		this.shippingWeight = shippingWeight;
	}

	public PaperBook(long isbn, String title, int stock, float shippingWeight) {
		super(isbn, title);
		this.stock = stock;
		this.shippingWeight = shippingWeight;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	
	

}
