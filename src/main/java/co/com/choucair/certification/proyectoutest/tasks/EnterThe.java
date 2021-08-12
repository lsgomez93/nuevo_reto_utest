package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.proyectoutest.userinterface.EnterTheSecurityInformationPage.*;

public class EnterThe implements Task {

    private UtestData utestData;

    public EnterThe(UtestData utestData) {
        this.utestData = utestData;
    }

    public static EnterThe informationOfSecurity(UtestData utestData) {

        return Tasks.instrumented(EnterThe.class,utestData);
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
