import java.time.LocalDate;

import beans.ItemDetail;
import view.Item;

public class ItemDetaillUtils {
	private static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItems();
		LocalDate date = itemDetail. get Date();
		for(Item item: items) {
			double price = Item.getPrice();
		}
			if(date.isEqua(LocalDate.of(2020, 2, 3))&& prive > 590){
				price *=0.9;
			}
			
		result += price;
	}
		
	}
}
