package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UNIVERSITY= Target.the("button selected university choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE= Target.the("search course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO= Target.the("click search course").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECTED_COURSE = Target.the("da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));

}
