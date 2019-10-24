package co.com.accenture.certificacion.trivago.models;

public class PrintData {

	
	private String NameHotel;
	private String PriceHotel;
	
	


	public PrintData(String nameHotel, String priceHotel) {
		this.NameHotel = nameHotel;
		this.PriceHotel = priceHotel;
	}


	public String getNameHotel() {
		return NameHotel;
	}


	public void setNameHotel(String nameHotel) {
		NameHotel = nameHotel;
	}


	public String getPriceHotel() {
		return PriceHotel;
	}


	public void setPriceHotel(String priceHotel) {
		PriceHotel = priceHotel;
	}
	
	
	
	
}

