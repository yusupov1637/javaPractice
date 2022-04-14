package Market2;


import java.util.ArrayList;
import java.util.List;

import MiniStore.Product;

public class DataBase {


private	List<Products> mevalar = new ArrayList<>();
private	List<Products> ichimliklar = new ArrayList<>();
private	List<Products> sabzavotlar = new ArrayList<>();

		public void DataBase() {
			
			mevalar.add(new Products("Olma", 13000));
			mevalar.add(new Products("Limon", 30000));
			mevalar.add(new Products("Anor", 22000));
			
			ichimliklar.add(new Products("Coca Cola", 10000));
			ichimliklar.add(new Products("Fanta", 9000));
			ichimliklar.add(new Products("Pepsi", 11000));
			
			sabzavotlar.add(new Products("Sabzi", 3000));
			sabzavotlar.add(new Products("Bodring", 8000));
			sabzavotlar.add(new Products("Pomidor", 10000));
		}

		public List<Products> getMevalar(){
			return mevalar;
		}
		public List<Products> getIchimliklar(){
			return mevalar;
		}	
		public List<Products> getSabzavotlar(){
			return mevalar;
		}





}



