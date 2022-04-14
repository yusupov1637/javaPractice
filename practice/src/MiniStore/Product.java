package MiniStore;

public class Product {

	private String nomi;
	private int puli;

	public Product(String nomi, int puli) {
		this.nomi = nomi;
		this.puli = puli;
	}

	public String getNomi() {
		return nomi;
	}

	public void setNomi(String nomi) {
		this.nomi = nomi;
	}

	public int getPuli() {
		return puli;
	}

	public void setPuli(int puli) {
		this.puli = puli;
	}
	
	@Override
	public String toString() {
		return nomi + " " + puli + " so'm";
	}
 
}
