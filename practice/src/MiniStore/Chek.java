package MiniStore;

import java.util.ArrayList;

public class Chek {

	private int umumiyQiymat;
	private Boolean tolanganlik;
	private ArrayList<Product> mahsulotlarRoyxati;

	public Chek(int umumiyQiymat, Boolean tolanganlik) {
		this.umumiyQiymat = umumiyQiymat;
		this.tolanganlik = tolanganlik;
	}

	public int getUmumiyQiymat() {
		return umumiyQiymat;
	}

	public Boolean getTolanganlik() {
		return tolanganlik;
	}

	public ArrayList<Product> getMahsulotlarRoyxati() {
		return mahsulotlarRoyxati;
	}

}
