package co.com.choucair.certification.proyectoutest.stepdefinitions;

import co.com.choucair.certification.proyectoutest.model.PersonalData;
import co.com.choucair.certification.proyectoutest.question.Answer;
import co.com.choucair.certification.proyectoutest.tasks.OpenUp;
import co.com.choucair.certification.proyectoutest.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDenifinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Leidy wants fill out form to Register in the page Utest$")
    public void thanLeidyWantsFillOutFormToRegisterInThePageUtest() {
        OnStage.theActorCalled("Leidy").wasAbleTo(OpenUp.thePage());
    }

    @When("^she enter the data of the New User$")
    public void sheEnterTheDataOfTheNewUser(List<PersonalData> personalData)throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.thePage(personalData.get(0)));
    }
    @Then("^she gets the new user and show welcome page(.*)$")
    public void sheGetsTheNewUserAndShowWelcomePageWelcomeToTheWorldsLargestCommunityOfFreelanceSoftwareTesters(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
