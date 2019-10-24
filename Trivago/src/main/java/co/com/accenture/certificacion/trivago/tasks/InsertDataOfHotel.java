package co.com.accenture.certificacion.trivago.tasks;
import co.com.accenture.certificacion.trivago.userinterfaces.HomePage;
import co.com.accenture.certificacion.trivago.utils.LoadDataExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertDataOfHotel implements Task {

LoadDataExcel lde= new LoadDataExcel();
String[] file=null;


	@Override
	public <T extends Actor> void performAs(T actor) {
		file= lde.leerExcel();
        System.out.printf(file[0]+file[1]+file[2]);
		actor.attemptsTo(Click.on(HomePage.DESTINATION_CITY),
				Enter.theValue(file[0]).into(HomePage.DESTINATION_CITY),
				Click.on(HomePage.CHOOSE_DESTINATION_CITY),
				Click.on(HomePage.DATE_TARGET.of(file[1])),
				Click.on(HomePage.DATE_DEPARTURE.of(file[2])),
				Click.on(HomePage.SEARCH_BUTTON));
		
	}

	public static  InsertDataOfHotel inThePage(){
        return instrumented( InsertDataOfHotel.class);
    }

}





