package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home{
	
	WebDriver driver;
	
	By linkLogin = By.id("lnkCadastreSe"); 
	By produto = By.className("hproduct");
	
	public Home(WebDriver driver){

        this.driver = driver;

    }
	
	public void AbrirPaginaLogin()
	{
		driver.findElement(linkLogin).click();
	} 
	
	public void SelecionarProduto()
	{
		driver.findElement(produto).click();
	} 


}
