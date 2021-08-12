package co.com.choucair.certification.proyectoutest.tasks;


import co.com.choucair.certification.proyectoutest.model.PersonalData;
import co.com.choucair.certification.proyectoutest.userinterface.SingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class SingUp implements Task {

    private PersonalData personalData;

    public SingUp(PersonalData personalData) {
        this.personalData = personalData;
    }

    public static SingUp thePage(PersonalData personalData) {

        return Tasks.instrumented(SingUp.class,personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SingUpPage.BUTTON_JOIN),

                Enter.theValue(personalData.getStrFirsName()).into(SingUpPage.INPUT_FIRST_NAME),
                Enter.theValue(personalData.getStrLastName()).into(SingUpPage.INPUT_LAST_NAME),
                Enter.theValue(personalData.getStrEmail()).into(SingUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(personalData.getStrMonth()).from(SingUpPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(personalData.getStrDay()).from(SingUpPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(personalData.getStrYear()).from(SingUpPage.SELECT_YEAR),

                /*Enter.theValue("Spanish").into(SingUpPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_LANGUAGE),*/

                Click.on(SingUpPage.BUTTON_LOCATION),

                Enter.theValue("Popayan").into(SingUpPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).into(SingUpPage.INPUT_CITY),
                Enter.theValue("190001 ").into(SingUpPage.INPUT_POSTAL_ZONE),
                Click.on(SingUpPage.SELECT_PAIS),
                Enter.theValue("Colombia").into(SingUpPage.INPUT_PAIS),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_PAIS),
                Click.on(SingUpPage.BUTTON_DEVICES),

                Click.on(SingUpPage.SELECT_PC),
                Enter.theValue("Windows").into(SingUpPage.INPUT_PC),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_PC),

                Click.on(SingUpPage.SELECT_PC_VERSION),
                Enter.theValue("7").into(SingUpPage.INPUT_PC_VERSION),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_PC_VERSION),

                Click.on(SingUpPage.SELECT_LENGUAGE),
                Enter.theValue("Spanish").into(SingUpPage.INPUT_LENGUAGE_2),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_LENGUAGE_2),

                Click.on(SingUpPage.SELECT_MOBILE_DEVICE),
                Enter.theValue("Alcatel").into(SingUpPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_MOBILE_DEVICE),

                Click.on(SingUpPage.SELECT_MOBILE_MODEL),
                Enter.theValue("Crystal").into(SingUpPage.INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_MOBILE_MODEL),

                Click.on(SingUpPage.SELECT_MOBILE_OS),
                Enter.theValue("Android 7.0").into(SingUpPage.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(SingUpPage.INPUT_MOBILE_OS),

                Click.on(SingUpPage.BUTTON_lAST_STEP),

                Enter.theValue("w4b1TrtIShN4").into(SingUpPage.INPUT_PASSWORD),
                Enter.theValue("w4b1TrtIShN4").into(SingUpPage.INPUT_CONFIRM_PASSWORD),

                Click.on(SingUpPage.CHECK_STAY_INFORMED),
                Click.on(SingUpPage.CHECK_TERMS_USE),
                Click.on(SingUpPage.CHECK_PRIVACITY),

                Click.on(SingUpPage.BUTTON_COMPLETED)
        );
    }
}
