package regressivo.demoqa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import regressivo.demoqa.elementos.Elementos;
import regressivo.demoqa.metodos.Metodos;
import regressivo.demoqa.runner.Executa;

public class Teste {
	
	Elementos el = new Elementos();
	
	@Given("que eu esteja na home page")
	public void que_eu_esteja_na_home_page() {
	   Executa.iniciarTeste();
	}

	@When("clicar menu elements")
	public void clicar_menu_elements() {
		Metodos.scroll("300");
	   Metodos.clicar(el.elements);
	}

	@When("clicar no submenu check box")
	public void clicar_no_submenu_check_box() {
	   Metodos.clicar(el.checkbox);
	}

	@Then("sistema exibe uma lista de submenu")
	public void sistema_exibe_uma_lista_de_submenu() {
	    Metodos.expandirSubmenu(el.expandirSubmenu);
	}
	

}
