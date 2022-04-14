package Market2;

public class Products {
	
	private String nomi;
	private int narx;
	
//	Products pr = new Products(nomi, narx);
	
	
	public Products(String nomi , int narx) {
		this.nomi = nomi;
		this.narx=narx;
	}
	
	public void setName(String name) {
		this.nomi = name;
	}
	public String getName() {
		return nomi;
	}
	public int getPrice() {
		return narx;
	}
	public void setPrice(int price) {
		this.narx = price;
	}
	@Override
	public String toString() {
		return nomi + " " + narx + " so'm";
	}
	
}
