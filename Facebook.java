package Automationtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(6000);

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(6000);

        driver.findElement(By.name("firstname")).sendKeys("Renuga");
        driver.findElement(By.name("lastname")).sendKeys("R");
        driver.findElement(By.name("reg_email__")).sendKeys("renugar2004@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@1234");

        driver.findElement(By.name("birthday_day")).sendKeys("16");
        driver.findElement(By.name("birthday_month")).sendKeys("sep");
        driver.findElement(By.name("birthday_year")).sendKeys("2004");

	}

}
