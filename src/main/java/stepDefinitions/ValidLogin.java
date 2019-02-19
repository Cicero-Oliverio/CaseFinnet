package stepDefinitions;


import utils.CreateChrome;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ValidLogin {

  CreateChrome createChrome = new CreateChrome();
  private WebDriver navigator = createChrome.createChrome();

  @Given(value = "I am in the site http://showroom-painelfornecedor.finnet.com.br")
  public void iAmInTheSiteHttpShowroomPainelfornecedorFinnetComBr() {
    navigator.get("http://showroom-painelfornecedor.finnet.com.br");
  }

  @When(value = "I click on \"Acesso ao Cliente\"")
  public void iClickOn() {
    navigator.findElement(By.xpath("//span[@class='ajstdashboard']")).click();
  }

  @And("^i fill \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void iFillAndPassword(String usuario, String senha){
    navigator.findElement(By.name("txt_usuario")).sendKeys(usuario);
    navigator.findElement(By.name("txt_senha")).sendKeys(senha);
  }

  @And("^validate the captcha$")
  public void validateTheCaptcha() {

  }
}
