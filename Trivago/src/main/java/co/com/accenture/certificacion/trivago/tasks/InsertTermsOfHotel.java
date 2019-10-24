package co.com.accenture.certificacion.trivago.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.accenture.certificacion.trivago.userinterfaces.FeatureHotelPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class InsertTermsOfHotel implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FeatureHotelPage.ACCOMMODATION),
						 Click.on(FeatureHotelPage.CHOOSE_ACCOMMODATION),
						 Click.on(FeatureHotelPage.CHOOSE_FILTER),
						 Click.on(FeatureHotelPage.HOTEL_SERVICES),
						 Click.on(FeatureHotelPage.SUNNY_CHAIRS),
						 Click.on(FeatureHotelPage.PALYGROUND_SERVICE),
						 Click.on(FeatureHotelPage.RESTAURANT_SERVICE),
						 Click.on(FeatureHotelPage.BUTTON_LISTO));
		
	}

	public static InsertTermsOfHotel in() {
		return instrumented(InsertTermsOfHotel.class);
	}
	
	

}
