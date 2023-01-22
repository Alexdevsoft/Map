package application;

import java.util.HashMap;
import java.util.Map;

import entities.Products;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Products, Double> stock = new HashMap<>();
		
		Products p1 = new Products("TV", 2000.00);
		Products p2 = new Products("Geladeira", 6000.00);
		Products p3 = new Products("Computador", 10000.00);
		
		stock.put(p1, 1000.00);
		stock.put(p2, 3000.00);
		stock.put(p3, 5000.00);
		
		Products product = new Products("TV", 2000.00);
		
		System.out.println("Contém 'produto' key: " + stock.containsKey(product));
	}

}
