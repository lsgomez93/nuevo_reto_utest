package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterTheSecurityInformationPage {

    public static final Target BUTTON_lAST_STEP = Target.the("button next location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
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
