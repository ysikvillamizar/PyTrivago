package co.com.accenture.certificacion.trivago.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certificacion.trivago.questions.HotelState;
import co.com.accenture.certificacion.trivago.tasks.CheaperPrice;
import co.com.accenture.certificacion.trivago.tasks.InsertDataOfHotel;
import co.com.accenture.certificacion.trivago.tasks.InsertTermsOfHotel;
import co.com.accenture.certificacion.trivago.tasks.Navigate;
import co.com.accenture.certificacion.trivago.userinterfaces.OptionPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class SelectHotelStepDefinitions extends PageObject {

	  @Managed(driver = "chrome")
	    private WebDriver herBrowser = null;


	    @Before
	    public void setUp() {
	        OnStage.setTheStage(new OnlineCast());
	        OnStage.theActorCalled("Jessica").can(
	                BrowseTheWeb.with(herBrowser));
	    }
	
	
	    @Given("^that Jessica wants to look for a hotel reservation$")
	    public void thatJessicaWantsToLookForAHotelReservation() throws Throwable {
	    	theActorInTheSpotlight().wasAbleTo(Navigate.in(OptionPage.Trivago));
	    }
	    
	    @When("^She insert the data of the hotel$")
	    public void sheInsertTheDataOfTheHotel() throws Throwable {
	       	theActorInTheSpotlight().attemptsTo(InsertDataOfHotel.inThePage());
	       
	    }


	    @And("^she select type of accommodation and some hotel services$")
	    public void sheSelectTypeOfAccommodationAndSomeHotelServices() throws Throwable {
	        theActorInTheSpotlight().attemptsTo(InsertTermsOfHotel.in());
	    }

	    @And("^she select the cheaper price$")
	    public void sheSelectTheCheaperPrice() throws Throwable {
	    	theActorInTheSpotlight().attemptsTo(CheaperPrice.inThePage());
	    
	    }
	   
	   	    
	    @Then("^she should see the state of the hotel: Excelente, muy bueno, or bueno$")
	    public void sheShouldSeeTheStateOfTheHotelExcelenteMuyBuenoOrBueno() throws Throwable {
	    	theActorInTheSpotlight().should(seeThat(HotelState.Score()));
	    }

}
