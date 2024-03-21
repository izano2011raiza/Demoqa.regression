package regressivo.demoqa.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import regressivo.demoqa.drivers.Drivers;

public class Executa extends Drivers {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
}
