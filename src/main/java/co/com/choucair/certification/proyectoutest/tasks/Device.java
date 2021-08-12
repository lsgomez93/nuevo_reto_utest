package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import co.com.choucair.certification.proyectoutest.userinterface.DevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectoutest.userinterface.DevicePage.*;

public class Device implements Task {

    public static Device toSelect(UtestData utestData) {

        return Tasks.instrumented(Device.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_DEVICES),
                Click.on(SELECT_PC),
                Enter.theValue("Windows").into(INPUT_PC),
                Hit.the(Keys.ENTER).into(INPUT_PC),
                Click.on(SELECT_PC_VERSION),
                Enter.theValue("7").into(INPUT_PC_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_PC_VERSION),
                Click.on(SELECT_LENGUAGE),
                Enter.theValue("Spanish").into(INPUT_LENGUAGE_2),
                Hit.the(Keys.ENTER).into(INPUT_LENGUAGE_2),
                Click.on(SELECT_MOBILE_DEVICE),
                Enter.theValue("Alcatel").into(INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_DEVICE),
                Click.on(SELECT_MOBILE_MODEL),
                Enter.theValue("Crystal").into(INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_MODEL),
                Click.on(SELECT_MOBILE_OS),
                Enter.theValue("Android 7.0").into(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_OS)


        );
    }
}
