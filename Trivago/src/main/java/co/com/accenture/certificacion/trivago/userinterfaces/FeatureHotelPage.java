package co.com.accenture.certificacion.trivago.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FeatureHotelPage extends PageObject {
	public static final Target ACCOMMODATION=Target.the("Click on type of accommodation").locatedBy("//*[@class='toolbar-list__item toolbar-list__item--stars js-toolbar__item--stars js-toolbar-stars']");
	public static final Target CHOOSE_ACCOMMODATION = Target.the("Select the accommodation").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[2]/div/div/section/div/div/div[1]/div/ul/li[2]/button/span[1]");
	public static final Target CHOOSE_FILTER=Target.the("Click on filter ").locatedBy("(//*[@class='filter-item filter-item--select js-toolbar-hover-button'])[3]");
	public static final Target HOTEL_SERVICES= Target.the("Click on Hotel Services").locatedBy("(//*[@class='title'])[2]");
	public static final Target SUNNY_CHAIRS= Target.the("Select sunny chair").located(By.id("57/300-10"));
	public static final Target PALYGROUND_SERVICE=Target.the("Select bar service").located(By.id("250/300-6"));
	public static final Target RESTAURANT_SERVICE=Target.the("Select bar service").located(By.id("47/300-8"));
	public static final Target BUTTON_LISTO= Target.the("Click on the LISTO button").locatedBy("//*[@class='btn btn--small refinement-row__btn btn--primary']");
}

