package co.com.accenture.certificacion.trivago.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.accenture.certificacion.trivago.userinterfaces.SelectPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;


public class CheaperPrice implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
			
		actor.attemptsTo(Click.on(SelectPrice.ORDER_BY),
						 Click.on(SelectPrice.ORDER_BY_PRICE));
		System.out.println();
		System.out.println("Name of the hotel: " + Text.of(SelectPrice.NAME_HOTEL).viewedBy(actor).asString());
		System.out.println("Price of the hotel: " + Text.of(SelectPrice.PRICE_HOTEL).viewedBy(actor).asString());
 
	}
	
	public static CheaperPrice inThePage() {
		  return instrumented(CheaperPrice.class);
	}

}
