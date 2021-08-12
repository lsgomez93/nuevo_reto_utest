package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {

    public static final Target SELECT_PC = Target.the("were we select your OS compute")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_PC = Target.the("were we write OS pc")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("button next location")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
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

}
