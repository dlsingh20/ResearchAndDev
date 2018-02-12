package JavaClasses;

public class GetTaxes {

	public static void main(String[] args) {
		HotelTaxes ht = new HotelTaxes();
		CosmeticsTaxes ct = new CosmeticsTaxes();
		
		ht.getTaxRate();
		ct.getTaxRate();
	}
}
