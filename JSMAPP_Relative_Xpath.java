package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSMAPP_Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Downloads/learningHTML1.html");
		WebElement un=driver.findElement(By.xpath("(//input[@id='1'])"));
		un.sendKeys("pooja_t");
		Thread.sleep(2000);
		WebElement hint=driver.findElement(By.xpath("(//input[@id='2'])"));
		hint.sendKeys("Poo");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("(//input[@id='3'])"));
		pass.sendKeys("Growtech@bng41");
		Thread.sleep(2000);
		
		WebElement first_name=driver.findElement(By.xpath("(//input[@name='fname'])"));
		first_name.sendKeys("Pooja");
		Thread.sleep(2000);
		
		WebElement check=driver.findElement(By.xpath("(//input[@value='Boy'])"));
		check.click();
		Thread.sleep(2000);
		WebElement geneder=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		geneder.click();
		Thread.sleep(2000);
		WebElement relocate=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		relocate.click();
		Thread.sleep(2000);
		//WebElement submit=driver.findElement(By.xpath("(/html/body/form/input)[3]"));
		//submit.click();
		WebElement signup=driver.findElement(By.xpath("(//input[@value='Sign up'])"));
		signup.click();
		

	}

}
