package co.com.accenture.certificacion.trivago.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectPrice extends PageObject {
	public static final Target ORDER_BY=Target.the("Select order by").locatedBy("//*[@id='mf-select-sortby']");
	public static final Target ORDER_BY_PRICE=Target.the("Select order by price").locatedBy("//*[@value='2']");
	public static final Target PRICE_HOTEL=Target.the("Show the cheaper price of the hotel").locatedBy("(//*[@class=\"item__best-price price_min\"])[1]");
	public static final Target NAME_HOTEL = Target.the("Show the name of the hotel").locatedBy("(//*[@class=\"item-link name__copytext\"])[1]");

}

