package Bank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StatementonEmail 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahavir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Mahavir/Downloads/JSandJasmineMiniProject-main/JSandJasmineMiniProject-main/JSMiniProject-main/JS/StatementsonEmail.html");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("customer")).sendKeys("2634");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("harshaca@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/div[4]/button")).click();
        Thread.sleep(3000);
	}
}
