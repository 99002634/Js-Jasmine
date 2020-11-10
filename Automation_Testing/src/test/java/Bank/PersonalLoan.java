package Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalLoan 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahavir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Mahavir/Downloads/JSandJasmineMiniProject-main/JSandJasmineMiniProject-main/JSMiniProject-main/JS/PersonalLoans.html?name=&email=&phone=&gender=on&name=&name=&name=");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("name")).sendKeys("Harsha C.A");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("harsha@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("phone")).sendKeys("7996485901");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/div[4]/input[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("account")).sendKeys("9871321496320011");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.id("ifsc")).sendKeys("SHSBK0011");
        Thread.sleep(3000);
        driver.findElement(By.id("branch")).sendKeys("Kolar");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/button")).click();
        Thread.sleep(3000);
	}
}
