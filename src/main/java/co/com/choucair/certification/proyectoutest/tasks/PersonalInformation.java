package co.com.choucair.certification.proyectoutest.tasks;


import co.com.choucair.certification.proyectoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.proyectoutest.userinterface.PersonalInformationPage.*;

public class PersonalInformation implements Task {

    private UtestData utestData;

    public PersonalInformation(UtestData utestData) {
        this.utestData = utestData;
    }

    public static PersonalInformation ToRegister(UtestData utestData) {

        return Tasks.instrumented(PersonalInformation.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_JOIN),
                Enter.theValue(utestData.getStrFirsName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(utestData.getStrDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(utestData.getStrYear()).from(SELECT_YEAR)

        );
    }
}
