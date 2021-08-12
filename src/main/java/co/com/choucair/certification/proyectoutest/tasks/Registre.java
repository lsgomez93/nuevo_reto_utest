package co.com.choucair.certification.proyectoutest.tasks;


import co.com.choucair.certification.proyectoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectoutest.userinterface.RegistreLocationInformationPage.*;

public class Registre implements Task {
    private UtestData utestData;

    public Registre(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Registre theLocationData(UtestData utestData) {

        return Tasks.instrumented(Registre.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LOCATION),
                Enter.theValue(utestData.getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(utestData.getStrCodePostal()).into(INPUT_POSTAL_CODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(utestData.getStrCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY)
        );
    }
}
