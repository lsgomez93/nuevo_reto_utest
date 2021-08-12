package co.com.choucair.certification.proyectoutest.stepdefinitions;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import co.com.choucair.certification.proyectoutest.question.Answer;
import co.com.choucair.certification.proyectoutest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDenifinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than Leidy wants fill out form to Register in the page Utest$")
    public void thanLeidyWantsFillOutFormToRegisterInThePageUtest() {
        theActorCalled("Leidy").wasAbleTo(OpenUpUtest.thePage());
    }

    @When("^she enter the data of the New User$")
    public void sheEnterTheDataOfTheNewUser(List<UtestData> utestData)throws Exception {
        theActorInTheSpotlight().attemptsTo(PersonalInformation.ToRegister(utestData.get(0)),
                Location.enter(utestData.get(0)),
                Device.toSelect(utestData.get(0)),
                SecurityInformation.define(utestData.get(0))
                );
    }
    @Then("^she gets the new user and show welcome page(.*)$")
    public void sheGetsTheNewUserAndShowWelcomePageWelcomeToTheWorldsLargestCommunityOfFreelanceSoftwareTesters(String question) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(question)));
    }
}
