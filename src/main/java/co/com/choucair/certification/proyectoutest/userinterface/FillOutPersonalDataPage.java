package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutPersonalDataPage {

    public static final Target BUTTON_JOIN = Target.the("button get form registred")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("were we write the first name")
            .located(By.name("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("were we write the last name")
            .located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("were we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("were we select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("were we select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("were we select the birth year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));




}
