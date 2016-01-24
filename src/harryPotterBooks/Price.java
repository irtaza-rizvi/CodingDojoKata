package harryPotterBooks;

import java.util.ArrayList;
import java.util.HashSet;

public class Price {
	public double calculatePrice(int[] bas) {

		double price, discount = 0;
		HashSet<Integer> uniqueBooks = new HashSet<Integer>();
		ArrayList<Integer> uniqueTable = new ArrayList<Integer>();

		if (bas == null) {
			return 0;
		}

		do {
			uniqueBooks.clear();
			for (int i = 0; i < bas.length; i++) {
				if(bas[i]!=10&&uniqueBooks.add(bas[i])==true){
					bas[i]=10;
				}	
			}
			
			uniqueTable.add(uniqueBooks.size());
		} while (uniqueBooks.size() > 1);

		for (int i = 0; i < uniqueTable.size(); i++) {
			switch (uniqueTable.get(i)) {
			case 2:
				discount += (8 * 2) * (5.0 / 100);// 0.8
				break;
			case 3:
				if (i - 1 >= 0 && uniqueTable.get(i - 1) == 5) {
					discount += (8 * 4) * (20.0 / 100);// 6.4
				} 
				else {
					discount += (8 * 3) * (10.0 / 100);// 2.4
				}
				break;
			case 4:
				discount += (8 * 4) * (20.0 / 100);// 6.4
				break;
			case 5:
				if (i + 1 != uniqueTable.size() && uniqueTable.get(i + 1) == 3) {
					discount += (8 * 4) * (20.0 / 100);// 6.4
				} 
				else {
					discount += (8 * 5) * (25.0 / 100);// 10
				}
				break;
			}
		}

		price = (bas.length * 8) - discount;
		return price;
	}
}
