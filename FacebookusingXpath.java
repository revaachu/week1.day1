package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FacebookusingXpath {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("revathi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reva");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("revathimanickavelu95@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9790659068");
		WebElement day1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(day1);
		day.selectByVisibleText("18");
		WebElement month1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(month1);
		month.selectByVisibleText("Dec");
		WebElement year1 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(year1);
		year.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	}


