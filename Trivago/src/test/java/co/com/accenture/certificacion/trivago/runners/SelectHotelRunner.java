package co.com.accenture.certificacion.trivago.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features="src\\test\\resources\\features\\select_hotel.feature",
		glue="co.com.accenture.certificacion.trivago.stepdefinitions",
		snippets= SnippetType.CAMELCASE
		)
public class SelectHotelRunner {

}
