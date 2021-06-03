package co.com.choucair.certification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/aside[1]/section[1]/div[1]/div[1]/div[1]/center[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h4[1]/strong[1]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del error").located(By.className("errormessage"));

}