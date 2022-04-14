package MiniStore;

import java.util.List;
import java.util.ArrayList;

public class DataBase {
	
	private List<Product> Mevalar = new ArrayList<>();
	private List<Product> Sabzavotlar = new ArrayList<>();
	private List<Product> Ichimliklar = new ArrayList<>();
	private List<Product> Kitoblar = new ArrayList<>();
	
	public DataBase(){
		Mevalar.add(new Product("Olma", 10000));
		Mevalar.add(new Product ("Uzum", 12000));
		Mevalar.add(new Product ("Olcha", 17000));
		Mevalar.add(new Product ("Nok", 15000));
		Mevalar.add(new Product ("Behi", 18000));
		
		Sabzavotlar.add(new Product("Sabzi", 2500));
		Sabzavotlar.add(new Product("Lavlagi", 4000));
		Sabzavotlar.add(new Product ("Kartoshka", 3500));
		Sabzavotlar.add(new Product ("Karam", 4500));
		Sabzavotlar.add(new Product ("Bodring", 4000));
		
		Ichimliklar.add(new Product ("Coca-Cola", 9000));
		Ichimliklar.add(new Product ("Fanta", 10000));
		Ichimliklar.add(new Product ("Sprite", 9000));
		Ichimliklar.add(new Product ("Nestle", 3000));
		Ichimliklar.add(new Product ("Bonaqua", 3500));
		
		Kitoblar.add(new Product ("Ertak", 15000));
		Kitoblar.add(new Product ("She'rlar to'plami", 23000));
		Kitoblar.add(new Product ("Psixologik", 50000));
		Kitoblar.add(new Product ("Biznes", 65000));
		Kitoblar.add(new Product ("Lug'at", 10000));
		
	}
	public List<Product> getMevalar(){
		return Mevalar;
	}
	public List<Product> getSabzavotlar(){
		return Sabzavotlar;
	}
	public List<Product> getIchimliklar(){
		return Ichimliklar;
	}
	public List<Product> getKitoblar(){
		return Kitoblar;
	}

}
