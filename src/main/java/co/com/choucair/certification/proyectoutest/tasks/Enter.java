package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectoutest.userinterface.EnterInformationDevicePage.*;

public class Enter implements Task {

    private UtestData utestData;

    public Enter(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Enter theInformationOfDevice(UtestData utestData) {

        return Tasks.instrumented(Enter.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_DEVICES),
                Click.on(SELECT_PC),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrOperatingSystem()).into(INPUT_PC),
                Hit.the(Keys.ENTER).into(INPUT_PC),
                Click.on(SELECT_PC_VERSION),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrVersionOperatingSystem()).into(INPUT_PC_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_PC_VERSION),
                Click.on(SELECT_LENGUAGE),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrLanguage()).into(INPUT_LENGUAGE_2),
                Hit.the(Keys.ENTER).into(INPUT_LENGUAGE_2),
                Click.on(SELECT_MOBILE_DEVICE),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrBrandMobil()).into(INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_DEVICE),
                Click.on(SELECT_MOBILE_MODEL),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrVersionMobil()).into(INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_MODEL),
                Click.on(SELECT_MOBILE_OS),
                net.serenitybdd.screenplay.actions.Enter.theValue(utestData.getStrOperatingSystemMobil()).into(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_OS)


        );
    }
}
