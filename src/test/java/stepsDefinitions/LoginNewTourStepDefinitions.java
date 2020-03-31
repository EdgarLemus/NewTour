package stepsDefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static remoteDriver.RemoteWebDriver.chromeHisBrowserWeb;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import java.io.IOException;
import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ElementNotFound;
import models.Users;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import newTourPages.PrincipalPage;
import tasks.LogIn;
import utils.ExceptionError;

public class LoginNewTourStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^That user is on Homepage of New Tour$")
	public void thatUserIsOnHomepageOfNewTour() {
		theActorCalled("Users de NewTours")
				.can(with(chromeHisBrowserWeb().on("http://newtours.demoaut.com/")));
	}

	@When("^He registers in the system$")
	public void heRegistersInTheSystem(List<Users> dataUser) {
		theActorInTheSpotlight().attemptsTo(LogIn.withUser(dataUser.get(0).getUser()).andPassword(dataUser.get(0).getPassword()));
	}

	@Then("^He can to see the message (.*) in screen$")
	public void heCanToSeeTheMessageInScreen(String message) {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(PrincipalPage.TXT_VALIDATE.of(message)), WebElementStateMatchers.containsText(message)).orComplainWith(ElementNotFound.class, ExceptionError.messageErrorResponse(message)));
	}
}
