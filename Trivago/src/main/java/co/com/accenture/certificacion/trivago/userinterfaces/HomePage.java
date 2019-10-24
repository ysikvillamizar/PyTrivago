package co.com.accenture.certificacion.trivago.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

	public static final Target DESTINATION_CITY = Target.the("Select the destination city").located(By.id("querytext"));
	public static final Target CHOOSE_DESTINATION_CITY=Target.the("Select the destination city").located(By.id("suggestion-65524/200"));
	public static final Target CHOOSE_MONTH=Target.the("Select month").located(By.id("cal-heading-month"));
    public static final Target DATE_TARGET = Target.the("Click on the field").locatedBy("//*[@datetime='{0}']");
    public static final Target DATE_DEPARTURE = Target.the("Select the going field").locatedBy("//*[@datetime='{0}']");
    public static final Target SEARCH_BUTTON=Target.the("Click on the search button").locatedBy("//*[@class='search-button__label']");
   
	
}
