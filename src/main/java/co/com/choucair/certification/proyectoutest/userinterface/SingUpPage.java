package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUpPage {

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
    public static final Target INPUT_LANGUAGE = Target.the("were we write the language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/span]"));

    public static final Target BUTTON_LOCATION = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));

    public static final Target BUTTON_DEVICES = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));

    public static final Target SELECT_CITY = Target.the("were we write the city")
            .located(By.id("city"));
    public static final Target INPUT_CITY = Target.the("were we write the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_ZONE = Target.the("were we write the postal zone")
            .located(By.id("zip"));
    public static final Target SELECT_PAIS = Target.the("select input pais")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_PAIS = Target.the("were we write the PAIS")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target SELECT_PC = Target.the("were we select your OS compute")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_PC = Target.the("were we write OS pc")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_PC_VERSION = Target.the("were we select your compute")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]"));
    public static final Target INPUT_PC_VERSION = Target.the("were we select your compute")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_LENGUAGE = Target.the("were we select the lenguage")
            .located(By.cssSelector("#web-device .form-group:nth-child(3) .ui-select-toggle"));
    public static final Target INPUT_LENGUAGE_2 = Target.the("were we write the lenguage")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("were we select the mobile device")
            .located(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle[aria-label='Select Brand']"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("were we select the mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_MODEL = Target.the("were we select the mobile model")
            .located(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle[aria-label='Select a Model']"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("were we select the mobile model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_OS = Target.the("were we select the mobile os")
            .located(By.cssSelector("#mobile-device .btn.ui-select-toggle[aria-label='Select OS']"));
    public static final Target INPUT_MOBILE_OS = Target.the("were we select the mobile os")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_lAST_STEP = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next - final step']"));

    public static final Target INPUT_PASSWORD = Target.the("were we write your password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("were we write your confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("were we accept informesd")
            .located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target CHECK_TERMS_USE = Target.the("were we write accept terms use")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target CHECK_PRIVACITY = Target.the("were we write accept privacity")
            .located(By.xpath("//input[@id='privacySetting']"));

    public static final Target BUTTON_COMPLETED = Target.the("button complete form")
            .located(By.xpath("//a[@aria-label='Complete Setup']"));

    public static final Target NAME_MESSAGE_WELCOME = Target.the("")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
