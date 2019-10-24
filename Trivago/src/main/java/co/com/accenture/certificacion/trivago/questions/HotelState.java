package co.com.accenture.certificacion.trivago.questions;

import co.com.accenture.certificacion.trivago.userinterfaces.StateHotel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class HotelState implements Question<Boolean> {

	
	@Override
	public Boolean answeredBy(Actor actor) {
		String state=Text.of(StateHotel.TITLE_STATE).viewedBy(actor).asString();
		
		return (state.contains("Excelente ")||		
	        	state.contains("Muy bueno ") ||
	        	state.contains("Bueno "));
	}

	public static HotelState Score() {
	return new HotelState();
	}
	
	
	
}
