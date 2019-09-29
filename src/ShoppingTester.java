import java.time.LocalDate;
import java.util.List;

import controller.ListDetailHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.Shopper;

public class ShoppingTester {

	public static void main(String[] args) {
		Shopper bill = new Shopper("Bill");
		ShopperHelper sh = new ShopperHelper();
		sh.insertShopper(bill);
		List<Shopper> allShoppers = sh.showAllShoppers();
		for(Shopper a: allShoppers) {
		System.out.println(a.toString());
		}
	
		Shopper cameron = new Shopper("Cameron");
		ShopperHelper sh1 = new ShopperHelper();
		sh1.insertShopper(cameron);
		ListDetailHelper ldh = new ListDetailHelper();
		ListDetails cameronList = new ListDetails("Cameron's List",
		LocalDate.now(), cameron);
		ldh.insertNewListDetails(cameronList);
		List<ListDetails> allLists = ldh.getLists();
		for (ListDetails a : allLists) {
		System.out.println(a.toString());
		
		}
	
	}

	}


