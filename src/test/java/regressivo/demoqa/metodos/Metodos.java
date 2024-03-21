package regressivo.demoqa.metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import regressivo.demoqa.drivers.Drivers;

public class Metodos extends Drivers {

public static void	clicar(By elemento) {
	driver.findElement(elemento).click();
}

public static void scroll(String elemento) {
    WebElement footer = driver.findElement(By.tagName("footer"));
    int deltaY = footer.getRect().y;
    new Actions(driver)
            .scrollByAmount(0, deltaY)
            .perform();
}
public static void expandirSubmenu(By elemento) {
	driver.findElement(elemento).click();
}

}
