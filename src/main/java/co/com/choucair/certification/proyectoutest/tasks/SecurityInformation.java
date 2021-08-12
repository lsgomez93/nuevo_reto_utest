package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.proyectoutest.userinterface.SecurityInformationPage.*;

public class SecurityInformation implements Task {

    private UtestData utestData;

    public SecurityInformation(UtestData utestData) {
        this.utestData = utestData;
    }

    public static SecurityInformation define(UtestData utestData) {

        return Tasks.instrumented(SecurityInformation.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(BUTTON_lAST_STEP),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getStrConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_USE),
                Click.on(CHECK_PRIVACITY),
                Click.on(BUTTON_COMPLETED)
        );
    }
}
