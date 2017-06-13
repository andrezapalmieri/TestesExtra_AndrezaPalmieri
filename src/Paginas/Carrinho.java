package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class Carrinho{
	
	WebDriver driver;

	By infoProdutoCarrinho = By.id("tdPrd"); 
	By removerProduto = By.id("lnkRemover"); 
	By mensagemCarrinhoVazio = By.className("innerCart");
	By botaoContinuarComprando = By.className("bt btContinuar");
	
	public Carrinho(WebDriver driver){

        this.driver = driver;
    }
	
	public void VerificarExibicaoDoProdutoNoCarrinho()
	{
		assertTrue(driver.findElement(infoProdutoCarrinho).isDisplayed());
	} 
	
	public void RemoverProdutoDoCarrinho()
	{
		driver.findElement(removerProduto).click();
	} 

	public void VerificarMensagemCarrinhoVazio()
	{
		assertTrue(driver.findElement(mensagemCarrinhoVazio).getText().contains("não há produtos em seu carrinho"));
	} 
	
	public void ClicarBotaoContinuarComprando()
	{
		driver.findElement(botaoContinuarComprando).click();
	} 
	
}