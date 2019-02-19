package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CreateChrome;

public class UserRegistration {

  CreateChrome createChrome = new CreateChrome();
  private WebDriver navigator = createChrome.createChrome();

  @Given("^I click in menu \"([^\"]*)\"$")
  public void iClickInMenu() {

    navigator.findElement(By.linkText("Listar Usuários"));
  }

  @And("^I click in button name Novo$")
  public void iClickInButtonNameNovo() {
    navigator.findElement(By.xpath("//input[@value='Novo']"));
  }

  @When("^I fill all the fields\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
  public void iFillAllTheFields(String inscricao, String nome, String email, String telefone, String cep,
      String numero, String complemento, String login) {

    navigator.findElement(By.name("usuario[usu_inscricao]")).sendKeys(inscricao);
    navigator.findElement(By.name("usuario[usu_nome]")).sendKeys(nome);
    navigator.findElement(By.name("usuario[usu_email]")).sendKeys(email);
    navigator.findElement(By.name("usuario[usu_telefone]")).sendKeys(telefone);
    navigator.findElement(By.name("usuario[usu_cep]")).sendKeys(cep);
    navigator.findElement(By.xpath("//a[@title='Buscar']")).click();
    navigator.findElement(By.name("usuario[usu_numero]")).sendKeys(numero);
    navigator.findElement(By.name("usuario[usu_complemento]")).sendKeys(complemento);
    navigator.findElement(By.name("usuario[usu_login]")).sendKeys(login);

    navigator.findElement(By.cssSelector("form#frm_dados_usuario div:nth-child(2) > p > select")).click();
    navigator.findElement(By.xpath("//select[@name='usuario[per_id]']//option[@value='5'][contains(text(),'Operador')]")).click();

    navigator.findElement(By.xpath("//input[@id='btn_empresa_vincular_avancar']")).click();

  }
  @And("^I click in Avancar button$")
  public void iClickInAvancarButton() {
    navigator.findElement(By.cssSelector("#avancar"));
  }


  @And("^I click in Adicionar Area button$")
  public void iClickInAdicionarButton() {
    navigator.findElement(By.xpath("//tbody[@id='line_vincular_empresa']//a[@title='Adicionar'][contains(text(),'ico')]"));
  }


  @And("^I click in Avancar button again$")
  public void iClickInAvancarButtonAgain() {
    navigator.findElement(By.cssSelector("#avancar"));
  }

  @And("^I click in Adicionar Empresa button$")
  public void iClickInAdicionarEmpresaButton() {
    navigator.findElement(By.xpath("//tbody[@id='line_vincular_area']//tr[1]//td[1]//a[1]"));
  }

  @Then("^I click in Salvar button$")
  public void iClickInSalvarButton() {

    navigator.findElement(By.xpath("//div[@id='tab_vincular_area']//input[@value='Salvar']"));

  }

  @And("^the message \"([^\"]*)\" must to be show$")
  public void theMessageMustToBeShow(String arg0) throws Throwable {
    String successText = navigator.findElement(By.xpath("//div[@class='popup_text_alert']")).getText();
    Assert.assertNotNull("Operação Concluída com Sucesso.",successText);
  }
}

