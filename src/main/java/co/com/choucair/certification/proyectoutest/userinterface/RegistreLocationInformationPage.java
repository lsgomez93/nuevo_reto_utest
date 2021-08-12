package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistreLocationInformationPage {

    public static final Target BUTTON_LOCATION = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
    public static final Target INPUT_CITY = Target.the("were we write the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("were we write the postal zone")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("select input pais")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("were we write the PAIS")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
}
