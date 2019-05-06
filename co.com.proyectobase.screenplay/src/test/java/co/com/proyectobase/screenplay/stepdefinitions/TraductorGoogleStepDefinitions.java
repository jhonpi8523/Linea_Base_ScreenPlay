package co.com.proyectobase.screenplay.stepdefinitions;

import net.thucydides.core.annotations.Managed;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.java.Before;

public class TraductorGoogleStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor jhon = Actor.named("Jhon");
	
	@Before
	public void configuracionInicial()
	{
		jhon.can(BrowseTheWeb.with(hisBrowser));
	}
			
	@Given("^Que Jhon quiere usar el traductor de Google$")
	public void que_Jhon_quiere_usar_el_traductor_de_Google() throws Exception {
		jhon.wasAbleTo(Abrir.LaPaginaDeGoogle());
	}

	@When("^Jhon traduce la palabra (.*) de Ingles a Español$")
	public void jhon_traduce_la_palabra_Table_de_Ingles_a_Español(String palabra) {
		jhon.attemptsTo(Traducir.DeInglesAEspanol(palabra));
	}

	@Then("^Jhon deberia ver la palabra en español (.*) en la plantalla$")
	public void jhon_deberia_ver_la_palabra_en_español_en_la_plantalla(String palabraEsperada) {
		jhon.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));		
	}
}
