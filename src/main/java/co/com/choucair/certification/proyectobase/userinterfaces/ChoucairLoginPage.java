package co.com.choucair.certification.proyectobase.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage   {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the from to login").located(By.xpath("//header/div[1]/nav[1]/ul[2]/li[1]/a[1]"));
    public static final Target INPUT_USER = Target.the("Where do we write the user").located(By.xpath("//input[@id='username']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.xpath("//input[@id='password']"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(text(),'Acceder')]"));

}
