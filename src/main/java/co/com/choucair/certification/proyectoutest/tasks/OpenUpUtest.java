package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpUtest implements Task {

    private UtestPage utestPage;

    public static OpenUpUtest thePage() {

        return Tasks.instrumented(OpenUpUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
