package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Register_Facebook{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
	
		
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstname']"));
		first_name.sendKeys("POOJA");
		
		WebElement sur_name=driver.findElement(By.xpath("//input[@name='lastname']"));
		sur_name.sendKeys("T");
		
		WebElement email_name=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email_name.sendKeys("poo99@gmail.com");
		
		WebElement Reemail_name=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Reemail_name.sendKeys("poo99@gmail.com");
		
		WebElement pswrd=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pswrd.sendKeys("poo9879hj");
		
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByVisibleText("24");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Aug");
		
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("2012");
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='1']"));////input[@name='sex']));
		gender.click();
		gender.sendKeys(Keys.ENTER);
		
			

	}

}
