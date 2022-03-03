package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
      driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 String leadpage=driver.getTitle();
	 System.out.println(leadpage);
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AR");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("revathi");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("manickavelu");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("achu");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Music lover");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathimanickavelu95@gmail.com");
	 
	 WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select province	=new Select(State);
	 province.selectByVisibleText("California");
	 
	 
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 String createLead =driver.getTitle();
	 System.out.println("createLead");
	 
      driver.findElement(By.linkText("Edit")).click();
	 WebElement description=driver.findElement(By.id("updateLeadForm_description"));
	 description.clear();
	 driver.findElement(By.id("updateLeadForm_description")).sendKeys("Learning in testleaf");
	 
       driver.findElement(By.className("smallSubmit")).click();
	 
	 String lead3 =driver.getTitle();
	 System.out.println("lead3");
	 
	 

	}

}
