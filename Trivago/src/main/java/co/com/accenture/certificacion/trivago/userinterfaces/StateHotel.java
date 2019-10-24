package co.com.accenture.certificacion.trivago.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StateHotel extends PageObject{
	public static final Target TITLE_STATE=Target.the("See the state hotel").locatedBy("//*[@id=\\\"955157\\\"]/article/div[1]/div[2]/div/button/span[1]/span[2]");
			//.locatedBy("//*[@id=\"955157\"]/article/div[1]/div[2]/div/button/span[1]/span[2]/strong");
			
			//.locatedBy("(//*[@class='item__rating-number'])[1]");
	
}
